package jy.java.exam13;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import jy.java.common.Protocol;

public class ProtocolClient {
	Socket socket = null; BufferedReader br = null;
	BufferedWriter bw = null; BufferedReader keyboard = null;
	public ProtocolClient() {
		try{
			//소켓 생성
			socket = new Socket("localhost", 5000);
		}catch(UnknownHostException e){
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}catch(IOException e){
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}
		try{
			//Keyboard 와 연결된 스트림 얻기
			keyboard = new BufferedReader(
					new InputStreamReader(System.in));
			//socket 으로부터 Stream 얻기
			bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			br=new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			//서버와 메세지 주고 받기
			while(true){
				//키보드 입력내용 읽기
				String msg = keyboard.readLine();
				/* 키보드 메세지 입력 예
				 * 100:아이디 => 입장
				 * 200:아이디 => 퇴장
				 * 300:아이디:메세지 => 대화방에 접속한 모든 사람들에게 메세지 전달
				 * 400:아이디1:아이디2:메세지 => 아이디1이 아이디2에게 귓속말
				 */
				//메세지 서버로 전송
				bw.write(msg + "\n");
				bw.flush();
				String[] words = msg.split(":");
				//서버가 전송한 메세지 수신
				String getMsg = br.readLine();
				System.out.println(getMsg);
				//200번일 경우 퇴장하기
				Protocol protocol = new Protocol();
				if(words[0].equals(protocol.EXIT)){
					throw new IOException();
				}
			}
		}catch(IOException e){
			System.out.println("서버와의 연결이 끊어졌습니다.");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new ProtocolClient();
	}
}
