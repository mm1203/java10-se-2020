package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入");
		int x = s1.nextInt();
		switch(x){
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		
		}

	}

}
