package hanjia;

public class h33 {

	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<=50 ;a++)
		{
			if(a%2==0)
			{
			sum-=a*a;
				
			}
				else
				
				sum+=a*a;
				
		}
		
		System.out.println(sum);

	}

}
