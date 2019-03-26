package com.iu.seoul;

import java.util.Scanner;

public class SeoulMenu {

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentView view = new StudentView();
		StudentSearch ss = new StudentSearch();
		StudentInput si = new StudentInput();
		boolean check=true;
		Student [] students=null;
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 정보전체출력");
			System.out.println("3. 학생검색출력");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				students = si.makeStudent();
				break;
			case 2:
				System.out.println("전체출력");
				view.listView(students);
				break;
			case 3:
				System.out.println("검색출력");
				//view.view(student);
				Student s = ss.search(students);
				if(s == null)
					view.view(s);
				break;
			default:
				System.out.println("프로그램 종료");
				check=false;//check=!check
			}
		}
	}
}