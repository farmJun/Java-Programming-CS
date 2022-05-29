package mainPackage;

public class Harshad {
	public static boolean solution(int arg) {
		int n = arg;
		int sum = 0;
		while(n > 0 ) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		int answer = arg % sum;
		if(answer == 0) {
			return true;	
		}
		return false;
	}
}