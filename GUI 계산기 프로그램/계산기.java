package 계산기;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calc extends JFrame implements ActionListener {
	JTextField text;
	JTextField text2;
	JPanel panel;
	JPanel panel2;
	double prev=0;
	double cur=0;
	String oper="";
	String last="";
	boolean isNum=false;
	public calc(){
		setBounds(100, 100, 500, 500);
		setTitle("12191608_박준영");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel2 = new JPanel();
		text = new JTextField("");
		text2= new JTextField("");
		text.setPreferredSize(new Dimension(50,80));
		text2.setPreferredSize(new Dimension(50,80));
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(text,BorderLayout.NORTH);
		panel2.add(text2,BorderLayout.SOUTH);
		add(panel2,BorderLayout.NORTH);
		text.setHorizontalAlignment(JTextField.RIGHT);
		text2.setHorizontalAlignment(JTextField.RIGHT);
		panel = new JPanel();
		panel.setLayout(new GridLayout(6,4));
		String items[]= {
				"%","CE","C","←","1/x","x²","√","÷","7","8","9",
				"×","4","5","6","-","1","2","3","+","+/-","0",".","="
		};
		add(panel, BorderLayout.CENTER);
		for (int i = 0; i < items.length; i++) {
			JButton btn = new JButton("" + items[i]);
			btn.setPreferredSize(new Dimension(50, 50));
			btn.addActionListener(this);
			panel.add(btn);
		}
		setVisible(true);
		setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if(event.equals("C")) {text.setText("");text2.setText("");prev=0;cur=0;last="";}
		else if(event.equals("+")) {prev =cur;oper="+";last="";text.setText(text.getText()+event);}
		else if(event.equals("-")) {prev =cur;oper="-";last="";text.setText(text.getText()+event);}
		else if(event.equals("×")) {prev =cur;oper="×";last="";text.setText(text.getText()+event);}
		else if(event.equals("÷")) {prev =cur;oper="÷";last="";text.setText(text.getText()+event);}
		else if(event.equals("√")) {prev =cur;	oper="√";last="";text.setText(text.getText()+event);}
		else if(event.equals("x²")) {prev =cur;oper="^2";last="";text.setText(text.getText()+"^2");}
		else if(event.equals("1/x")) {prev =cur;oper="1/x";last="";text.setText("1/"+text.getText());}
		else if(event.equals("%")||event.equals("CE")||event.equals("+/-")) {	text2.setText("지원하지 않는 기능입니다.");}
		else if(event.equals("←")) {
			if(text.getText().length()-1>=0) {
				char [] a= new char[text.getText().length()-1];
				for(int i=0; i<text.getText().length()-1;i++) {
					a[i]=text.getText().charAt(i);}
				String t = new String(a);
				text.setText(t);}}
		else if(event.equals("=")) {
			if(oper.equals("+")) {text2.setText(deletePoint(String.valueOf(prev+cur)));}
			else if(oper.equals("-")) {text2.setText(deletePoint(String.valueOf(prev-cur)));}
			else if(oper.equals("×")) {text2.setText(deletePoint(String.valueOf(prev*cur)));}
			else if(oper.equals("÷")) {text2.setText(deletePoint(String.valueOf(prev/cur)));}
			else if(oper.equals("√")) {text2.setText(deletePoint(String.valueOf(Math.sqrt(cur))));}
			else if(oper.equals("^2")) {text2.setText(deletePoint(String.valueOf(cur*cur)));}
			else if(oper.equals("1/x")) {text2.setText(deletePoint(String.valueOf(1/cur)));}
			isNum= true;last="";prev=0;cur=0;}
		else {if(isNum){text.setText("");text2.setText("");prev=0;cur=0;last="";isNum=false;}last += event;text.setText(text.getText()+event);cur = Double.parseDouble(last);System.out.println(cur);}}
public String deletePoint(String p) {
		while(p.contains(".") && (p.endsWith("0") || p.endsWith("."))) {p = p.substring(0, p.length()-1);}
		return p;}}
public class 계산기 {
	public static void main(String[] args) {
		new calc();
	}
}
