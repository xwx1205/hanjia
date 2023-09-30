package hanjia;

public class h43 {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		System.out.println(x(a));
	}
		public static int x(int a[]) {
			int sum=0;	
		for(int aa=0;aa<a.length;aa++)
		{
			
			if(a[aa]%2==1)
			{
			sum++;	
			}
			
			
		}
		return sum;
		}
	

}
