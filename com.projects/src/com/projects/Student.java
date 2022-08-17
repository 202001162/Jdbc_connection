package com.projects;

import java.util.*;
public class Student {
	public static void main(String args[]) {
		char g='y';
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Select your department:");
			System.out.println("1.CSE 2.CCE 3.ECE");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Cse cse=new Cse();
				cse.details();
				break;
			case 2:
				Cce cce=new Cce();
				cce.details();
				break;
			case 3:
				Ece ece=new Ece();
				ece.details();
				break;
			//default:
				//System.out.println("Enter the correct department number......");
			}
			System.out.println("Do you want to continue:y/n");
			g=sc.next().charAt(0);
		}
		while(g=='y');
		
	}
}
