package 수업;

import javax.swing.*;

class MyFrame extends JFrame {
		MyFrame(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setVisible(true);
	}
}

public class GUITester2 {

	public static void main(String[] args)throws InterruptedException {
		JFrame frame = new MyFrame();
	}

}
