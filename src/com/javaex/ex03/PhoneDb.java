package com.javaex.ex03;

public class PhoneDb {

	private String name, hp, company;
	
	public PhoneDb(String _info) {	//읽어들인 정보를 ","를 기준으로 분할, 배열 생성 후 값 입력
		String[] info = _info.split(",");
		
		name = info[0];
		hp = info[1];
		company = info[2];
	}
	
	public void showInfo() {		//객체의 값을 출력
		System.out.println("이름:" + name);
		System.out.println("핸드폰:" + hp);
		System.out.println("회사:" + company + "\n");
	}
	
	public String outputDb() {		//객체의 값을 string 형태로 변환 -> Writer로 txt 파일화
		String db = name + "," + hp + "," + company + "\n"; 
		return db;
	}
	
}
