package views;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class DashboardCard extends JPanel {
    public DashboardCard() {
        setPreferredSize(new Dimension(190, 106));
        setBackground(new Color(244,244,244));
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Define a forma arredondada
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50);
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(roundedRectangle);
        
        // Desenha a borda
        g2d.setColor(new Color(255, 255, 255));
        g2d.draw(roundedRectangle);
    }

    
}