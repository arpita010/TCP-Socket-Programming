package com.application;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
public static void main(String[] args) {
	User user=new User(1,"Arpita Mittal");
	try
	{
		Socket client=new Socket("localhost",8080);
		OutputStream os=client.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(user);
		oos.writeObject(new String("Another object from client"));
		oos.close();
		os.close();
		client.close();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
