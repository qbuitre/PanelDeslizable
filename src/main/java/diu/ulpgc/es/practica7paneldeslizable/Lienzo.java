/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.ulpgc.es.practica7paneldeslizable;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Jorge Santana
 */
public class Lienzo extends JPanel {
    private BufferedImage img = null;
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
        repaint();
    }
    
    public void setImage(BufferedImage img){
        this.img = img;
        this.setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        repaint();
    }
}
