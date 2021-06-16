package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteBufferImg.jpg");
		
		byte[] buff = new byte[1024];
		int data;
		
		System.out.println("복사 시작");
		while(true) {
			data = in.read(buff);
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			out.write(buff);
		}
		
		out.close();
		in.close();
		
	}
}
