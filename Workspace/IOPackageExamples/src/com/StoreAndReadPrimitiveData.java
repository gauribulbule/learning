package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoreAndReadPrimitiveData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		int id=100;
//		String name = "Raj";
//		float salary = 12000;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		System.out.println("store primitive data in file system");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id1 = dis.readInt();
		String name1 = dis.readUTF();
		float salary1 = dis.readFloat();
		System.out.println(id1+" "+name1+" "+salary1);
	}

}
