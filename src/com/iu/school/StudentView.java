package com.iu.school;

public class StudentView {
	//listView
	//학생 정보 전체를 출력
	public void listView(Student [] students) {
		for(int i = 0; i < students.length ; i++) {
			System.out.println(i + 1 + "번째 학생의 이름 : " + students[i].name);
			System.out.println(i + 1 + "번째 학생의 번호 : " + students[i].num);
			System.out.println(i + 1 + "번째 학생의 국어 성적 : " + students[i].kor);
			System.out.println(i + 1 + "번째 학생의 수학 성적 : " + students[i].math);
			System.out.println(i + 1 + "번째 학생의 영어 성적 : " + students[i].eng);
		}
	}
	//view
	//한 명의 학생 정보를 출력
	public void view(int i, Student [] students) {
		System.out.println(i + 1 + "번 학생의 이름 : " + students[i].name);
		System.out.println(i + 1 + "번 학생의 번호 : " + students[i].num);
		System.out.println(i + 1 + "번 학생의 국어 성적 : " + students[i].kor);
		System.out.println(i + 1 + "번 학생의 수학 성적 : " + students[i].math);
		System.out.println(i + 1 + "번 학생의 영어 성적 : " + students[i].eng);
	}
}