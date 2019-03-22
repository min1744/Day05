package com.iu.school;

import java.util.Random;
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
			System.out.print("이름 : ");
			st.name = sc.next();
			System.out.print("번호 : ");
			st.num = sc.nextInt();
			students[i] = st;
		}
		for(int i = 0; i < count; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
		}
	}
}