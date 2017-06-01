/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schach;

import javax.swing.JPanel;

/**
 *
 * @author Johannes Rohr
 */
public class Bauer extends Figur
{
    double x,y;

    public Bauer(DrawMaster master)
    {
        super(master);
    }
    
    @Override
    public String getPosition()
    {
        return x + ":" + y;
    }
    
    @Override
    public void move(boolean schlagen, boolean startZweier, JPanel panel)
    {
        String size = master.getSizes();
        String[] s = size.split(":");
        double sizeX = Double.parseDouble(s[0]);
        double sizeY = Double.parseDouble(s[1]);
        if(startZweier)
        {
            x = sizeX * 3;
            y = y + (2 * sizeY);
            
        }
        else if(schlagen)
        {
            
        }
        else
        {
            x = sizeX * 3 ;
            y = y + sizeY;
        }
    }
    
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    @Override
    public void setCoords(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Bauer{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
