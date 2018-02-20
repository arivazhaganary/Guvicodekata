import java.io.*;
import java.util.*;
class deletdigit{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String str = Integer.toString(a);
		System.out.println(str.substring(b));
	}
}