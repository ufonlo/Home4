package two;
import java.util.Scanner;
public class moreOrLessNumber {
	public static void main (String []args) {
		System.out.println("Enter a");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		if(a < b) {
		System.out.print("Minimal number is a = " + a);
		}else {
			System.out.print("Minimal number is b = " + b);
		}
	}

}
