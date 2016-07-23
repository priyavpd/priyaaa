

import java.util.Scanner;

public class Factorial
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();

	int ss=1;
	
	for(int i=1;i<=n;i++){
		ss=ss*i;
		
	}
		System.out.println("factorial is:"+ss);
	}
}

