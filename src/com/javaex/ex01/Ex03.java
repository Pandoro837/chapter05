package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteBufferedImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int data;
		
		System.out.println("복사 시작");
		
		while(true) {
			data = bin.read();
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			
			bout.write(data);
		}
		
		bout.close();	//IOStream 모두 클로즈 해주어야 한다
		bin.close();	//buffered Stream의 경우, Buffered Stream을 클로즈하면, 일반 IOStream은
						//함께 클로즈된다

	}

}
