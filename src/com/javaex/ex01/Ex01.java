package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("D:\\JavaStudy\\file\\img.jpg");	// 파일이 없을 수도 있을 것을 대비하여 "throws IOException"
		OutputStream out = new FileOutputStream("D:\\JavaStudy\\file\\byte.jpg");
		
		System.out.println("복사 시작");
		while(true) {
			int data = in.read();	// 한모금씩 파일 빨기 시작, 얘의 리턴형은 숫자임
			if (data == -1) {		// data가 -1이 되면 반복문 중지
				System.out.println("복사 끝, data value: " + data);
				break;
			}
			out.write(data);		// 한모금씩 파일 빤거 한모금씩 뱉기
		}
		out.close();	// OutputStream 빨대 끊기
		in.close();		// InputStream 빨대 끊기

	}

}
