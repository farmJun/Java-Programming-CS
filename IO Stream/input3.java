package stream;

import java.io.FileReader;
import java.io.IOException;

public class input3 {
static void fileRead3() {
		

			try {
				FileReader fin = new FileReader("test.txt");
				
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
			// TODO Auto-generated method stub
			fileRead3();
		}
}

