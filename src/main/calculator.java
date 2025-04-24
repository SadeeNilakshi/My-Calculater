/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */

class close extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

class cal implements ActionListener{
    
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    TextField tf;
    
    String fv, sv, op, fd ;
    double fdv, sdv, tot;

    public cal(Button b1, Button b2, Button b3, Button b4, Button b5, Button b6, Button b7, Button b8, Button b9,
            Button b10, Button b11, Button b12, Button b13, Button b14, Button b15, Button b16, Button b17, Button b18,
            Button b19, Button b20,  
            
             TextField tf, String fv, String sv, String op, double fdv, double sdv) {

        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.b6 = b6;
        this.b7 = b7;
        this.b8 = b8;
        this.b9 = b9;
        this.b10 = b10;
        this.b11 = b11;
        this.b12 = b12;
        this.b13 = b13;
        this.b14 = b14;
        this.b15 = b15;
        this.b16 = b16;
        this.b17 = b17;
        this.b18 = b18;
        this.b19 = b19;
        this.b20 = b20;
        this.tf = tf;
        this.fv = fv;
        this.sv = sv;
        this.op = op;
        this.fdv = fdv;
        this.sdv = sdv;
    }
    cal(){
        Frame f1 = new Frame();
        f1.addWindowListener(new close());
        f1.setBounds(500, 150, 350, 500);
        f1.setResizable(false);
        f1.setVisible(true);
        MenuBar mbar = new MenuBar();
        
        
        MenuItem mi1 = new MenuItem("Copy");
        MenuItem mi2 = new MenuItem("Paste");
        MenuItem mi3 = new MenuItem("Help");
        MenuItem mi4 = new MenuItem("About");
        MenuItem mi5 = new MenuItem("Light");
        MenuItem mi6 = new MenuItem("Dark");

       
        Menu m1 = new Menu("Edit");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Help");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Theme");
        m3.add(mi5);
        m3.add(mi6);

      
        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        
        Color customColor0 = new Color(78, 110, 129);
        Color customColor1 = new Color(10,77,104);
        Color customColor3 = new Color(39, 48, 67);
        Color customColor4 = new Color(0, 43, 91);
        
        
        
        mi5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                b1.setBackground(customColor0);
                b2.setBackground(customColor0);
                b3.setBackground(customColor0);
                b4.setBackground(customColor0);
                b5.setBackground(customColor0);
                b6.setBackground(customColor0);
                b7.setBackground(customColor0);
                b8.setBackground(customColor0);
                b9.setBackground(customColor0);
                b10.setBackground(customColor0);
                b11.setBackground(customColor0);
                b12.setBackground(customColor1);
                b13.setBackground(customColor1);
                b14.setBackground(customColor1);
                b15.setBackground(customColor1);
                b16.setBackground(customColor1);
                b17.setBackground(customColor0);
                b18.setBackground(customColor1);
                b19.setBackground(customColor1);
                b20.setBackground(customColor1);
                
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        
        mi6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                b1.setBackground(customColor3);
                b2.setBackground(customColor3);
                b3.setBackground(customColor3);
                b4.setBackground(customColor3);
                b5.setBackground(customColor3);
                b6.setBackground(customColor3);
                b7.setBackground(customColor3);
                b8.setBackground(customColor3);
                b9.setBackground(customColor3);
                b10.setBackground(customColor3);
                b11.setBackground(customColor3);
                b12.setBackground(customColor4);
                b13.setBackground(customColor4);
                b14.setBackground(customColor4);
                b15.setBackground(customColor4);
                b16.setBackground(customColor4);
                b17.setBackground(customColor3);
                b18.setBackground(customColor4);
                b19.setBackground(customColor4);
                b20.setBackground(customColor4);
                
                 
                
