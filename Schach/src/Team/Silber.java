package Team;

import java.util.ArrayList;
import java.util.List;
import schach.Figur;

public class Silber extends Teams
{
    List<Figur> figuren = new ArrayList<>();
    private String color = "silber";
    @Override
    public String getColor()
    {
        return color;
    }
    
    public void setFiguren(List<Figur> figs)
    {
        figuren = figs;
    }

    @Override
    public List<Figur> getFiguren()
    {
        return figuren;
    }
}
