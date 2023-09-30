package hanjia;

import java.util.Scanner;

public class h31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		int N=60;
		int max=0;
		 
		System.out.print("1~"+N+"Prime number have:");
		
		for(int a=1;a<=N;a++)
		{	
			int sum=0;
		for(int b=1;b<=a;b++)
		{
			if(a%b==0)
			
				sum++;
		}	
		
			if(sum==2)
			{
				System.out.print(a+" ");
			
			if(a>=max)
			{
				max=a;
			}
		}
		}
		System.out.println();
		System.out.println("the max prime number:"+max);
			} 
	
	} 

	


