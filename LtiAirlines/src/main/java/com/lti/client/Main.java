package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		Flight f=new Flight(1001,"Chennai","Delhi");
		System.out.println(f.getFlight()+" "+f.getStart()+" "+f.getDestination());
		
		//Test data
		int num1=10,num2=20;
		if(add(num1,num2)==30) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
	}

	public static int add(int n1,int n2) {
		return n1+n2;
	}
	
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		return false;
	}
	
}
