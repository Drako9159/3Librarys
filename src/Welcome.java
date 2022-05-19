
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class Welcome extends JFrame{
    JButton btnA, btnB, btnC; 
    JLabel lbl0;
    JPanel panel0;
    ListenButton listenButton;
    
    public void Selection(){
        setTitle("Librerías");
        setSize(290, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        btnA = new JButton("Libería A");
        btnA.setBounds(10, 30, 255, 40);
        btnA.setBackground(Color.green);
        
        btnB = new JButton("Librería B");
        btnB.setBounds(10, 80, 255, 40);
        btnB.setBackground(Color.yellow);

        btnC = new JButton("Librería C");
        btnC.setBounds(10, 130, 255, 40);
        btnC.setBackground(Color.blue);
        btnC.setForeground(Color.WHITE);
        
        JMenuItem spec1 = new JMenuItem("Option1");
        JMenu menu0 = new JMenu("Files");
        JMenu menu1 = new JMenu("Tools");
        JMenu menu2 = new JMenu("Views");
        menu0.add(spec1);
        JMenuBar bar0 = new JMenuBar();
        bar0.add(menu0);
        bar0.add(menu1);
        bar0.add(menu2);
        setJMenuBar(bar0);        
         
        getContentPane().add(btnA);
        getContentPane().add(btnB);
        getContentPane().add(btnC);
        
        listenButton = new ListenButton();
        btnA.addActionListener(listenButton);
        btnB.addActionListener(listenButton);
        btnC.addActionListener(listenButton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public class ListenButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == btnA){
                LibraryA libA = new LibraryA();        
            }
            if(e.getSource() == btnB){
                LibraryB libB = new LibraryB();
            }
            if(e.getSource() == btnC){
                LibraryC libC = new LibraryC();
            }
        }
    }
}
