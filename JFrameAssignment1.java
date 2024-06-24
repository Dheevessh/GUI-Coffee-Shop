import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException; 
import java.io.IOException;
import javax.sound.sampled.*;


public class JFrameAssignment1 extends JFrame implements ActionListener
{
  
//aFrame
  //frame
  JFrame aFrame = new JFrame ("Coffee shop name");
   
  //text fields
  JLabel title = new JLabel("Welcome to my Coffe Shop");
  
  JLabel name = new JLabel("Enter your name:");
  JTextField nameField = new JTextField(12);
  
  JLabel email = new JLabel("Enter your email:");
  JTextField emailField = new JTextField(12);
  
  //menu bars
  JMenuBar mainBar1 = new JMenuBar();
  JMenu menu1 = new JMenu("Setings");
  JMenuItem exit1 = new JMenuItem("Exit");
  JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Sound");
  
  //buttons
  JButton next1 = new JButton("Next.");
  
  
//bFrame
  //frame and font
  JFrame bFrame = new JFrame("Category");
  
  //JLabel
  JLabel category = new JLabel("Category Of Drinks:");
  JLabel category1 = new JLabel("Frappe");
  JLabel category2 = new JLabel("Iced");
  JLabel category3 = new JLabel("Hot");
  
  //menu bars
  JMenuBar mainBar2 = new JMenuBar();
  JMenu menu2 = new JMenu("Setings");
  JMenuItem exit2 = new JMenuItem("Exit");
  JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Sound");
      
  //buttons
  JButton cat1 = new JButton(new ImageIcon("Frape Category.jpg"));
  JButton cat2 = new JButton(new ImageIcon("Iced Coffee Category.jpg"));
  JButton cat3 = new JButton(new ImageIcon("Hot Coffee Category.jpg"));
  
  JButton next2 = new JButton("Next..");
  
  //music
  Clip clip;
  
