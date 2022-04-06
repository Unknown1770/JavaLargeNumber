package hello;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers: \n");
		System.out.println("Enter Number 1: ");
	    int a=sc.nextInt();
	    System.out.println("Enter Number 2: ");
	    int b=sc.nextInt();
	    System.out.println("Enter Number 3: ");
	    int c=sc.nextInt();
	    if(a>b && a>c)
	    {
	    	System.out.println("Maximum number is "+a);
	    }
	    else if(b>c)
	    {
	    	System.out.println("Maximum number is "+b);
	    }
	    else
	    {
	    	System.out.println("Maximum number is "+c);
	    }

	}

}
