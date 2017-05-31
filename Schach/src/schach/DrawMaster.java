package schach;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class DrawMaster
{
    private final JPanel board;
    private Graphics2D g;
    
    private double sizeX;
    private double sizeY;
    
    private final String[] figuren = {"T", "S", "L", "K", "D", "L", "S", "T"};
    
    public DrawMaster(JPanel panel)
    {
        board = panel;
        updateGrpahics();
        updateSize();
    }
    
    private void updateGrpahics()
    {
        g = (Graphics2D)board.getGraphics();
    }
    
    private void updateSize()
    {
        sizeX = board.getWidth() / 14;
        sizeY = board.getHeight() / 14;
        
        System.out.println("X:" + sizeX + " Y:" + sizeY);
    }
    
    public void draw()
    {
        drawHorizontal(3 * sizeX, 0, true);
        drawHorizontal(3 * sizeX, 11 * sizeY, false);
        
        drawBody(0, 3 * sizeY);
    }
    
    private void drawHorizontal(double x, double y, boolean top)
    {
        Color col1;
        Color col2;
        
        if(top)
        {
            col1 = Color.WHITE;
            col2 = Color.BLACK;
        }
        else
        {
            col1 = Color.BLACK;
            col2 = Color.WHITE;
        }
        
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                double posX = x + (sizeX * j) * 2;
                double posY = y + (sizeY * i);
                
                g.setColor(col1);
                g.fill(new Rectangle2D.Double(posX, posY, sizeX, sizeY));
                
                g.setColor(col2);
                drawZeichenHorizontal(posX, posY, i, 2 * j, top);
            }
            
            for (int j = 0; j < 4; j++)
            {
                double posX = x + (sizeX * (j + 1)) + (sizeX * j);
                double posY = y + (sizeY * i);
                
                g.setColor(col2);
                g.fill(new Rectangle2D.Double(posX, posY, sizeX, sizeY));
                
                g.setColor(col1);
                drawZeichenHorizontal(posX, posY, i, (2 * j) + 1, top);
            }
            
            Color col = col1;
            col1 = col2;
            col2 = col;
        }
    }
    
    private void drawZeichenHorizontal(double x, double y, int i, int j, boolean top)
    {
        y += sizeY;
        String figur = "";
        
        if(top)
        {
            if(i < 1)
                figur = figuren[j];
            else if(i < 2)
                figur = "B";
        }
        else
        {
            if(i > 1)
                figur = figuren[figuren.length - 1 - j];
            else if(i > 0)
                figur = "B";
        }
        
        g.drawString(figur, (float)x, (float)y);
    }
    
    private void drawZeichenBody(double x, double y, int i, int j, boolean first)
    {
        y += sizeY;
        String figur = "";
        
        if(first)
        {
            if(j == 0)
                figur = figuren[i];
            else if(j == 6)
                figur = "B";
        }
        else
        {
            if(j == 0)
                figur = "B";
            else if(j == 6)
                figur = figuren[figuren.length - 1 - i];
        }
        
        g.drawString(figur, (float)x, (float)y);
    }
    
    private void drawBody(double x, double y)
    {
        updateGrpahics();
        updateSize();
        
        Color col1 = Color.WHITE;
        Color col2 = Color.BLACK;
        
        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                double posX = x + (sizeX * j) * 2;
                double posY = y + (sizeY * i);
                
                g.setColor(col1);
                g.fill(new Rectangle2D.Double(posX, posY, sizeX, sizeY));
                
                g.setColor(col2);
                drawZeichenBody(posX, posY, i, j, true);
            }
            
            for (int j = 0; j < 7; j++)
            {
                double posX = x + (sizeX * (j + 1)) + (sizeX * j);
                double posY = y + (sizeY * i);
                
                g.setColor(col2);
                g.fill(new Rectangle2D.Double(posX, posY, sizeX, sizeY));
                
                g.setColor(col1);
                drawZeichenBody(posX, posY, i, j, false);
            }
            
            Color col = col1;
            col1 = col2;
            col2 = col;
        }
    }
}
