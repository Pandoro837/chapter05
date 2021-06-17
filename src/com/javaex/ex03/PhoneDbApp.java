package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDbApp {

	public static void main(String[] args) throws IOException {

		List<PhoneDb> pList = new ArrayList<PhoneDb> ();
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDb.txt");//PhonDb의 데이터를 받음
		BufferedReader br = new BufferedReader(fr);	
		
		String str = new String();
		
		while(true) {
			str = br.readLine();	//str에 불러온 값을 저장
			
			if(str != null) {
				PhoneDb PhoneDb = new PhoneDb(str);	//str로 PhoneDb의 객체 생성
				pList.add(PhoneDb);					//해당 객체를 리스트에 추가
			} else {	
				br.close();
				break;
			}
		}
		
		for(PhoneDb phoneInfo : pList) {		//리스트의 showInfo를 출력
			phoneInfo.showInfo();		
		}
		
		Scanner sc = new Scanner(System.in);
	
//		PhoneDb myPhone = new PhoneDb("최영교,010-9999-9999,02-9999-9999");	
//		pList.add(myPhone);						//리스트에 내 정보 추가
		
		while(true) {
			System.out.println("정보를 입력해주세요(q = 종료)");
			String str2 = sc.nextLine();
			
			if(str2.equals("q")) {
				break;
			} else {
				PhoneDb myPhone = new PhoneDb(str2);	
				System.out.println("몇번째에 저장하시겠습니까");
				int i = sc.nextInt();
				sc.nextLine();
				pList.add(i, myPhone);
			}
			
		}
		sc.close();
		
		Writer wr = new FileWriter("C:\\javaStudy\\file\\PhoneDb2.txt");	//PhoneDb2에 저장
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(PhoneDb phoneInfo : pList) {		//PhoneDb2에 출력
			bw.write(phoneInfo.outputDb());
		}
		
		bw.close();
		
		
	}

}
