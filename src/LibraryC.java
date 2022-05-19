
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class LibraryC {
    public LibraryC(){
        try{
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());     
                } catch (Exception ex){
                System.out.println(ex.getMessage());
                }
                JFrame frameA = new JFrame();
                frameA.setTitle("FlatLaf");
                frameA.setSize(400, 200);
                frameA.setLocation(100, 100);
                frameA.setLayout(null);
                
                JMenuItem spec1 = new JMenuItem("Option1");
                JMenu menu0 = new JMenu("Files");
                JMenu menu1 = new JMenu("Tools");
                JMenu menu2 = new JMenu("Views");
                menu0.add(spec1);
                JMenuBar bar0 = new JMenuBar();
                bar0.add(menu0);
                bar0.add(menu1);
                bar0.add(menu2);
                frameA.setJMenuBar(bar0);
                
                JLabel title0 = new JLabel("Librería FlatLaf ", JLabel.CENTER);
                title0.setBounds(0, 10, 400, 10);
                JButton btn0 = new JButton("Select");
                JButton btn1 = new JButton("Select");
                btn0.setForeground(Color.BLACK);
                btn0.setBackground(Color.RED);
                btn1.setForeground(Color.BLACK);
                btn1.setBackground(Color.ORANGE);
                JTextField txt0 = new JTextField("Input");
                btn0.setBounds(30, 100, 80, 30);
                btn1.setBounds(120, 100, 80, 30);
                txt0.setBounds(50, 40, 300, 40);

                frameA.add(title0);
                frameA.add(txt0);
                frameA.add(btn0);
                frameA.add(btn1);
                frameA.setVisible(true);
        
    }
    
}
