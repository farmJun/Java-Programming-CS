package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class input2 {
	
static void fileRead2() {
		
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			InputStreamReader r = new InputStreamReader(fin);
			int c;
			while((c=r.read())!= -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead2();
	}

}
