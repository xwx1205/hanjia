
package hanjia;
import java.util.Scanner;

public class h36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p;
		int t=0;
		do
		{
			System.out.print("Please enter a password:");
			p=sc.nextInt();
			if(p==1205)
			{
				System.out.print("The password was entered correctly!");
				break;
			}
			
			else {
				t++;
				if(t>=3) {
					System.out.print("Enter the password more than three times!!");
				break;
				}
			}
		}
			while(p>0);
		
		
	}

}
