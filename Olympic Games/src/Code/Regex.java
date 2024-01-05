package Code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author v_pai
 */
import java.util.regex.*;
public class Regex {
    public static boolean isDateValid(String a){ // regex checking for a correct date
        Pattern p = Pattern.compile("^[0-3]\\d[/][0-3]\\d[/]\\d{4}");
        Matcher m = p.matcher(a);
        return m.matches();
    }
}
