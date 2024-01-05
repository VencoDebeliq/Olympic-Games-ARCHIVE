/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Operations {
    public static void btn(JFrame a, JFrame obj){
        a.setVisible(true);
        obj.setVisible(false);
    }
    
    public static ArrayList <String> generateNationality() // gets all the nationalities from the Database
    {
        ArrayList <String> items = new ArrayList<> ();
        try
        {
            ResultSet rs = new Queries("SELECT Nationality_Name FROM Nationality").execute();
            while (rs.next())
            {
                items.add(rs.getString(1));
            }
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return items;
    }
    
    public static ArrayList <String> generateDiscipline() // gets all the Disciplines from the Database
    {
        ArrayList <String> items = new ArrayList<> ();
        try
        {
            ResultSet rs = new Queries("SELECT Discipline_Name FROM Discipline").execute();
            while (rs.next())
            {
                items.add(rs.getString(1));
            }
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return items;
    }
}
