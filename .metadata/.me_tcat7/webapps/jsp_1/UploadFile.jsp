<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page
	import="org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory"%>

<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>

<%@ page import="org.apache.commons.fileupload.disk.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.*"%>
<%@ page import="org.apache.commons.io.output.*"%>
<%@ page import=" java.text.SimpleDateFormat,java.util.Calendar"%>

<%
	File file;
	int maxFileSize = 5000 * 1024;
	int maxMemSize = 5000 * 1024;
	ServletContext context = pageContext.getServletContext();
	String filePath = context.getInitParameter("file-upload");
	String contentType = request.getContentType();
	if ((contentType.indexOf("multipart/form-data") >= 0)) {
		org.apache.commons.fileupload.disk.DiskFileItemFactory factory = new org.apache.commons.fileupload.disk.DiskFileItemFactory();
		factory.setSizeThreshold(maxMemSize);
		factory.setRepository(new File("d:\\temp"));
		ServletFileUpload upload = new ServletFileUpload();
		upload.setFileItemFactory(factory);
		upload.setSizeMax(maxFileSize);
		try {
			List fileItems = upload.parseRequest(request);
			Iterator i = fileItems.iterator();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>JSP File upload</title>");
			out.println("</head>");
			out.println("<body>");
			while (i.hasNext()) {
				FileItem fi = (FileItem) i.next();
				if (!fi.isFormField()) {
					String filedName = fi.getFieldName();
					String fileName = fi.getName();
					boolean isInMemory = fi.isInMemory();

					if (fileName.lastIndexOf("\\") > 0) {
						file = new File(filePath,
								fileName.substring(fileName
										.lastIndexOf("\\")));
					} else {
						SimpleDateFormat formatter = new SimpleDateFormat(
								"MMMMM_d_yyyy_HH_mm_ss", Locale.ENGLISH);
						Date currentTime = new Date();
						String pre_fix = formatter
								.format(currentTime);
						fileName = pre_fix+fileName;
				        
						file = new File(filePath,
								fileName.substring(fileName
										.lastIndexOf("\\") + 1));
						fi.write(file);
						out.println("Uploaded FileName: " + filePath
								+ fileName + "<br/>");
					}

				}
				out.println("</body>");
				out.println("</html>");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} else {
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet upload</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>No file uploaded</p>");
		out.println("</body>");
		out.println("</html>");
	}
%>
