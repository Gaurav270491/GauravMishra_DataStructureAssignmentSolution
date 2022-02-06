package com.greatlearning.driver;


import java.util.Scanner;
import java.util.Stack;

import com.greatlearning.service.Floor;

public class Driver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Floor floor=new Floor();
		int floorsize=0;
		
		
		
		System.out.println("Enter the total no of floor in the building");
		
		Scanner sc = new Scanner(System.in);
		int totalfloor = sc.nextInt();
		
		
		for (int i = 1; i <= totalfloor; i++) {
			
			System.out.println("Enter the floor size given on day " + i);
			 floorsize=sc.nextInt();
			
			
			
			
			
			}
		floor.floorOrderpush( totalfloor,floorsize);
		
		
		
		
		sc.close();

	}

}
