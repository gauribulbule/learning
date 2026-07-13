package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterWiseExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Maven Plugins.txt");
		BufferedReader br = new BufferedReader(fr,1024);		// in buffer size 
		
		FileWriter fw = new FileWriter("mavenDemo.docx");
		BufferedWriter bw = new BufferedWriter(fw, 2);		// out buffer size 
		//String data;
//		while((data=br.readLine())!=null) {
//			//System.out.println(data);
//			bw.write(data);		// buffer 
//		}
		int ch;
		while((ch=br.read())!=-1) {
			//System.out.println(data);
			bw.write(ch);		// buffer 
		}
		//bw.flush();  // send data to output file 
		System.out.println("File copied");
		fr.close();
		br.close();
		fw.close();
		bw.close();
	}

}
