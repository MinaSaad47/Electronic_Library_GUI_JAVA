
package electronic_library_gui_java;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Electronic_Library_GUI_JAVA {

    
    public static void main(String[] args) {
        JFrame window = new JFrame("Electronic Library");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLayout(null);
        ImageIcon icon = new ImageIcon("img/icon.png");
        window.setIconImage(icon.getImage());
        JButton button = new JButton("Click Me!");
        button.setSize(100, 200);
        button.setVisible(true);
        window.add(button, JButton.CENTER);
        
    }
    
}
