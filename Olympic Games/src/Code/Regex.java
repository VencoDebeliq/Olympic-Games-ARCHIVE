package Code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v_pai
 */
import Entitys.OlympicGamesEdition;
import java.util.regex.*;
public class Regex {
    public static boolean isDateValid(String a){ // regex checking for a correct date
        Pattern p = Pattern.compile("^([0-2]\\d)|([3][01])[/]([1][0-2])|([1-9])[/]\\d{4}");
        Matcher m = p.matcher(a);
        return m.matches();
    }
    
    public static boolean checkName(String text) // regex checking for a valid name input
    {
        Pattern p = Pattern.compile("[A-Z][a-z]+");
        Matcher m = p.matcher(text);
        return m.matches();
    }
    
    public static boolean checkOlympicID(String text) // checking for a valid olympic games id input
    {
        try 
        {
            int id = Integer.parseInt(text);
            if (id < 1 || id > OlympicGamesEdition.getAll().size()) return false;
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public static boolean checkScore(String text) // regex checking for a valid record score input
    {
        Pattern p = Pattern.compile("[1-9]\\d*");
        Matcher m = p.matcher(text);
        return m.matches();
    }
    
    public static boolean checkMedalistDescription(String text) // regex checking for a valid medalist description input
    {
        String splited[] = text.split(",", 2);
        if (splited.length == 2)
        {
            
            Pattern p = Pattern.compile("[a-zA-Z]+");
            Matcher m = p.matcher(splited[1]);
            return (splited[0].equals("Men") || splited[0].equals("Women") || splited[0].equals("Mixed")) &&
                    m.matches();
        }
        else
        {
            Pattern p = Pattern.compile("[a-zA-Z]+");
            Matcher m = p.matcher(text);
            return m.matches();
        
        }
    }
}
