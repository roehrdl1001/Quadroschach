package Team;

import java.awt.Color;
import java.util.List;
import schach.Figur;

public abstract class Teams
{
    private String color;
    public abstract String getColor();
    public abstract List<Figur> getFiguren();
}
