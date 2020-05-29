package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01ArrayEdit {

	public static void main(String[] args) throws IOException{
		
		// 빨아들이기 Input
		InputStream in = new FileInputStream("D:\\JavaStudy\\file\\img.jpg");
		BufferedInputStream buffIn = new BufferedInputStream(in);		// (in)은 InputStream in과 연결하는 것임, 얘는 섞어쓰기 아님
		
		// 뱉어내기 Output
		OutputStream out = new FileOutputStream("D:\\JavaStudy\\file\\byteBuff.jpg");
		BufferedOutputStream buffOut = new BufferedOutputStream(out);	// (out)은 OutputStream out과 연결하는 것임, 얘는 섞어쓰기 아님
		
//		기존방식
//		byte[] buff = new byte[1024];	// 1024바이트 사이즈로 된 배열(쟁반)을 생성, read()를 바이트형으로 사용하려고 바이트로 만듬
		
		// 복사 반복문
		System.out.println("복사 시작");
		while(true) {
//			기존 방식
//			int data = in.read(buff);
//			if (data == -1) {
//				System.out.println("복사 끝, data value: " + data);
//				break;
//			}
//			out.write(buff);
			
//			바뀐 방식
			int data = buffIn.read();
			if(data==-1) {
				System.out.println("복사 끝, data value: " + data);
				break;
			}
			buffOut.write(data);
		}
		buffOut.close();
		buffIn.close();

	}

}
