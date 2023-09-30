package hanjia;
import java.util.Scanner;
public class h25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一數字");
		int a=sc.nextInt();
		if(a%5==0&&a%6==0)
		{
			System.out.print("Yes");
		}
		else
			System.out.print("No");

	}

}
