
package mayıntarlası;

import javax.swing.JFrame;

public class Bayrak extends JFrame {
    private static int width = 400;
    private static int height = 400;
    
    public Bayrak(){
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        System.out.println(getInsets().left);
        setSize(width,height);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public static int getScreenwidth(){
        return width;
    }
    public static int getScreenHeibht(){
        return height;
    }
    }
