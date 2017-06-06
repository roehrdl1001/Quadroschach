package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pictures
{
    
    public JLabel getB() throws IOException
    {
        return new JLabel(new ImageIcon(ImageIO.read(new File("src\\pics\\Bauer_Weiß.png"))));
    }
    public JLabel getPic(int i, int j) throws IOException
    {
        String name = "Bauer_Weiß";
        if (i == 1 && (j > 2 && j < 11))
            name = "Bauer_Weiß";
        else if(j == 1 && (i > 2 && i < 11))
            name = "Bauer_Silber";
        else if(i == 12 && (j > 2 && j < 11))
            name = "Bauer_Schwarz";
        else if(j == 12 && (i > 2 && i < 11))
            name = "Bauer_Gold";
        else if(i == 0)
        {
            switch(j)
            {
                case 3: name = "Turm_Weiß"; break;
                case 4: name = "Pferd_Weiß"; break;
                case 5: name = "Läufer_Weiß"; break;
                case 6: name = "König_Weiß"; break;
                case 7: name = "Königin_Weiß"; break;
                case 8: name = "Läufer_Weiß"; break;
                case 9: name = "Pferd_Weiß"; break;
                case 10: name = "Turm_Weiß"; break;
                default: name = "grau"; break;
            }
        }
        else if(j == 0)
        {
            switch(i)
            {
                case 3: name = "Turm_Silber"; break;
                case 4: name = "Pferd_Silber"; break;
                case 5: name = "Läufer_Silber"; break;
                case 6: name = "König_Silber"; break;
                case 7: name = "Königin_Silber"; break;
                case 8: name = "Läufer_Silber"; break;
                case 9: name = "Pferd_Silber"; break;
                case 10: name = "Turm_Silber"; break;
                default: name = "grau"; break;
            }
        }
        else if(j == 13)
        {
            switch(i)
            {
                case 3: name = "Turm_Gold"; break;
                case 4: name = "Pferd_Gold"; break;
                case 5: name = "Läufer_Gold"; break;
                case 6: name = "König_Gold"; break;
                case 7: name = "Königin_Gold"; break;
                case 8: name = "Läufer_Gold"; break;
                case 9: name = "Pferd_Gold"; break;
                case 10: name = "Turm_Gold"; break;
                default: name = "grau"; break;
            }
        }
        else if(i == 13)
        {
            switch(j)
            {
                case 3: name = "Turm_Schwarz"; break;
                case 4: name = "Pferd_Schwarz"; break;
                case 5: name = "Läufer_Schwarz"; break;
                case 6: name = "König_Schwarz"; break;
                case 7: name = "Königin_Schwarz"; break;
                case 8: name = "Läufer_Schwarz"; break;
                case 9: name = "Pferd_Schwarz"; break;
                case 10: name = "Turm_Schwarz"; break;
                default: name = "grau"; break;
            }
        }
        JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("src\\pics\\"+name+".png"))));
        return label;
    }
}
