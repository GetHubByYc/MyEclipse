import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		// 创建一个ServerSocket,用于监听客户端Socket的连接请求
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(30789);
		// 采用循环不断接受来自客户端的请求
		while (true) {
			// 每当接受客户端Socket的请求时，服务器端也对应产生一个Socket3
			final Socket s = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			new Thread() {
				@Override
				public void run() {
					System.out.println("====连接成功======");
					try {
						InputStream is = s.getInputStream();
						
						byte[] buff = new byte[2048];
						int hasRead = -1;
						while ((hasRead = is.read(buff)) > 0) {
							System.out.println("接受数据："
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