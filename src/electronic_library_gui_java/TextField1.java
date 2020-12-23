/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author lm47
 */
public class TextField1 extends JTextField {
    public TextField1(Font font,Rectangle rect, Color forg, Color backg, Border border) {
        this.setFont(font);
        this.setBounds(rect);
        this.setForeground(forg);
        this.setBackground(backg);
        this.setBorder(border);
    }
}
