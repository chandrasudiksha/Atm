//pin is 1234 and starting balance is 10000
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
class Atm extends Frame implements ActionListener
{
	int pin=1234;
	TextField t1;
	int p,n3,n2,bal=10000;
	String n1;
	Atm()
	{
		setTitle("ATM");
		setBounds(475,200,400,400);
		addWindowListener(new WWW());
		Font txt1=new Font("",Font.BOLD,25 );
		Font txt2=new Font("",Font.BOLD,15);
		Font txt3=new Font("",Font.PLAIN,15 );
		BorderLayout border=new BorderLayout();
		setLayout(border);
		setBackground(Color.blue);
		Panel p=new Panel();
		Label wel=new Label("WELCOME");
		p.add(wel);
		wel.setFont(txt1);
		Label emp=new Label(" ");
		p.add(emp);
		emp.setFont(txt1);
		Panel p1=new Panel();
		Label l1=new Label("PIN");
		p1.add(l1);
		l1.setFont(txt2);
		t1=new TextField(4);
		t1.setEchoChar('*');
		p1.add(t1);
		Panel p2=new Panel();
		Button b1=new Button("Clear");
		p2.add(b1);
		b1.setFont(txt3);
		b1.addActionListener(this);
		Button b2=new Button("OK");
		p2.add(b2);
		b2.setFont(txt3);
		b2.addActionListener(this);
		add(p,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		setVisible(true);
			
	}
	class WWW extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		if(m.equals("Clear"))
			t1.setText("");
		else if(m.equals("OK"))
		{
			Main ma;
			int num=Integer.parseInt(t1.getText());
			if(num==pin)
				ma=new Main();
			else
				showMessageDialog(null,"Enter Valid Pin");
		}
		
			
	}
class Main extends Frame implements ActionListener
{

	Main()
	{
		setTitle("ATM");
		setBounds(475,200,400,400);
		addWindowListener(new WWW());
		Font txt1=new Font("",Font.BOLD,25 );
		Font txt2=new Font("",Font.BOLD,15);
		Font txt3=new Font("",Font.PLAIN,15 );
		GridLayout grid=new GridLayout(2,2);
		setLayout(grid);
		Button b1=new Button("Deposit");
		b1.setFont(txt3);
		b1.addActionListener(this);
		add(b1);
		Button b2=new Button("Withdraw");
		b2.setFont(txt3);
		b2.addActionListener(this);
		add(b2);
		Button b3=new Button("Fast Cash");
		b3.setFont(txt3);
		b3.addActionListener(this);
		add(b3);
		Button b4=new Button("Balance");
		b4.setFont(txt3);
		b4.addActionListener(this);
		add(b4);
		setVisible(true);
			
	}
	class WWW extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		Deposit de;
		Withdraw wi;
		FastCash fa;
		if(m.equals("Deposit"))
			de=new Deposit();
		else if(m.equals("Withdraw"))
			wi=new Withdraw();
		else if(m.equals("Fast Cash"))
			fa=new FastCash();
		else if(m.equals("Balance"))
			showMessageDialog(null,"Your balance is "+bal);
			
	}
}
class Deposit extends Frame implements ActionListener
{
	Deposit()
	{
		setTitle("ATM");
		setBounds(475,200,400,400);
		addWindowListener(new WWW());
		Font txt1=new Font("",Font.BOLD,25 );
		Font txt2=new Font("",Font.BOLD,15);
		Font txt3=new Font("",Font.PLAIN,15 );
		BorderLayout border=new BorderLayout();
		setLayout(border);
		setBackground(Color.blue);
		Panel p=new Panel();
		Label wel=new Label("Deposit");
		p.add(wel);
		wel.setFont(txt1);
		Label emp=new Label(" ");
		p.add(emp);
		emp.setFont(txt1);
		Panel p1=new Panel();
		Label l1=new Label("Enter Amount");
		p1.add(l1);
		l1.setFont(txt2);
		t1=new TextField(10);
		p1.add(t1);
		Panel p2=new Panel();
		Button b1=new Button("Clear");
		p2.add(b1);
		b1.setFont(txt3);
		b1.addActionListener(this);
		Button b2=new Button("OK");
		p2.add(b2);
		b2.setFont(txt3);
		b2.addActionListener(this);
		add(p,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		setVisible(true);
			
	}
	class WWW extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		if(m.equals("Clear"))
			t1.setText("");
		else if(m.equals("OK"))
		{
			int amt=Integer.parseInt(t1.getText());
			bal+=amt;
			showMessageDialog(null,"Your amount has been deposited\n Now your balance is "+bal);
			Main mai=new Main();
		}
	}
}
class Withdraw extends Frame implements ActionListener
{
	Withdraw()
	{
		setTitle("ATM");
		setBounds(475,200,400,400);
		addWindowListener(new WWW());
		Font txt1=new Font("",Font.BOLD,25 );
		Font txt2=new Font("",Font.BOLD,15);
		Font txt3=new Font("",Font.PLAIN,15 );
		BorderLayout border=new BorderLayout();
		setLayout(border);
		setBackground(Color.blue);
		Panel p=new Panel();
		Label wel=new Label("Withdraw");
		p.add(wel);
		wel.setFont(txt1);
		Label emp=new Label(" ");
		p.add(emp);
		emp.setFont(txt1);
		Panel p1=new Panel();
		Label l1=new Label("Enter Amount");
		p1.add(l1);
		l1.setFont(txt2);
		t1=new TextField(10);
		p1.add(t1);
		Panel p2=new Panel();
		Button b1=new Button("Clear");
		p2.add(b1);
		b1.setFont(txt3);
		b1.addActionListener(this);
		Button b2=new Button("OK");
		p2.add(b2);
		b2.setFont(txt3);
		b2.addActionListener(this);
		add(p,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		setVisible(true);
			
	}
	class WWW extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		if(m.equals("Clear"))
			t1.setText("");
		else if(m.equals("OK"))
		{
			int amt=Integer.parseInt(t1.getText());
			Main mai;
			if(amt>bal)
				showMessageDialog(null,"Insufficient Amount");
			else
			{
				bal-=amt;
				showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
				mai=new Main();
			}
		}
	}
}
class FastCash extends Frame implements ActionListener
{

