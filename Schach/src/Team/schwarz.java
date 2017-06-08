/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team;

import java.util.ArrayList;
import java.util.List;
import schach.Figur;

/**
 *
 * @author Johannes Rohr
 */
public class schwarz extends Teams
{
    List<Figur> figuren = new ArrayList<>();
    private String color = "schwarz";
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
