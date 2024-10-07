package bca;

public class Constructoroverloading {
	int num;
	Constructoroverloading()
	{
		num=10;
	}
	Constructoroverloading(int a)
	{
		num=0;
	}
	void display()
	{
		System.out.println("num="+num);
		
	}
}
    class Cdemo{
    	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading obj1 =new Constructoroverloading();
		Constructoroverloading obj2 =new Constructoroverloading();	
		obj1.display();
		obj2.display();

	}

}
