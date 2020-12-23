/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JComboBox;

/**
 *
 * @author lm47
 */
public class ComboBox1 extends JComboBox {
    public ComboBox1(String str[], Font font, Rectangle rect) {
        super(str);
        this.setFont(font);
        this.setBounds(rect);
    }
}