  public JFrameAssignment1()
  {
    // Setup for audio
    setupAudio();

    ImageIcon backgroundImage = new ImageIcon(getClass().getResource("Background images.jpg"));
    JLabel backgroundLabel = new JLabel(backgroundImage);
    setContentPane(backgroundLabel);
    

     
//aFrame:
 //framen and font
    setSize(600,550);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   //title
    title.setFont(new Font("Serif", Font.BOLD, 50));
    title.setForeground(Color.WHITE); 
    
    //name
    name.setFont(new Font("Serif", Font.PLAIN, 20));
    name.setForeground(Color.WHITE); 
    
    //nameField
    nameField.setFont(new Font("Serif", Font.PLAIN, 20));
    nameField.setForeground(Color.BLACK); 
    
    //email
    email.setFont(new Font("Serif", Font.PLAIN, 20));
    email.setForeground(Color.WHITE); 
    
    //emailField
    emailField.setFont(new Font("Serif", Font.PLAIN, 20));
    emailField.setForeground(Color.BLACK); 
    
    
  //LAYOUT
    //for title
    setLayout(null);
    title.setBounds(650, 200, 600, 50);
    add(title);
    
    //for name
    setLayout(null);
    name.setBounds(800, 570, 300, 50);
    add(name);
        
    //for name field
    setLayout(null);
    nameField.setBounds(1000, 580, 100, 30);
    add(nameField);
    
    //for email 
    setLayout(null);
    email.setBounds(800, 650, 300, 50); 
    add(email);

    //email field
    setLayout(null);
    emailField.setBounds(1000, 660, 100, 30);
    add(emailField);
    
    //for NEXT button
    setLayout(null);
    next1.setBounds(1100, 770, 80, 30);
    add(next1);
    

    
  //menu bars
    setJMenuBar(mainBar1);
    mainBar1.add(menu1);
    menu1.add(check1);
    menu1.add(exit1);
    check1.addActionListener(this);
    exit1.addActionListener(this);
    
  //buttons
    add(next1);
    next1.addActionListener(this);
    
    
//bFrame:
    ImageIcon backgroundImage1 = new ImageIcon(getClass().getResource("Background images.jpg"));
    JLabel backgroundLabel1 = new JLabel(backgroundImage1);
    bFrame.setContentPane(backgroundLabel1);
    
    
  //frame and font
    bFrame.setSize(600,550);
    bFrame.setVisible(false);
    bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Category
    category.setFont(new Font("Serif", Font.BOLD, 50));
    category.setForeground(Color.WHITE); 
    
    category1.setFont(new Font("Serif", Font.BOLD, 30));
    category1.setForeground(Color.WHITE); 
    
    category2.setFont(new Font("Serif", Font.BOLD, 30));
    category2.setForeground(Color.WHITE);
    
    category3.setFont(new Font("Serif", Font.BOLD, 30));
    category3.setForeground(Color.WHITE); 
    
  //LAYOUT
    
    //for Category
    setLayout(null);
    category.setBounds(120, 350, 500, 400);
    bFrame.add(category);
    
    setLayout(null);
    category1.setBounds(220, 100, 500, 400);
    bFrame.add(category1);
    
    setLayout(null);
    category2.setBounds(1600, 100, 500, 400);
    bFrame.add(category2);
    
    setLayout(null);
    category3.setBounds(520, 550, 500, 400);
    bFrame.add(category3);
    
    //for cat1
    setLayout(null);
    cat1.setBounds(350, 50, 500, 400);
    bFrame.add(cat1);
    cat1.addActionListener(this);
    
   //for cat2
    setLayout(null);
    cat2.setBounds(1050, 60, 500, 400);
    bFrame.add(cat2);
    cat2.addActionListener(this);
    
    //for cat3
    setLayout(null);
    cat3.setBounds(650, 500, 500, 400);
    bFrame.add(cat3);
    cat3.addActionListener(this);
    
  //menu bars
    bFrame.setJMenuBar(mainBar2);
    mainBar2.add(menu2);
    menu2.add(check2);
    menu2.add(exit2);
    check2.addActionListener(this);
    exit2.addActionListener(this); 
  }
  
   private void setupAudio() {
    try {
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("music1.wav"));
      clip = AudioSystem.getClip();
      clip.open(audioInputStream);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
     
    }
    
  }
  
  
  public void actionPerformed(ActionEvent e)
  {
    
    Object source = e.getSource();
//Action for aFrame
        if (e.getActionCommand().equals("Next.")) {
          try {
            if (nameField.getText().isEmpty()) {
              throw new InputMismatchException("Name field cannot be empty");
            }
            if (!emailField.getText().contains("@")) {
              throw new InputMismatchException("Invalid email address");
            }
            bFrame.setVisible(true);
            bFrame.setSize(1000, 1500);
            
            } catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
            
    //Actions for menu bar
    if (source == exit1 || source == exit2)
    {
      System.exit(0);
    }
     else if (source == check1 || source == check2) {
      if (check1.isSelected() || check2.isSelected()) {
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
      } else {
        clip.stop();
      }  
  }
     

    
//Action for bFrame
    else if (e.getSource() == cat1) 
    {
      JFrameCategory1 firstCat = new JFrameCategory1();
      firstCat.setVisible(true);
      this.dispose();
    }
    else if (e.getSource() == cat2) 
    {
      JFrameCategory2 firstCat = new JFrameCategory2();
      firstCat.setVisible(true);
      this.dispose();
    }
    else if (e.getSource() == cat3)
    {
      JFrameCategory3 firstCat = new JFrameCategory3();
      firstCat.setVisible(true);
      this.dispose();
    }
    
    
  }
  public static void main(String[] args)
  {
    JFrameAssignment1 frame = new JFrameAssignment1();
    frame.setVisible(true);
  }
}
  
  
  
  
  
  
  
  
  
  
  
  
  