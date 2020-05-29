package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03FileReaderUTF8 {

	public static void main(String[] args) throws IOException {
		
//		문제점 : 한글이 깨짐. UTF-8로 변환하여야 함
//		기존방식
//		Reader fr = new FileReader("D:\\JavaStudy\\file\\MS949.txt");
//		BufferedReader bfr = new BufferedReader(fr);
//		
//		while(true) {
//			String str = bfr.readLine();
//			if(str == null) {
//				break;
//			}
//			System.out.println(str);
//		}
//		
//		bfr.close();
		
//		새로운 방식
		InputStream in = new FileInputStream("D:\\JavaStudy\\file\\MS949.txt");
		InputStreamReader ir = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}
}
