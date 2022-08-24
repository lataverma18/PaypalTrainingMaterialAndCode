package com.corejava.demo;

import java.io.IOException;

public class ProcessBuilderDemo {

	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder("calc.exe");
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pb);
	}
}
