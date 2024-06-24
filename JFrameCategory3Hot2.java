import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameCategory3Hot2 extends JFrame implements ActionListener
{
 //Drink1
  JFrame Drink1 = new JFrame("Drink1");
  JLabel Drinkf1 = new JLabel(new ImageIcon("hot2.jpg"));
  JCheckBoxMenuItem sugar = new JCheckBoxMenuItem("MORE SUGAR");
  JCheckBoxMenuItem cream = new JCheckBoxMenuItem("MORE CREAM");
  JButton Next = new JButton("Next");
  

    public JFrameCategory3Hot2()
  {
      
  //Drink1
    ImageIcon backgroundImage11 = new ImageIcon(getClass().getResource("Background images.jpg"));
    JLabel backgroundLabel11 = new JLabel(backgroundImage11);
    Drink1.setContentPane(backgroundLabel11);
    
    Drink1.setSize(600,550);
    Drink1.setVisible(true);
    Drink1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
    
    //drink1 image
    setLayout(null);
    Drinkf1.setBounds(50, 150, 500, 400);
    Drink1.add(Drinkf1);
    
        
    //font
    //sugar
    sugar.setFont(new Font("Serif", Font.BOLD, 24));
    
    //cream
    cream.setFont(new Font("Serif", Font.BOLD, 24));
    
    //Layout
    
    //sugar
    setLayout(null);
    sugar.setBounds(800, 70, 200, 40);
    Drink1.add(sugar);

    //cream
    setLayout(null);
    cream.setBounds(800, 550, 200, 40);
    Drink1.add(cream);

    Next.setBounds(900, 800, 200, 40);
    Drink1.add(Next);
    Next.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      try {
        
      Object source = e.getSource();
      
      if (e.getSource() == Next)
      {
        JFrame receiptFrame = new JFrame("Receipt");
        receiptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon backgroundImage11r = new ImageIcon(getClass().getResource("Background images.jpg"));
        JLabel backgroundLabel11r = new JLabel(backgroundImage11r);
        receiptFrame.setContentPane(backgroundLabel11r);
        
        double basePrice = 21.90;
        int additionalCost = 0;
        
        if (sugar.isSelected() && cream.isSelected()) {
          additionalCost += 4;
        }
        else if (sugar.isSelected() || cream.isSelected()) 
        {
          additionalCost += 2;
        }
        double totalPrice = basePrice + additionalCost;
        
        
        receiptFrame.setSize(550, 600);
        JLabel receipt = new JLabel("RECEIPT");
        receipt.setFont(new Font("Serif", Font.BOLD, 60));
        receipt.setForeground(Color.WHITE);
        setLayout(null);
        receipt.setBounds(830, 70, 700, 400);
        receiptFrame.add(receipt);
        receipt.setVisible(true);
        
         JLabel base = new JLabel("Base Price: $" + basePrice + "\n");
         JLabel sugar1 = new JLabel("More Sugar: +$2\n");
         sugar1.setVisible(false);
         JLabel cream1 = new JLabel("More Cream: +$2\n");
         cream1.setVisible(false);
         
         if (sugar.isSelected()) {
           sugar1.setVisible(true);
            }
            if (cream.isSelected()) {
              cream1.setVisible(true);
            }
            JLabel total = new JLabel("Total Price: $" + totalPrice + "\n");
            
        setLayout(null);
        base.setBounds(800, 400, 700, 40);
        receiptFrame.add(base);
        base.setFont(new Font("Serif", Font.BOLD, 50));
        base.setForeground(Color.WHITE);
        
        setLayout(null);
        sugar1.setBounds(800, 450, 700, 40);
        receiptFrame.add(sugar1);
        sugar1.setFont(new Font("Serif", Font.BOLD, 50));
        sugar1.setForeground(Color.WHITE);
        
        setLayout(null);
        cream1.setBounds(800, 550, 700, 40);
        receiptFrame.add(cream1);
        cream1.setFont(new Font("Serif", Font.BOLD, 50));
        cream1.setForeground(Color.WHITE);
        
        setLayout(null);
        total.setBounds(800, 750, 700, 40);
        receiptFrame.add(total);
        total.setFont(new Font("Serif", Font.BOLD, 50));
        total.setForeground(Color.WHITE);
        
        receiptFrame.setVisible(true);
        
        ImageIcon gifIcon = new ImageIcon(getClass().getResource("gif1.gif")); // Replace with your GIF path
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(1100, 550, 1000, 400);
        receiptFrame.add(gifLabel);  
        
        ImageIcon gifIcon2 = new ImageIcon(getClass().getResource("gif2.gif")); // Replace with your GIF path
        JLabel gifLabel2 = new JLabel(gifIcon2);
        gifLabel2.setBounds(30, 350, 1000, 600);
        receiptFrame.add(gifLabel2);  
 
      }
      }
      catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }

    
  public static void main(String[] args)
  {
    JFrameCategory3Hot2 frame2 = new JFrameCategory3Hot2();
    frame2.setVisible(true);
  }
}