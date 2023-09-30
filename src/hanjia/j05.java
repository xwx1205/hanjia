package hanjia;
import java.util.Scanner;
public class j05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入陣列大小");
		double[] a=new double[sc.nextInt()];
		double cc;
	for(int b=0;b<a.length;b++)
	{
		System.out.println("a["+b+"]=");
		a[b]=sc.nextDouble();
	}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					cc=a[j];
					a[j]=a[j+1];
					a[j+1]=cc;
					
					
				}
			}
		}
		for(int b=0;b<a.length;b++)
		{
			System.out.print(a[b]+" ");
		}
		
	}

}
