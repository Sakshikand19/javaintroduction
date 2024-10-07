package bca;
import java.util.Iterator;

public class C_Exception_Handling {
	int roll_no;
	String name;
	int age;
	C_Exception_Handling(int roll_no,String name,int age){
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
	}
}
  class Collection3{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Exception_Handling s1= new C_Exception_Handling(101,"sonu",23);
		C_Exception_Handling s2= new C_Exception_Handling(102,"komal",24);
		C_Exception_Handling s3= new C_Exception_Handling(103,"sunita",25);
		java.util.ArrayList<C_Exception_Handling > a1 = new java.util.ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		Iterator<C_Exception_Handling> itr = a1.iterator();
		while(itr.hasNext()) {
			C_Exception_Handling st=itr.next();
			System.out.println(st.roll_no+ " "+st.name+ " " +st.age);
		}
		

	}
	}
