import java.util.*;

public class Answer1 {

	public static void main(String args[]) {
		String string1, string2;
		System.out.println("Enter 2 strings!!");
		Scanner sc = new Scanner(System.in);
		string1 = sc.next();
		string2 = sc.next();
		sc.close();
		int l1 = string1.length(), l2 = string2.length();
		int l = l2;
		if (l1 < l2) {
			l = l1;
		}
		int ans = 0;
		for (int i = 0; i < l; i++) {
			if (ans != 0) {
				break;
			}
			ans = string1.charAt(i) - string2.charAt(i);
		}
		if (ans == 0) {
			if (l1 == l2) {
				System.out.println("Both Strings are equal");
			} else if (l1 < l2) {
				System.out.println("First String is smaller than second");
			} else {
				System.out.println("Second String is smaller than first");
			}
		}
		else{
			if(ans>0)
			{
				System.out.println("First String is greater than second");
			}
			else{
				System.out.println("First String is smaller than second");
			}
		}
	}

}