package hanjia;
import java.util.Scanner;
public class h42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); 
		System.out.println(even(n));
		
	}
		public static boolean even(int n) {
			
			if(n%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
	}


