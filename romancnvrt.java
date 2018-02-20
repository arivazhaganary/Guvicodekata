import java.util.*;
import java.io.*;
class romancnvrt{
	static int ans = 0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			callr(c);
		}
		System.out.print(ans);
	}
	static int callr(char a){
		if(a == 'X'){
			ans +=10;
			return ans;
		}

		if(a == 'V'){
			ans = ans + 5;
			return ans;
		}
		if(a == 'I'){
			ans = ans + 1;
			return ans;
		}
		return ans;
	}
}