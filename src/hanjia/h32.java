package hanjia;

import java.util.Scanner;

public class h32 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Input number: ");
		int a=sc.nextInt();
		
		for(int x=1;x<=a;x++)
		{
		if(a%x==0)
		{
			System.out.print(x+" ");
		}
		
		}

	}

}
