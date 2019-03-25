package com.iu.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teacher iu = new Teacher();
		boolean check = true;
		StudentView sv = new StudentView();
		
		System.out.print("선생님의 이름을 입력하세요 : ");
		iu.name = sc.next();
		System.out.print("선생님의 과목명을 입력하세요 : ");
		iu.subject = sc.next();
		
		while(check) {
			System.out.println("1. 학생의 정보 입력\t2. 전체 정보 출력\t3. 학생 정보 검색\t4. 프로그램 종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print(iu.name + "선생님의 학생 수 : ");
				select = sc.nextInt();
				iu.students = new Student[select];
				for(int i = 0; i < select ; i++) {
					Student student = new Student();
					System.out.print("학생의 이름 : ");
					student.name = sc.next();
					System.out.print("학생의 번호 : ");
					student.num = sc.nextInt();
					System.out.print("학생의 국어 성적 : ");
					student.kor = sc.nextInt();
					System.out.print("학생의 수학 성적 : ");
					student.math = sc.nextInt();
					System.out.print("학생의 영어 성적 : ");
					student.eng = sc.nextInt();
					student.totals = student.kor + student.eng + student.math;
					student.avg = student.avg / 3.0;
					iu.students[i] = student;
				}
			}else if(select == 2) {
				if(iu.students != null) {
					sv.listView(iu.students);
				}else
					System.out.println("데이터가 존재하지 않습니다.");
			}else if(select == 3) {
				if(iu.students != null) {
					boolean find = true;
					System.out.print("찾으실 학생정보의 번호를 검색하세요 : ");
					select = sc.nextInt();
					for(int i = 0; i < iu.students.length; i++) {
						if(select == iu.students[i].num) {
							sv.view(i, iu.students);
							find = !find;
							break;
						}
					}
					if(find)
						System.out.println("데이터가 존재하지 않습니다.");
				}else
					System.out.println("데이터가 존재하지 않습니다.");
			}
			else{
				System.out.print("프로그램을 종료하였습니다.");
				check = !check;
			}
		}
	}
}