package views;

import models.system.LSystem;
import util.EcouteurModele;
import util.ModelEcoutable;

import javax.swing.*;
import java.awt.*;

/**
 * Vue contenant la partie gauche et la partie droite
 */
public class PrincipalView extends JPanel implements EcouteurModele {
    private LSystem lSystem;
    private LeftPanel leftPanel;
    private RightPanel rightPanel;
    public PrincipalView(LSystem lSystem){
        this.lSystem=lSystem;
        this.lSystem.ajouterEcouteur(this);
        this.setLayout(new FlowLayout((FlowLayout.LEFT)));
        this.leftPanel=new LeftPanel(lSystem);
        this.rightPanel=new RightPanel(lSystem);


        this.add(this.leftPanel);
        this.add(this.rightPanel);
    }
    @Override
    public void modeleMisAJour(ModelEcoutable source) {
        if(source==lSystem){
            repaint();
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.rightPanel.repaint();
    }


}
