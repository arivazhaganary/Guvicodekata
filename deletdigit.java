import java.io.*;
import java.util.*;
class deletdigit{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		String str = Integer.toString(a);
		for(int i = str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
		
	}
}
