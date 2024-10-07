package bca;


public class inheritance {
	
		  int x=10;
		  void m1() {
			  System.out.println(x);
		  }
		} 
		 class inheritance2 extends inheritance{
			 int y=20;
			 void m2() {
				  System.out.println(y);

			 }}
		 class inheritance3{
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				inheritance2 t=new inheritance2();
				inheritance2 s=new inheritance2();
				t.m1();
				s.m2();
				
		        
			}

		}

