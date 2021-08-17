package StackQS;

import DataStructure.Stack;

public class SQS {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack(10);
		Stack h = new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//displayReverse(s);
		s.display();
		actualReverse(s, h);
		s.display();
		
		

	}
	
	public static void displayReverse(Stack s) throws Exception {
		if(s.isEmpty()) {
			return ;
		}
		
		int temp = s.pop();
		
		displayReverse(s);
		System.out.println(temp);
		
		s.push(temp);
		
	}
	
	public static void actualReverse(Stack s, Stack helper) throws Exception {
		
		if(s.isEmpty()) {
			actualReverse2(s, helper);
			return;
		}
		int temp = s.pop();
		
		helper.push(temp);
		actualReverse(s, helper);
		
		
	}
	public static void actualReverse2(Stack s, Stack helper) throws Exception {
		
		if(helper.isEmpty())
			return;
		int temp = helper.pop();
		actualReverse2(s, helper);
		s.push(temp);
		
	}

}
