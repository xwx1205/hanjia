package hanjia;

public class k111 {

	public static void main(String[] args) {
		
		  int[] ary = { 33, 48, 61, 79, 52 };
		  int sum = 0;
		  
		  for (int i = ary.length - 1; i >= 0; i--) {
		     System.out.print( add5(ary[i]) + ",");
		     sum += ary[i];
		  }
		  
		  System.out.print("summary= " + sum);
		}
	
	public static int add5(int x) {
		   return x+5;
		}

	}


