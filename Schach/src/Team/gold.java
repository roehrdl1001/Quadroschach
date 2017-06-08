package Team;

import java.util.ArrayList;
import java.util.List;
import schach.Figur;

public class gold extends Teams
{
    List<Figur> figuren = new ArrayList<>();
    private String color = "gold";
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
