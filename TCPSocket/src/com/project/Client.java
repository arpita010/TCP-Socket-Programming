package com.project;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket client=new Socket("localhost",8080);
			System.out.println("Client is accepted...");
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			int i=0;
			while(i<10)
			{
				i++;
				String data=br.readLine();
				System.out.println(data);
			}
			client.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
