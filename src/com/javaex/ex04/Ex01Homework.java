package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex01Homework {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStreamWriter ow = new OutputStreamWriter(System.out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(ow);
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			String[] strArray = str.split(",");		// ","로 구분하여 strArray 배열에 넣기
			
			for(int i=0; i<strArray.length; i++) {	// strArrary 배열 크기만큼 반복하여 뿌리기.
//				bw.write("strArray["+i+"]"+strArray[i]);
//				bw.newLine();
				if(i==0) {
					bw.write("이  름 : "+strArray[i]);
					bw.newLine();
				} else if(i==1) {
					bw.write("핸드폰 : "+strArray[i]);
					bw.newLine();
				} else if(i==2) {
					bw.write("회  사 : "+strArray[i]);
					bw.newLine();
					bw.newLine();
				}
			}
		}
		bw.close();
		br.close();
	}

}