	FastCash()
	{
		setTitle("ATM");
		setBounds(475,200,400,400);
		addWindowListener(new WWW());
		Font txt1=new Font("",Font.BOLD,25 );
		Font txt2=new Font("",Font.BOLD,15);
		Font txt3=new Font("",Font.PLAIN,15 );
		GridLayout grid=new GridLayout(3,2);
		setLayout(grid);
		Button b1=new Button("Rs.100");
		b1.setFont(txt3);
		b1.addActionListener(this);
		add(b1);
		Button b2=new Button("Rs.500");
		b2.setFont(txt3);
		b2.addActionListener(this);
		add(b2);
		Button b3=new Button("Rs.1000");
		b3.setFont(txt3);
		b3.addActionListener(this);
		add(b3);
		Button b4=new Button("Rs.1500");
		b4.setFont(txt3);
		b4.addActionListener(this);
		add(b4);
		Button b5=new Button("Rs.5000");
		b5.setFont(txt3);
		b5.addActionListener(this);
		add(b5);
		Button b6=new Button("Rs.10000");
		b6.setFont(txt3);
		b6.addActionListener(this);
		add(b6);
		setVisible(true);
			
	}
	class WWW extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String m=ae.getActionCommand();
		if(m.equals("Rs.100"))
		{
			bal-=100;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		else if(m.equals("Rs.500"))
		{
			bal-=500;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		else if(m.equals("Rs.1000"))
		{
			bal-=1000;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		else if(m.equals("Rs.1500"))
		{
			bal-=1500;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		else if(m.equals("Rs.5000"))
		{
			bal-=5000;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		else if(m.equals("Rs.10000"))
		{
			bal-=10000;
			showMessageDialog(null,"Take the amount\n Now your balance is "+bal);
		}
		Main ma=new Main();	
			
	}
}
	public static void main(String ar[])
	{
		Atm a=new Atm();
	}
}
	
	