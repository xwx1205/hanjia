package hanjia;
import java.util.Scanner;
public class h41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("1+2+3+...+n :"+addto(n));
		
	}
		public static int addto(int n) {
			
			int sum=0;
			for(int N=1;N<=n;N++) {
				sum+=N;
			}
			return sum;
		}
	}


