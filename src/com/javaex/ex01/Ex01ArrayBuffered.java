package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01ArrayBuffered {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("D:\\JavaStudy\\file\\img.jpg");	// 파일이 없을 수도 있을 것을 대비하여 "throws IOException"
		OutputStream out = new FileOutputStream("D:\\JavaStudy\\file\\buff.jpg");
		
		byte[] buff = new byte[1024];	// 1024바이트 사이즈로 된 배열(쟁반)을 생성, read()를 바이트형으로 사용하려고 바이트로 만듬
		
		System.out.println("복사 시작");
		while(true) {
			int data = in.read(buff);
			System.out.println(".");
			if (data == -1) {
				System.out.println("복사 끝, data value: " + data);
				break;
			}
			out.write(buff);
		}
		out.close();
		in.close();

	}

}
