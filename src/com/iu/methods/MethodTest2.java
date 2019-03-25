package com.iu.methods;

public class MethodTest2 {
	//m1 - 급여를 받아서(매개변수에서 받아와서) 고용보험료를 계산하여 출력(0.2%)
	
	//m2 - 급여를 받아서 의료보험료 1.3% 계산 출력
	
	//m3 - 급여를 받아서 국민연금 1.0% 계산 출력
	
	//m4 - 급여를 받아서 산재보험료 0.4% 계산 출력
	
	public void EmploymentInsurance(int salary) {
		System.out.println("고용보험 : " + (int)(salary * 0.002) + "원");
	}
	
	public void MedicalInsurance(int salary) {
		System.out.println("의료보험" + (int)(salary * 0.013) + "원");
	}
	public void NationalPension(int salary) {
		System.out.println("국민연금" + (int)(salary * 0.01) + "원");
	}
	
	public void SafetyInsurance(int salary) {
		System.out.println("산재보험" + (int)(salary * 0.004) + "원");
	}
}