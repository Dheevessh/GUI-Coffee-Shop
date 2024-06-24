import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameCategory2 extends JFrame implements ActionListener
{
  //Category 1 drinks frame
  JFrame cat1Frame = new JFrame("cat2");
  
  JLabel typeDrink = new JLabel("Chose your Type of Drink:");
  
  JButton Frape1 = new JButton(new ImageIcon("iced1.jpg"));
  double priceF1 = 17.0;
  JLabel nameF1 = new JLabel("Iced Mocha   RM " + priceF1);
  
  JButton Frape2 = new JButton(new ImageIcon("iced2.jpg"));
  double priceF2 = 16.0;
  JLabel nameF2 = new JLabel("Iced Americano   RM " + priceF2);
  
  JButton Frape3 = new JButton(new ImageIcon("iced3.jpg"));
  double priceF3 = 18.0;
  JLabel nameF3 = new JLabel("Iced Caramel Machiato  RM " + priceF3);
  
  JButton Frape4 = new JButton(new ImageIcon("iced4.jpg"));
  double priceF4 = 23.0;
  JLabel nameF4 = new JLabel("Iced Latte   RM " + priceF4);
  

  public JFrameCategory2()
  {
  //Category1 Frame
    ImageIcon backgroundImage2 = new ImageIcon(getClass().getResource("Background images.jpg"));
    JLabel backgroundLabel2 = new JLabel(backgroundImage2);
    cat1Frame.setContentPane(backgroundLabel2);
    
    //frame and font
    cat1Frame.setSize(600,550);
    cat1Frame.setVisible(true);
    cat1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //type of drink
    typeDrink.setFont(new Font("Serif", Font.BOLD, 30));
    typeDrink.setForeground(Color.WHITE);
    //F1
    nameF1.setFont(new Font("Serif", Font.BOLD, 30));
    nameF1.setForeground(Color.WHITE);
    
    //F2
    nameF2.setFont(new Font("Serif", Font.BOLD, 30));
    nameF2.setForeground(Color.WHITE);
    
    //F3
    nameF3.setFont(new Font("Serif", Font.BOLD, 30));
    nameF3.setForeground(Color.WHITE);
    
    //F4
    nameF4.setFont(new Font("Serif", Font.BOLD, 30));
    nameF4.setForeground(Color.WHITE);
    
   //Layout
    //for type of drink
    setLayout(null);
    typeDrink.setBounds(50, 150, 500, 400);
    cat1Frame.add(typeDrink);
    
   //for Frape1
    setLayout(null);
    Frape1.setBounds(500, 50, 500, 400);
    cat1Frame.add(Frape1);
    Frape1.addActionListener(this);
    
    //details and price
    setLayout(null);
    nameF1.setBounds(500, 290, 500, 400);
    cat1Frame.add(nameF1);
    
   //for Frape2
    setLayout(null);
    Frape2.setBounds(1150, 50, 500, 400);
    cat1Frame.add(Frape2);
    Frape2.addActionListener(this);
    
    //details and price
    setLayout(null);
    nameF2.setBounds(1150, 290, 500, 400);
    cat1Frame.add(nameF2);
    
   //for Frape3
    setLayout(null);
    Frape3.setBounds(500, 530, 500, 400);
    cat1Frame.add(Frape3);
    Frape3.addActionListener(this);
    
    //details and price
    setLayout(null);
    nameF3.setBounds(500, 770, 500, 400);
    cat1Frame.add(nameF3);
    
   //for Frape4
    setLayout(null);
    Frape4.setBounds(1150, 530, 500, 400);
    cat1Frame.add(Frape4);
    Frape4.addActionListener(this);
    
    //details and price
    setLayout(null);
    nameF4.setBounds(1150, 770, 500, 400);
    cat1Frame.add(nameF4);
    
  }
    public void actionPerformed(ActionEvent e)
    {
      Object source = e.getSource();
      //1
      if (e.getSource() == Frape1)
      {
        JFrameCategory2Iced1 firstDrink = new JFrameCategory2Iced1();
      firstDrink.setVisible(true);
      this.dispose();
      }
      //2
      else if (e.getSource() == Frape2) 
      {
      JFrameCategory2Iced2 firstDrink = new JFrameCategory2Iced2();
      firstDrink.setVisible(true);
      this.dispose();
      }
      //3
      else if (e.getSource() == Frape3) 
      {
      JFrameCategory2Iced3 firstDrink = new JFrameCategory2Iced3();
      firstDrink.setVisible(true);
      this.dispose();
      }
      //4
      else if (e.getSource() == Frape4) 
      {
      JFrameCategory2Iced4 firstDrink = new JFrameCategory2Iced4();
      firstDrink.setVisible(true);
      this.dispose();
      }
    }
  public static void main(String[] args)
  {
    JFrameCategory2 frame2 = new JFrameCategory2();
    frame2.setVisible(true);
  }
}
