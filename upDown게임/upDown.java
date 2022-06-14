package upDown;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class upDown {
	
	public static void main(String[] args)throws IOException {
		System.out.println("학번 : 12191608, 이름 : 박준영");
		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("학번 : 12191608, 이름 : 박준영\n");
			System.out.println("Guess What(1~100)!");	
			int randomNum = (int)(Math.random()*100)+1;
			int count =0;
			int game = 0;
			boolean again=true;
			String tryAgain;
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.print("Input>");
				int num;
			try {
				num=scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				scanner.next();
				continue;
			}
			if(num>randomNum) {
				System.out.println("Down");
				count++;
			}
			else if(num<randomNum){
				System.out.println("Up");
				count++;
			}
			else if(num==randomNum){
				count++;
				System.out.println("정답!! " + count +"번만에 맞춤!");
				System.out.print("다시하겠습니까?(y/n)>");
				writer.write("게임번호 "+game+" : 정답 "+count+"번만에 맞춤\n");
				game++;
				tryAgain = scanner.next();
				randomNum = (int)(Math.random()*100)+1;
				assert (tryAgain.equals("y")||tryAgain.equals("n")):"y나 n만 입력 가능합니다.";
				if(tryAgain.equals("n")) {
				again=false;
					}
				}
			}
			while(again);
				scanner.close();
				writer.close();
			} 
		catch (FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");		
		}
	} 
}

