import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class CTChinh_ChuyenDoiSo {
	public static void main(String[] args) throws IOException {
		
		ServerSocket socketServer = new ServerSocket(1111);
		System.out.print("Tôi lắng nghe trong cổng 1111  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			
			ChuyenDoiSo_Server luongTask = new ChuyenDoiSo_Server(s, id);
			luongTask.start();
		}
	}
}
