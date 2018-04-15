import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginFrame extends Frame implements ActionListener
{
 Button bSub,bClr,bCls;
 TextField tLog,tPas;

 LoginFrame()
 {
  super("Login");
  setSize(400,250);
  setBackground(new Color(70,70,70));
  setLocation(300,200);

  Label l1=new Label("Login-Id");
  l1.setFont(new Font("lucida console",18,Font.PLAIN));
  l1.setForeground(Color.white);

  Label l2=new Label("Password");
  l2.setFont(new Font("lucida console",18,Font.PLAIN));
  l2.setForeground(Color.white);

  tLog=new TextField();
  tLog.setFont(new Font("lucida console",Font.PLAIN,18));
  tLog.setBackground(new Color(255,255,180));
  tLog.setForeground(new Color(100,100,200));

  tPas=new TextField();
  tPas.setEchoChar('@');
  tPas.setFont(new Font("lucida console",Font.PLAIN,18));
  tPas.setBackground(new Color(255,255,180));
  tPas.setForeground(new Color(100,100,200));

  bSub=new Button("Submit");
  bSub.setFont(new Font("lucida console",Font.PLAIN,18));
  bSub.setBackground(new Color(160,70,70));
  bSub.setForeground(Color.white);

  bClr=new Button("Clear");
  bClr.setFont(new Font("lucida console",Font.PLAIN,18));
  bClr.setBackground(new Color(70,160,70));
  bClr.setForeground(Color.white);

  bCls=new Button("Close");  
  bCls.setFont(new Font("lucida console",Font.PLAIN,18));
  bCls.setBackground(new Color(70,70,160));
  bCls.setForeground(Color.white);

  Panel p1=new Panel();
  p1.setLayout(new BorderLayout(23,10));
  p1.add(l1,BorderLayout.WEST);
  p1.add(tLog,BorderLayout.CENTER);

  Panel p2=new Panel();
  p2.setLayout(new BorderLayout(10,10));
  p2.add(l2,BorderLayout.WEST);
  p2.add(tPas,BorderLayout.CENTER);

  Panel p3=new Panel();
  p3.setLayout(new GridLayout(1,3,10,10));
  p3.add(bSub);
  p3.add(bClr);
  p3.add(bCls);

  setLayout(new GridLayout(4,1,10,10));
  add(p1);
  add(p2);
  add(new Label());
  add(p3);
 
  bSub.addActionListener(this);  
  bClr.addActionListener(this);  
  bCls.addActionListener(this);  

  //addWindowListener(new LoginAdapter());
 } 

 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==bSub)
  {
   String log,pas;
   log=tLog.getText();
   pas=tPas.getText();

   if(log.equals("KCJ")&&pas.equals("101010"))
   {
    JOptionPane.showMessageDialog(null,"Login Successful..");    
   }
   else
   {
    JOptionPane.showMessageDialog(null,"Login Failed..");    
   }
  }
  else
  if(ae.getSource()==bClr)
  {
   tLog.setText("");
   tPas.setText("");
  }
  else
  if(ae.getSource()==bCls)
  {
   new LoginAdapter().windowClosing(new WindowEvent(this,0));
  }
 }


 public Insets getInsets()
 {
  return new Insets(80,30,30,30);
 }

}

class LoginAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class Login
{
 public static void main(String arg[])
 {
  LoginFrame lf=new LoginFrame();
  lf.setVisible(true);
 }
}