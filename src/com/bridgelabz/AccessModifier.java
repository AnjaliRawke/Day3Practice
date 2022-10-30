package com.bridgelabz;

public class AccessModifier {
      void display()
      {
    	System.out.println("Display with default");  
      }
      protected void protect()
      {
        System.out.println("It is Protected");
      }
      private void privt()
      {
        System.out.println("The file is Private");
      }
      public int add(int a, int b)
      {
         return a+b;
            
      }
      
      
      public static void main(String[] args) {
    	  AccessModifier Obj=new AccessModifier();
    	  Obj.display();
    	  
    	  Obj.protect();
    	 
    	  Obj.privt();
    	
    	 System.out.println(Obj.add(10, 20));
	
	}
}
