
public class Calculator {
	
	int n1=5,n2=2;
	
	public void add()
	{
		System.out.println("Sum of"+(n1+n2));
	}
	
	public void mul()
	{
		System.out.println("Product of"+(n1*n2));
	}

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add();
		cal.mul();

	}

}
