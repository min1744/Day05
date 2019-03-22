package com.iu.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		/*1. 학생등록
			//학생 수를 입력(학생 수만큼)
			//학생번호 입력
			//학생이름 입력
			//학생국어점수 입력
			//학생수학점수 입력
			//학생영어점수 입력
		2. 전체정보 조회
			//번호, 이름, 국어점수, 영어점수, 수학점수 출력
		3. 학생정보 검색
			//검색할 학생의 번호를 입력
			//검색한 학생의 번호, 이름, 국어점수, 영어점수, 수학점수 출력
		4. 프로그램 종료*/
		
		Scanner sc = new Scanner(System.in);
		int numbers[] = null;//학생 번호를 저장할 배열
		String names[] = null;//학생 이름을 저장할 배열
		int kors[] = null;//학생 국어점수를 저장할 배열
		int engs[] = null;//학생 영어점수를 저장할 배열
		int maths[] = null;//학생 수학점수를 저장할 배열
		int totals[] = null;
		int select = 0;
		Student st = null;
		Student [] students = new Student[select];
		
		while(true) {
			System.out.println("1. 학생등록\n2. 전체정보 조회\n3. 학생정보 검색\n4. 전체 정보 총점순으로 출력\n5. 프로그램 종료\n");
			select = sc.nextInt();
			if(select == 1) {
				System.out.print("학생 수 입력 : ");
				select = sc.nextInt();
				numbers = new int[select];
				names = new String[select];
				kors = new int[select];
				engs = new int[select];
				maths = new int[select];
				totals = new int[select];
				
				for(int i = 0; i < select; i++) {
					st = new Student();
					System.out.print(i + 1 + "번째 학생의 번호 : ");
					numbers[i] = sc.nextInt();
					System.out.print(i + 1 + "번째 학생의 이름 : ");
					names[i] = sc.next();
					System.out.print(i + 1 + "번째 학생의 국어점수 : ");
					kors[i] = sc.nextInt();
					System.out.print(i + 1 + "번째 학생의 영어점수 : ");
					engs[i] = sc.nextInt();
					System.out.print(i + 1 + "번째 학생의 수학점수 : ");
					maths[i] = sc.nextInt();
					totals[i] = kors[i] + engs[i] + maths[i];
					students[i] = st;
				}
			}else if(select == 2) {
				for(int i = 0; i < names.length ; i++) {
					System.out.println("이름 : " + students[i].name);
					System.out.print("번호 : " + students[i].num + "\t");
					System.out.print("국어 : " + students[i].kor + "\t");
					System.out.print("영어 : " + students[i].eng + "\t");
					System.out.println("수학 : " + students[i].math);
				}
			}else if(select == 3) {
				System.out.println("검색할 학생의 번호 입력");
				select = sc.nextInt();
				int i = 0;
				boolean check = false;
				for(i=0;i<names.length;i++) {
		               if(select == numbers[i]) {
		                  check=!check;
		                  break;
		               }
		            }    
				if(check) {
					System.out.println("번호 : " + numbers[i]);
					System.out.println("이름 : " + names[i]);
					System.out.println("국어 : " + kors[i]);
					System.out.println("영어 : " + engs[i]);
					System.out.println("수학 : " + maths[i]);
				}else
					System.out.println("없는 번호입니다.");
			}else if(select == 4) {
				System.out.println("총점순 출력");
				int temp = 0;
				String sTemp="";
				
				for(int i = 0; i < totals.length; i++) {
					for(int j = i+1; j < totals.length; j++) {
						if(totals[i] > totals[i]) {
							temp = totals[i];
							totals[i] = totals[i];
							totals[i] = temp;
							temp = numbers[i];
							numbers[i] = numbers[i];
							numbers[i] = temp;
							temp = kors[i];
							kors[i] = kors[i];
							kors[i] = temp;
							temp = engs[i];
							engs[i] = engs[i];
							engs[i] = temp;
							temp = maths[i];
							maths[i] = maths[i];
							maths[i] = temp;
							sTemp = names[i];
							names[i] = names[i];
							names[i] = sTemp;
						}
					}
				}
				for(int i = 0; i <names.length ; i++) {
					System.out.println("번호 : " + numbers[i]);
					System.out.println("이름 : " + names[i]);
					System.out.println("국어 : " + kors[i]);
					System.out.println("영어 : " + engs[i]);
					System.out.println("수학 : " + maths[i]);
					System.out.println("총점순 : " + totals[i]);
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}