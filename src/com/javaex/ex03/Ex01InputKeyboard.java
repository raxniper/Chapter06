package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01InputKeyboard {

	public static void main(String[] args) throws IOException{
		
		
		// 키보드로 입력받은 값 파일로 만들기
		// 앞전에 파일 MS949.txt를 입력했던 것 대신에 키보드를 붙여주면 된다.
		
		// System.in : 키보드와 연결하는 것 : 키보드 메소드는 static으로 system에 이미 메모리에 넣어져있다.
		InputStreamReader ir = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(ir);
		
		// Scanner sc = new Scanner(System.in)
		// String str = sc.nextLine();
		String str = br.readLine();
		
		
//		System.out.println(str);
		
		// System.out
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);
		
		// 모니터에 내보내기 (써라)
		bw.write(str);
//		System.out.println(str);

		bw.close();
		br.close();
	}

}
