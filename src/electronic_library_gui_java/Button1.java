/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author lm47
 */
public class Button1 extends JButton {
    public Button1(String text, Rectangle rect, ActionListener action) {
        this.setText(text);
        this.setBounds(rect);
        this.setFocusable(false);
        this.addActionListener(action);
    }
}
