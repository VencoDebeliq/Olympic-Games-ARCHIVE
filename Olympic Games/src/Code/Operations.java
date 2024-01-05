/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
    
    public static ArrayList <String> generateNationality()
    {
        ArrayList <String> items = new ArrayList<> ();
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT Nationality_Name FROM Nationality");
            while (rs.next())
            {
                items.add(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return items;
    }
    
    public static ArrayList <String> generateDiscipline()
    {
        ArrayList <String> items = new ArrayList<> ();
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT Discipline_Name FROM Discipline");
            while (rs.next())
            {
                items.add(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.getMessage());
        }
        return items;
    }
}
