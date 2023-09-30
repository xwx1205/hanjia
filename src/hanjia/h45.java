package hanjia;

import java.lang.reflect.Array;

public class h45 {

	public static void main(String[] args) {
	
		int a[][]= {{12,5,4},{2003,91,23}};
		System.out.print("max number:"+max_number(a));
	}
	
	public static int max_number(int a[][]) {
		
		int s=0;
		
		for(int x=0;x<a.length;x++)	
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(a[x][y]>s)
				{
					s=a[x][y];
					
				}
			}
		}
		return s;
	}

}
