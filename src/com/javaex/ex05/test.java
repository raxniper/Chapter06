package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class test {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("D:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		Writer fw = new FileWriter("D:\\JavaStudy\\file\\new\\New_PhoneDB.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
		
//		Writer fw = new FileWriter("D:\\JavaStudy\\file\\song.txt");
//		BufferedWriter bfw = new BufferedWriter(fw);
		
		
		
//		while(true) {
//			String str = br.readLine();
//			
//			if (str == null) {
//				break;
//			}
//
//			String[] strArray = str.split(",");
//			
//			for(int i=0; i<strArray.length; i++) {
//				if(i==0) {
//					bw.write(strArray[i]);
//					bw.newLine();
//				} else if(i==1) {
//					bw.write(strArray[i]);
//					bw.newLine();
//				} else if(i==2) {
//					bw.write(strArray[i]);
//					bw.newLine();
//				}
//			}
//		}
//		String str2 = "";
		
		while(true) {
			String str = br.readLine();
			
			if (str == null) {
				System.out.println("자료입력이 완료되었습니다.");
				break;
			}
			
			bfw.write(str);
			bfw.newLine();
			System.out.println("자료 입력중입니다.");
		}
		
		bfw.close();
		br.close();
		
	}

}
