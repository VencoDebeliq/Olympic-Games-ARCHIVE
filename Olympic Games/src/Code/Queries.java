/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.sql.*;

/**
 *
 * @author Ventsislav Peychev
 */
public class Queries {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Queries(String text) {
        this.text = text;
    }
    
    public Queries()
    {
        this("");
    }
    
    @Override
    public String toString()
    {
        return getText();
    }
    
    public ResultSet execute()
    {
        ResultSet rs = null;
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            rs = s.executeQuery(getText());
            conn.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    
    public void executeUpdate()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            s.executeUpdate(getText());
            conn.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
