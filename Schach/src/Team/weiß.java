package Team;

import java.util.ArrayList;
import java.util.List;
import schach.Figur;

public class weiß extends Teams
{
    List<Figur> figuren = new ArrayList<>();
    private String color = "weiß";
    @Override
    public String getColor()
    {
        return color;
    }

    @Override
    public List<Figur> getFiguren()
    {
        return figuren;
    }
    
}
