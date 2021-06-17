package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {
// txt 파일을 읽어서 화면에 출력
	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
//		Reader fr = new FileReader("C:\\javaStudy\\file\\MS949.txt");
//		UTF-8이 아닐 경우, 내용을 올바르게 인식하지 못한다
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();	//한줄 씩 읽어온다
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		
	}

}
