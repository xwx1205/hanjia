package hanjia;

public class h47 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2},{1,2}};
		abc(a);
		
		for(int z=0;z<a.length;z++)
		{
			for(int x=0;x<a[z].length;x++)
			{
			System.out.print(a[z][x]+" ");
			}
		}
		
	}
		public static int[][] abc(int a[][]) {
	
			for(int z=0;z<a.length;z++)
			{
				
				for(int x=0;x<a[z].length;x++) 
				{
					a[z][x]=a[z][x]*a[z][x];
					
				}
			}
			return a;
		}
}
