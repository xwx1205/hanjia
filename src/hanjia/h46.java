package hanjia;

public class h46 {

	public static void main(String[] args) {
		
		int a[][]= {{1,11,3},{4,5,6}};
		System.out.print("average:"+average(a));
	}	
	public static int average(int a[][]) {
		int sum=0;
		int l=0;
	for(int x=0;x<a.length;x++)
	{
		l=l+a[x].length;
		for(int y=0;y<a[x].length;y++)
		{
			sum+=a[x][y];
		}
	}
		return sum/l ;

	}

}
