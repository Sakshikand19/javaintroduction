package bca;

public class Refibonacci {
	
		int fib(int n)
		{
			if(n==0)
				return 0;
			else if(n==0)
				return 1;
			else 
				return fib(n-1)+fib(n-2);
		}
		public static void main(String[] args) {

          int n,i;
          n=Integer.parseInt(args[0]);
          Refibonacci R=new Refibonacci();
          for(i=0; i<0; i++)
          {
        	  System.out.println(R.fib(i));
          }
          
	}

}
