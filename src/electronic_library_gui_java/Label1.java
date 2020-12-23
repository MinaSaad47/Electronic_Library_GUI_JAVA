/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JLabel;

/**
 *
 * @author lm47
 */
public class Label1 extends JLabel {
    public Label1(String text, Font font, Rectangle rect, Color color) {
        this.setText(text);
        this.setFont(font);
        this.setBounds(rect);
        this.setForeground(color);
    }
}
