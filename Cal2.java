/**
 * Write a description of class Calculator1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Cal2 extends JFrame
{
    JTextField text;
    JButton btn1,btn2,btn3,btn4,
     btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEq,btnAdd,btnMin,
     btnMult,btnDv,btnClear;
    double fNum,sNum;
    String opparater,result,clr;
    
    Cal2(){
        setSize(270,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("CALCULATOR");
        setVisible(true);
        setResizable(false);
        
        text = new JTextField(50);
        text.setBounds(10,10,230,30);
        text.setHorizontalAlignment(SwingConstants.RIGHT);
        text.setFont(new Font("SansSerif",Font.BOLD,20));
       
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnDot = new JButton(".");
        btnClear = new JButton("CLEAR");
        btnEq = new JButton("=");
        btnAdd = new JButton("+");
        btnMin = new JButton("-");
        btnMult = new JButton("*");
        btnDv = new JButton("/");
        btn1.setBounds(10,50,50,50);
        btn1.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn2.setBounds(70,50,50,50);
        btn2.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn3.setBounds(130,50,50,50);
        btn3.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn4.setBounds(10,110,50,50);
        btn4.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn5.setBounds(70,110,50,50);
        btn5.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn6.setBounds(130,110,50,50);
        btn6.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn7.setBounds(10,170,50,50);
        btn7.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn8.setBounds(70,170,50,50);
        btn8.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn9.setBounds(130,170,50,50);
        btn9.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btn0.setBounds(70,230,50,50);
        btn0.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnDot.setBounds(130,230,50,50);
        btnDot.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnClear.setBounds(10,290,170,50);
        btnClear.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnEq.setBounds(10,230,50,50);
        btnEq.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnAdd.setBounds(190,230,50,110);
        btnAdd.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnMult.setBounds(190,110,50,50);
        btnMult.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnDv.setBounds(190,170,50,50);
        btnDv.setFont(new Font("SansSerif",Font.BOLD,15));
        
        btnMin.setBounds(190,50,50,50);
        btnMin.setFont(new Font("SansSerif",Font.BOLD,15));
        //Button Visible
        add(text);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btnDot);
        add(btnClear);
        add(btnEq);
        add(btnAdd);
        add(btnMin);
        add(btnMult);
        add(btnDv);
        //Action Events
        
        btn1.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"1");
            }
        });
        
        btn2.addActionListener(new ActionListener() 
        {
          public void actionPerformed(ActionEvent e) {
            text.setText(text.getText()+"2");
          }
       });
    
       btn3.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e){
              text.setText(text.getText()+"3");
          }
       });
       
        btn4.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"4");
            }
        });
        
         btn5.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"5");
            }
        });
        
         btn6.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"6");
            }
        });
        
         btn7.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"7");
            }
        });
        
         btn8.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"8");
            }
        });
        
         btn9.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"9");
            }
        });
        
         btn0.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText()+"0");
            }
        });
       
       
       //When Click Oparation Buttons
       btnAdd.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e){
            fNum = Double.parseDouble(text.getText());
            text.setText("");
            opparater = "+";
            //result = fNum + sNum;
          }
        });
       
       btnMin.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              fNum = Double.parseDouble(text.getText());
              text.setText("");
              opparater = "-";
          }
        });
       btnMult.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
             fNum = Double.parseDouble(text.getText());
             text.setText("");
             opparater = "*";  
            }
        });
        
       btnDv.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e){
             fNum = Double.parseDouble(text.getText());
             text.setText("");
             opparater = "/";  
            }
        });
        
        
       //When Click EQUAL button
       
       btnEq.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e){
              sNum = Double.parseDouble(text.getText());
              
              if(opparater == "+"){
                result = Double.toString(fNum + sNum);
                text.setText(result);
              }
              else if(opparater == "-"){
                result = Double.toString(fNum - sNum);
                text.setText(result);
              }
              else if(opparater == "*"){
                result = Double.toString(fNum * sNum);
                text.setText(result);
                }
              else if(opparater == "/"){
                result = Double.toString(fNum / sNum);
                text.setText(result);
              }
            }
        });
        
       btnClear.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e){
              text.setText("");
          }
        });
  }
}
