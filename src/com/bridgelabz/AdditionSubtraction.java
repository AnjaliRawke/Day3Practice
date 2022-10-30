package com.bridgelabz;

public class AdditionSubtraction {
     
       public int addition(int a , int b) {
    	  int result=a+b;
    	  return result;
    	  
       }
	  public int subtraction(int c , int d) {
	  int result1=c-d;
	  return result1;
	  }
	  public int multipilcation(int x , int y)
	  {
	    int result2=x*y;
	    return result2;
	  }
	  public int division(int m , int n)
	  {
	    int result3=m/n;
	    return result3;
	  }
	public static void main(String[] args) {
		AdditionSubtraction Obj=new AdditionSubtraction();
	 int returnstorage=Obj.addition(10,20);
	 System.out.println("The add is" +returnstorage );
	 int returnSubtraction=Obj.subtraction(30,20);
	 System.out.println("The Sub is" + returnSubtraction);
	 int returnMulti=Obj.multipilcation(12,22);
	 System.out.println("The multiplication is" + returnMulti);
	 int returnDivision=Obj.division(20,10);
	 System.out.println("The division is" + returnDivision);
	}
		  
	  }
		

