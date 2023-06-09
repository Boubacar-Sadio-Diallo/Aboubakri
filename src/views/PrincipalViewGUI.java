/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import models.system.LSystem;

import javax.swing.*;
import java.awt.*;

/**
 * Instancie la vue
 * @author ANTOINE
 */
public class PrincipalViewGUI extends JFrame {
    private LSystem lSystem;
    public PrincipalViewGUI(LSystem lSystem){
        this.lSystem=lSystem;

        PrincipalView principalView =new PrincipalView(this.lSystem);
        this.add(principalView);

        createJFrame(this, "lindenmayer system - project", 850, 600);
    }
    public PrincipalViewGUI(){
        this(new LSystem());
    }


    private static void createJFrame(JFrame frame, String title, int minimumSizeWidth, int minimumSizeHeight) {

        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(minimumSizeWidth, minimumSizeHeight));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle(title.toUpperCase());

    }
}
