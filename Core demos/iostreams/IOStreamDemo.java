package com.coreproject.demos.iostreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream fout=new FileOutputStream("A.txt"); String
		 * str="This is my file's content"; fout.write(str.getBytes());
		 * System.out.println("Data is Written"); fout.close();
		 */
		/*
		 * int i; FileInputStream fin=new FileInputStream("A.txt");
		 * while((i=fin.read())!=-1) System.out.print((char)i);
		 */
		
		FileInputStream fin=new FileInputStream("A.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		System.out.println(br.readLine());
		fin.close();

	}
}
