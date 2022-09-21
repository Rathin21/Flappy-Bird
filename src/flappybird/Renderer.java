/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flappybird;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Renderer extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g){
        
        FlappyBird.flappyBird.repaint(g);
    }
        
    
}
