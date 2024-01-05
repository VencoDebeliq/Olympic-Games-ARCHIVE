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
    
    public ResultSet execute() throws Exception
    {
        Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(getText());
        conn.close();
        
        return rs;
    }
    
    public void executeUpdate() throws Exception
    {
        Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
        Statement s = conn.createStatement();
        s.executeUpdate(getText());
        conn.close();
    }
}
