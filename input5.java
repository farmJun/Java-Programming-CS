package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class input5 {

static void fileRead5() {
		

			try {
				FileReader fin = new FileReader("test.txt");
				BufferedReader r = new BufferedReader(fin);
				System.out.println(r.readLine());
				System.out.println(r.readLine());
				
				
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		fileRead5();
	}

}
