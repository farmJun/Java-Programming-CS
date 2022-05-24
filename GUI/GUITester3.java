package 수업;

import javax.swing.*;

class MyFrame1 extends JFrame {
	
	MyFrame1(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setVisible(true);
	}
}

public class GUITester3 {

	public static void main(String[] args)throws InterruptedException {
		JFrame frame = new MyFrame1();
		int cnt = 0;
		while(cnt < 5) {
		Thread.sleep(2000);
		frame.setVisible(true);
		cnt++;
		}
		System.exit(0);
	}

}
