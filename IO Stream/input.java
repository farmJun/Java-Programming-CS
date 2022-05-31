package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class input {

	static void fileRead() {
		
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			int c;
			while((c=fin.read())!= -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
	fileRead();
	}

}
