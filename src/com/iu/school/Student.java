package com.iu.school;

public class Student {
	//멤버변수 선언
	String name = "suzi";
	int num;
	int kor;
	int eng;
	int math;
	int total = kor + eng + math;
	double avg;
	//멤버메서드 선언
	
	String names[];//학생 이름을 저장할 배열
	int numbers[];//학생 번호를 저장할 배열
	int kors[];//학생 국어점수를 저장할 배열
	int engs[];//학생 영어점수를 저장할 배열
	int maths[];//학생 수학점수를 저장할 배열
	int totals;
}