package com.coreproject.demos.oops;

import java.io.IOException;

public class ProcessBuilderDemo {

	public static void main(String[] args) {
		//ProcessBuilder pb=new ProcessBuilder("calc.exe");
		ProcessBuilder pb=new ProcessBuilder("cmd.exe","/C","start");
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pb);
	}
}
