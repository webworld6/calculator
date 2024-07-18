
import java.util.Scanner;
class maths
{   Scanner sc=new Scanner(System.in);
	int n1,n2,m;
	
	void data1()
	{
		System.out.println("Enter 2 numbers :");
        n1=sc.nextInt();
        n2=sc.nextInt();
	}
	void data2()
	{
		System.out.println("Enter your choice :");
		System.out.println("\n1.Add \n2.Sub \n3.Mul \n4.Div");
		m=sc.nextInt();
		switch(m)
		{
		case 1:
			System.out.println("Addition :"+(n1+n2));
			break;

		case 2:
			System.out.println("Subtraction :"+(n1-n2));
			break;

		case 3:
			System.out.println("Multiplication :"+(n1*n2));
			break;

		case 4:
			System.out.println("Division :"+(n1/n2));
			break;

		default:
			System.out.println("enter correct choice");

		}

	}

}

class calculator 
{
    public static void main(String[] args) 
   {
   	Scanner s=new Scanner(System.in);
	 maths m=new maths();
     String ch;
	 do{
	 	
	 m.data1();
	 m.data2();
	 System.out.println("Do you want to continue y/n ");
	 ch=s.next();
	 }while(ch.equals("Y"));
	
   }
}
