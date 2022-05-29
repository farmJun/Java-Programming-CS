package mainPackage;

public class mainPackage {
	public static void main(String[] args) {
		System.out.println("Harshad Number:");
		for(int i = 2; i < 1000; i++){
			if(Harshad.solution(i))
			System.out.print(" "+ i);
		}
		System.out.println("");
		System.out.println("Armstrong Number:");
		for(int i = 2; i < 1000; i++){
			if(Armstrong.solution(i))
			System.out.print(" "+ i);
			}
		System.out.println("");
		System.out.println("Perfect Number:");
		for(int i = 2; i < 1000; i++){
			if(Perfect.solution(i))
			System.out.print(" "+ i);
			}
	}
}
