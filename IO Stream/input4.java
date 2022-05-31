package stream;

import java.io.FileReader;
import java.io.IOException;

public class input4 {

static void fileRead4() {
		

			try {
				FileReader fin = new FileReader("test.txt");
				char [] buf = new char[256];
				fin.read(buf);
				System.out.print(buf);
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			fileRead4();
		}
}