               ;
                
                
                
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
    });
        
        
        
        f1.setMenuBar(mbar);
        
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("SQRT");
        b13 = new Button("+");
        b14 = new Button("-");
        b15 = new Button("*");
        b16 = new Button("/");
        b17 = new Button("=");
        b18 = new Button("AC");
        b19 = new Button("DEL");
        b20 = new Button("%");
        
        Font font1 = new Font("Tahoma", Font.BOLD, 15);
        Color customColor = new Color(78, 110, 129);
        Color customColor2 = new Color(10,77,104);
        
        b1.setFont(font1);
        b1.setBackground(customColor);
        b1.setForeground(Color.white);
        b2.setFont(font1);
        b2.setBackground(customColor);
        b2.setForeground(Color.white);
        b3.setFont(font1);
        b3.setBackground(customColor);
        b3.setForeground(Color.white);
        b4.setFont(font1);
        b4.setBackground(customColor);
        b4.setForeground(Color.white);
        b5.setFont(font1);
        b5.setBackground(customColor);
        b5.setForeground(Color.white);
        b6.setFont(font1);
        b6.setBackground(customColor);
        b6.setForeground(Color.white);
        b7.setFont(font1);
        b7.setBackground(customColor);
        b7.setForeground(Color.white);
        b8.setFont(font1);
        b8.setBackground(customColor);
        b8.setForeground(Color.white);
        b9.setFont(font1);
        b9.setBackground(customColor);
        b9.setForeground(Color.white);
        b10.setFont(font1);
        b10.setBackground(customColor);
        b10.setForeground(Color.white);
        b11.setFont(font1);
        b11.setBackground(customColor);
        b11.setForeground(Color.white);
        b12.setFont(font1);
        b12.setBackground(customColor2);
        b12.setForeground(Color.white);
        b13.setFont(font1);
        b13.setBackground(customColor2);
        b13.setForeground(Color.white);
        b14.setFont(font1);
        b14.setBackground(customColor2);
        b14.setForeground(Color.white);
        b15.setFont(font1);
        b15.setBackground(customColor2);
        b15.setForeground(Color.white);
        b16.setFont(font1);
        b16.setBackground(customColor2);
        b16.setForeground(Color.white);
        b17.setFont(font1);
        b17.setBackground(customColor);
        b17.setForeground(Color.white);
        b18.setFont(font1);
        b18.setBackground(customColor2);
        b18.setForeground(Color.white);
        b19.setFont(font1);
        b19.setBackground(customColor2);
        b19.setForeground(Color.white);
        b20.setFont(font1);
        b20.setBackground(customColor2);
        b20.setForeground(Color.white);
        
        tf = new TextField();
        tf.setPreferredSize(new Dimension(250,40));
        
        Font font = new Font("Cambria Math", Font.BOLD, 20);
        tf.setFont(font);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);
        
        Panel p1 = new Panel();
        p1.setBackground(customColor);
        Panel p2 = new Panel();
        p2.setBackground(Color.WHITE);
        GridLayout g1 = new GridLayout(5, 5, 6, 6);//grid layout
        p2.setLayout (g1);
        
        p1.add(tf);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b15);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b13);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b14);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b16);
        p2.add(b11);
        p2.add(b10);
        p2.add(b17);
        p2.add(b12);
       
        
        
   
        
        f1.add(p2, BorderLayout.CENTER);
        f1.add(p1, BorderLayout.NORTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent d) {
        Object o = d.getSource();

        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());

        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());

        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());

        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());

        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());

        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());

        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());

        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());

        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());

        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());

        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());

        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());

        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());

        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());

        
        } else if (o.equals(b13)) {
            fv = tf.getText();
            tf.setText("");

            op = b13.getLabel();

        } else if (o.equals(b14)) {
            fv = tf.getText();
            tf.setText("");

            op = b14.getLabel();

        } else if (o.equals(b15)) {
            fv = tf.getText();
            tf.setText("");

            op = b15.getLabel();

        } else if (o.equals(b16)) {
            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();

        }else if (o.equals(b18)) {
            tf.setText("");
        } else if (o.equals(b19)) {
            int lenght = tf.getText().length();
            int number = tf.getText().length()-1;
            String store;
            if(lenght > 0){
                StringBuilder back = new StringBuilder(tf.getText());
                back.deleteCharAt(number);
                store=back.toString();
                tf.setText(store);
        }else if (o.equals(b20)) {  //percentage
            fv = tf.getText();
            tf.setText("");

            op = b20.getLabel();
        }

        }else if (o.equals(b17)) {
            sv = tf.getText();


            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");

            }else if (op.equals("%")) {

                tot = ((fdv) / 100) * sdv;

                tf.setText(tot + "");

            }
        }else if (o.equals(b12)){ 
        fv = tf.getText();
        fdv = Double.parseDouble(fv);
        tf.setText(Math.sqrt(fdv)+(""));
      }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


public class calculator {
    public static void main(String[] args) {
        new cal();
    }
    
}
