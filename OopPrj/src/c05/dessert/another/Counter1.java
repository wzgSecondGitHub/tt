package c05.dessert.another;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Counter1 extends Applet{
	private Button start = new Button();//开始按钮
	private Button off = new Button();//关闭按钮
	private TextField tField = new TextField(10);
	private int count;
	private boolean flag = true;
	
	public void init() {
		add(tField);
		start.addActionListener(new StartL());
		add(start);
		off.addActionListener(new OffL());
		add(off);
	}
	class StartL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(flag) {
					tField.setText(String.valueOf(count));
					count++;
				}
			}
		}
	}
	class OffL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			flag = !flag;
		}
	}
	public static void main(String[] args) {
		Counter1 counter1 = new Counter1();
		Frame frame = new Frame("Counter1");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
