import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
class MyClass2 extends JFrame implements ActionListener
{
	JLabel l;
	MyClass2()
	{
		JButton b=new JButton("class 2");
		MyClass2 o=new MyClass2();
		b.addActionListener(this);
		l=new JLabel("class1");
		add(b);add(l);
	}
	

	public void actionPerformed(ActionEvent e)
	{  
		l.setText(" clicked from class 1");
	}
	public static void main(String...args)
	{
		new MyClass2();
	}
}