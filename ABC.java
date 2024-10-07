package bca;

public class ABC {   //class declaration
	
	public void method1(){       //method
		int x=5; 
      System.out.println("value of x"+x);        //local variable
	}
	public void method2(){
		int y=10;
		 System.out.println("value of y"+y);

	}
	 public void method3(){
		int z=15;
		 System.out.println("value of z"+z);

	}
	 public void method4(){
		int a=20;
		 System.out.println("value of a"+a);

	}
    public  void method5(){
		int b=25;
		 System.out.println("value of b" +b);

		 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ABC p=new ABC();
         ABC q=new ABC();
         ABC r=new ABC();   
         ABC s=new ABC();
         ABC t=new ABC();


       p.method1();
       q.method2();
       r.method3();
       s.method4();
       t.method5();
         
	}

}
