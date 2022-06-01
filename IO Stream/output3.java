package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class output3 {

	public static void main(String[] args) {
		byte num[] = {1, 2, 3, 4, 5, 6, 7};
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("test.txt");
			for(int i = 0; i < num.length; i++) {
				try {
					fout.write(num[i]);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				//fout.write(num);
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
