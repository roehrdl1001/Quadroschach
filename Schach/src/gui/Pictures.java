package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pictures
{
    
    public JLabel getPic(int i, int j) throws IOException
    {
        String name = "";
        if (i == 1 && (j > 2 || j < 11))
            name = "Bauer_Weiß";
        else if(j == 1 && (i > 2 || i < 11))
            name = "Bauer_Silber";
        else if(i == 11 && (j > 2 || j < 11))
            name = "Bauer_Schwarz";
        else if(j == 11 && (i > 2 || i < 11))
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
                default: return null;
            }
        }
        else if(j == 0)
        {
            return null;
        }
        else
        {
            return null;
        }
        
        JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("src\\pics\\"+name+".png"))));
        return label;
    }
}
