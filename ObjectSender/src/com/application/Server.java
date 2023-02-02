package com.application;
import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
public static void main(String[] args) {
	try {
	ServerSocket ss=new ServerSocket(8080);
	Socket server=ss.accept();
	InputStream is=server.getInputStream();
	ObjectInputStream ois=new ObjectInputStream(is);
	User user1=(User)ois.readObject();
	if(user1!=null)System.out.println(user1.getId()+" "+user1.getName());
	System.out.println((String)ois.readObject());
	ois.close();
	is.close();
	server.close();
	ss.close();
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
