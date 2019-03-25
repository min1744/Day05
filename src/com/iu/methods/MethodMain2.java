package com.iu.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		MethodTest2 m2 = new MethodTest2();
		Scanner sc = new Scanner(System.in);
		int salary = 0;
		boolean check = true;

		while(check) {
			System.out.println("1. 급여 입력");
			System.out.println("2. 고용보험");
			System.out.println("3. 의료보험");
			System.out.println("4. 국민연금");
			System.out.println("5. 산재보험");
			System.out.println("6. 종    료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("급여를 입력하세요 : ");
				salary = sc.nextInt();
			}else if(select == 2) {
				m2.EmploymentInsurance(salary);
			}else if(select == 3) {
				m2.MedicalInsurance(salary);
			}else if(select == 4) {
				m2.NationalPension(salary);
			}else if(select == 5) {
				m2.SafetyInsurance(salary);
			}else if(select == 6) {
				System.out.println("종료합니다.");
				check = !check;
				break;
			}else {
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
	}
}