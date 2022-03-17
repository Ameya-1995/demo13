package Day_03;
import java.util.*;

public class Swap_withoutTemp {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("enter the two values ");
		int a;
		a = d.nextInt();
		int b;
		b = d.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after Swapping");
		System.out.println("A = "+a +"  "+"B ="+ b);
	}

}
