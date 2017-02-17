import javax.swing.*;  
import java.awt.event.*;  
class FirstSwingExample extends JFrame implements ActionListener
{
	JRadioButton r1;
	JRadioButton r2;
	FirstSwingExample()
	{
		JButton b=new JButton(new ImageIcon("jersey_logo.png"));
		b.setBounds(100,200,50,40);
		r1=new JRadioButton("male");
		r2=new JRadioButton("female");
		r1.setBounds(50,100,70,30);  
		r2.setBounds(50,150,70,30);  
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		b.addActionListener(this);
		add(b);
		add(r1);
		add(r2);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new FirstSwingExample();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are male");  
		}
		else
		{
			JOptionPane.showMessageDialog(this,"You are female");  
		}
	}
}
