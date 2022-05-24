package 수업;

import javax.swing.*;

class MyFrame2 extends JFrame {
		MyFrame2(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class GUITester4 {

	public static void main(String[] args)throws InterruptedException {
		MyFrame2 frame = new MyFrame2();
	}

}
