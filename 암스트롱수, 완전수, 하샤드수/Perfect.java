package mainPackage;

public class Perfect {
	public static boolean solution(int arg) {
		int total=0;
		for(int i=1;i<arg;i++) {
			if(arg%i==0) {
				total += i;
			}
		}
		if(total==arg) {
			return true;
		}
		return false;
	}
}