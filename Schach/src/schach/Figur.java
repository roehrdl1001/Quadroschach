
package schach;

import javax.swing.JPanel;


public abstract class Figur
{
    DrawMaster master;
    public Figur(DrawMaster master)
    {
        this.master = master;
    }
    private int x, y;
    public String getPosition()
    {
        return x+":"+y;
    }
    
    public abstract void move(boolean schlagen ,boolean Zweier, JPanel panel);
    
    public abstract void setCoords(double x, double y);
    
    public abstract double getX();
    
    public abstract double getY();
}
