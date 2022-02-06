package com.greatlearning.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Floor {
	
	Queue<Integer> queue;
	Queue<Integer> tempqueue;
	
	public Floor() {
		
		queue= new LinkedList<Integer>();
		queue= new LinkedList<Integer>();
	}
	
	 public void floorOrderpush( int totalfloor1, int floorsize1) {
		// TODO Auto-generated method stub
         for (int i = 1; i <= totalfloor1; i++) {
        	 
        	 if (queue.size()==0)
        		 queue.add(floorsize1);
        	 
        	 
			
                System.out.println("Day:" +i);
                
                
        		if (floorsize1 == totalfloor1)
        		System.out.println( floorsize1);

            
            
            	
            	
            
			
		}
		
	}

}
