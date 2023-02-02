package com.project;
import java.util.*;
import java.io.*;
import java.net.*;
public class Server {
public static void main(String[] args) {
	try
	{
		ServerSocket ss=new ServerSocket(8080);
		System.out.println("Waiting for client.....");
		
		Socket socket=ss.accept();
		System.out.println("Server is connected....");
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(socket.getOutputStream());
		int i=0;
		while(i<10) {
			i++;
			System.out.println("Enter data : ");
			String data=sc.nextLine();
			pw.println(data);
			pw.flush();
		}
		socket.close();
		ss.close();
		sc.close();
		pw.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
