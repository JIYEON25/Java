package jy.java.exam14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	private ArrayList<MultiServerThread> list;
	private Socket socket;
	public MultiServer()throws IOException{
		list = new ArrayList<MultiServerThread>();
		ServerSocket serverSocket = new ServerSocket(5000);
		MultiServerThread mst = null;
		boolean isStop = false;
		while(!isStop){
			System.out.println("Server Ready");
			socket = serverSocket.accept();
			mst = new MultiServerThread(this);
			list.add(mst);
			Thread t = new Thread(mst);
			t.start();
		}
	}
	public ArrayList<MultiServerThread> getList(){
		return list;
	}
	public Socket getSocket(){
		return socket;
	}
	public static void main(String[] ar)throws IOException{
		new MultiServer();
	}
}
