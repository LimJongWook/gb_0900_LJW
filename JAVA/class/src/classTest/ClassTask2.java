package classTest;

import java.util.Scanner;

public class ClassTask2 {
// 최대값, 최소값 구하기
	void getMaxAndMin(int[] arData, Result result) {
		result.max = arData[0];
		result.min = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(result.max > arData[i]) {result.max = arData[i];}
			if(result.max > arData[i]) {result.min = arData[i];}
		}
		
	}
	
//	학생번호, 국어점수, 영어점수, 수학점수를 입력 받은 후 총 합과 평균 구하기
	void totalAndAvg(Student student) {
		student.total += student.kor + student.eng +  student.math;
		student.avg = student.total / 3.0;
	}
	
	
	public static void main(String[] args) {
		Result result = new Result();
		Student student = new Student(1,40,20,60);
		ClassTask2 classTask2 = new ClassTask2();
//		int[] arData = {1, 5, 3, 7, 8};
		int[] score = new int[4];
		int[] result2 = new int[4];
		String[] arSubject = {"학생 번호","국어 점수", "영어 점수", "수학 점수"};
		
		
//		classTask2.getMaxAndMin(arData, result);
//		System.out.println(result.max);
//		System.out.println(result.min);
		
		
		
	}
	
}
