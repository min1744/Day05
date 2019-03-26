package com.iu.seoul;

import java.util.Scanner;

public class StudentInput {
	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int select = sc.nextInt();
		Student [] students = new Student[select];

		for(int i=0;i<students.length;i++) { 
			Student student = new Student();
			System.out.print("이름 입력 : ");
			student.name = sc.next();
			System.out.print("번호 입력 : "); 
			student.num = sc.nextInt();
			System.out.print("국어성적 입력 : "); 
			student.kor = sc.nextInt();
			System.out.print("영어성적 입력 : "); 
			student.eng = sc.nextInt();
			System.out.print("수학성적 입력 : "); 
			student.math = sc.nextInt(); 
			student.total =	student.kor+student.eng+student.math; 
			student.avg = student.total/3.0;
			students[i]=student; 
		}
		return students;
	}
}