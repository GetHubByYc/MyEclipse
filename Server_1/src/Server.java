import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// ����һ��ServerSocket,���ڼ����ͻ���Socket����������
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(30789);
		// ����ѭ�����Ͻ������Կͻ��˵�����
		while (true) {
			// ÿ�����ܿͻ���Socket������ʱ����������Ҳ��Ӧ����һ��Socket3
			final Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			new Thread() {
				@Override
				public void run() {
					System.out.println("====���ӳɹ�======");
					try {
						InputStream is = s.getInputStream();
						
						byte[] buff = new byte[2048];
						int hasRead = -1;
						while ((hasRead = is.read(buff)) > 0) {
							System.out.println("�������ݣ�"
									+ new String(buff, 0, hasRead, "utf-8"));
							
						}

					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}

			}.start();

			OutputStream os;
			os = s.getOutputStream();
			new Thread() {
				@Override
				public void run() {
					
					try {
						while(true){
							String rd = br.readLine()+"\n";
							os.write(rd.getBytes());
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}.start();

			
		}
	}
}