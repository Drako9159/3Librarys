
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class LibraryB {
    public LibraryB(){
        try{
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel()); 
                } catch (Exception ex){
                System.out.println(ex.getMessage());
                }
                JFrame frameA = new JFrame();
                frameA.setTitle("JCalendar");
                frameA.setSize(400, 400);
                frameA.setLocation(850, 320);
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
                
                JLabel title0 = new JLabel("Librería JCalendar ", JLabel.CENTER);
                title0.setBounds(0, 10, 400, 10);
                JButton btn0 = new JButton("Select");
                JButton btn1 = new JButton("Select");
           
                JCalendar calendar0 = new JCalendar();
                
                calendar0.setTodayButtonVisible(true);
                calendar0.setTodayButtonText("Hoy");
                btn0.setBounds(30, 300, 80, 30);
                btn1.setBounds(120, 300, 80, 30);
                calendar0.setBounds(50, 40, 300, 240);
                
                frameA.add(title0);
                frameA.add(calendar0);
                frameA.add(btn0);
                frameA.add(btn1);
                
                
                frameA.setVisible(true);
    }
    
}
