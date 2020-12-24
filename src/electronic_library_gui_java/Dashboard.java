/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_library_gui_java;

/**
 *
 * @author lm47
 */
public class Dashboard {
    public Dashboard() {
        dash_board();
    }
    
    private void dash_board() {
        Print.menu("DashBoard");
        Print.list(list);
        
    }
}
