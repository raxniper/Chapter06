package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01FileWriter {

	public static void main(String[] args) throws IOException {
		
		// 빨대 꽂기
		Writer fw = new FileWriter("D:\\JavaStudy\\file\\song.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
		
		// write값 입력
		bfw.write("학교종이 땡땡땡");
		bfw.newLine();	// 라인 변경 (enter)
		bfw.write("무궁화꽃이 피었습니다.");
		bfw.newLine();
		bfw.write("떳다떳다 비행기 날아라 날아라");
		bfw.newLine();
		
		// 빨대 끊기
		bfw.close();
	}
}
