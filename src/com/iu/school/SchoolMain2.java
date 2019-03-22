package com.iu.school;

import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Student str1 = new Student();
		//Student str2 = new Student();
		//n명의 학생 객체를 생성해서 이름과 번호를 입력 후 출력
		System.out.print("학생의 수 : ");
		int count = sc.nextInt();
		Student st = null;
		Student [] students = new Student[count];
		for(int i = 0; i < count; i++) {
			st = new Student();
			System.out.print(i + 1 + "번째 학생의 이름 : ");
			st.name = sc.next();
			System.out.print(i + 1 + "번째 학생의 번호 : ");
			st.num = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 국어점수 : ");
			st.kor = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 영어점수 : ");
			st.eng = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 수학점수 : ");
			st.math = sc.nextInt();
			students[i] = st;
		}
		for(int i = 0; i < count; i++) {
			System.out.println("이름 : " + students[i].name);
			System.out.print("번호 : " + students[i].num + "\t");
			System.out.print("국어점수 : " + students[i].kor + "\t");
			System.out.print("영어점수 : " + students[i].eng + "\t");
			System.out.println("수학점수 : " + students[i].math);
		}
	}
}