package com.greatlearning.service;


public class AscTree
	{
	    public static Node node;
	    static Node prevNode = null;
	    public static Node headNode = null;
	   
	    
	    public static void Skewed(Node root,int order)
	    {
	       
	        
	        if(root == null)
	        {
	            return;
	        }
	       
	        
	        if(order > 0)
	        {
	        	Skewed(root.right, order);
	        }
	        else
	        {
	        	Skewed(root.left, order);
	        }
	        Node rightNode = root.right;
	        Node leftNode = root.left;
	       
	        
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	        
	        if (order > 0)
	        {
	        	Skewed(leftNode, order);
	        }
	        else
	        {
	        	Skewed(rightNode, order);
	        }
	    }
	   
	    
	    public static void RightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.val + " ");
	        RightSkewed(root.right);       
	    }
	   
	   
	    
	}
	



