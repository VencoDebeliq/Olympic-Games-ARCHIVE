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
    private static Connection conn = null;
    
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
    
    public ResultSet execute() throws Exception
    {
        //Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic_games_archive", "root", "Npmg2022!");
        //Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(getText());
        
        return rs;
    }
    
    public void executeUpdate() throws Exception
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/olympic_games_archive", "root", "Npmg2022!");
        //Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
        Statement s = conn.createStatement();
        s.executeUpdate(getText());
    }
    
    @Override
    protected void finalize()
    {
        try
        {
            conn.close();
        }
        catch(Exception ex)
        {
            
        }
    }
}
