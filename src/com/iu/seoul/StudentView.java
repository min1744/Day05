package com.iu.seoul;

public class StudentView {
	
	//listView
	//학생정보 전체를 출력
	public void listView(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
			Student student = students[i];
			System.out.println("이름 : "+student.name);
			System.out.println("번호 : "+student.num);
			System.out.println("국어 : "+student.kor);
			System.out.println("영어 : "+student.eng);
			System.out.println("수학 : "+student.math);
			System.out.println("총점 : "+student.total);
			System.out.println("평균 : "+student.avg);
		}
	}
	//view
	//한명의 학생정보를 출력
	public void view(Student student) {
		System.out.println("이름 : "+student.name);
		System.out.println("번호 : "+student.num);
		System.out.println("국어 : "+student.kor);
		System.out.println("영어 : "+student.eng);
		System.out.println("수학 : "+student.math);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+student.avg);
	}

}