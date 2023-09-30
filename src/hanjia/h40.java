package hanjia;

public class h40 {

	public static void main(String[] args) {
		
		
		System.out.print("1+2+3+...+10 :"+add2Ten());
	}
		public static int add2Ten() {
			int sum=0;
			for(int n=1;n<=10;n++) {
				sum+=n;
			}
			return sum;
		}


}
