package com;
import com.firstpackage.*;
import java.util.Scanner;

class FirstClass{
	public static void main(String[] args){	
		System.out.println("Hello");
		for(String i : args){
			System.out.println(i);
		}
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt(), y = sc.nextInt();
	SecondClass o = new SecondClass(x,y);
	System.out.println(o.getX() + " " + o.getY());
	for (int i = 1; i<=8; i++){
		for (int j = 1; j <= 8; j++) {
			o.setX(i);
			o.setY(j);
			System.out.print(o.sum()+" ");
		}
	System.out.println();	
	}
	}
}