package hanjia;

public class h44 {

	public static void main(String[] args) {
		
		int a[]= {12,5,91,4,23};
		System.out.print("max index:"+max_index(a));
		
	}
		
		public static int max_index(int a[]) {
			int s=0;
			int mi=0;
			for(int aa=0;aa<a.length;aa++)
			{
				
				if(a[aa]>s)
				{
					s=a[aa];
					mi=aa;
				}
			}
			return mi;
		}

	

}
