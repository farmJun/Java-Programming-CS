package mainPackage;

import java.lang.Math;
public class Armstrong {
	public static boolean solution(int arg) {
		int a = arg/100;
		int b =(arg%100)/10;
		int c = (arg%100)%10;
		double temp = Math.pow(a,3) +  Math.pow(b,3) +  Math.pow(c,3);
		if(temp==arg) {
			return true;
		}	
		return false;
	}
}