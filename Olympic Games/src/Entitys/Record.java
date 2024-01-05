/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author v_pai
 */
public class Record {
    private int ID;
    private int CompetitorID;
    private int Discipline;
    private int OlympicgamesID;
    private String Description;

    public void setID(int ID) {
        if(ID > 0)
            this.ID = ID;
    }

    public void setCompetitorID(int CompetitorId) {
        this.CompetitorID = CompetitorId;
    }

    public void setDiscipline(int Discipline) {
        if(Discipline >= 37)
            this.Discipline = Discipline;
    }

    public void setOlympicgamesID(int OlympicgamesID) {
        if(OlympicgamesID > 0)
            this.OlympicgamesID = OlympicgamesID;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getID() {
        return ID;
    }

    public int getCompetitorID() {
        return CompetitorID;
    }

    public int getDiscipline() {
        return Discipline;
    }

    public int getOlympicgamesID() {
        return OlympicgamesID;
    }

    public String getDescription() {
        return Description;
    }
       
    public Record(int ID, int CompetitorID, int Discipline, int OlympicgamesID, String Description){
        setID(ID);
        setCompetitorID(CompetitorID);
        setDiscipline(Discipline);
        setOlympicgamesID(OlympicgamesID);
        setDescription(Description);
    }
    
    public Record(){
        this(1, 0, 37, 1, "");
    }
    
    public static ArrayList <Record> getAll()
    {
        ArrayList <Record> ans = new ArrayList <>();
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Record");
            while (rs.next())
            {
                Record c = new Record();
                c.setID(rs.getInt("ID"));
                c.setCompetitorID(rs.getInt("Competitor_ID"));
                c.setDiscipline(rs.getInt("Discipline"));
                c.setOlympicgamesID(rs.getInt("Olympic_Games_ID"));
                c.setDescription(rs.getString("Description"));
                ans.add(c);
            }
            conn.close();
        }
        catch (NullPointerException e)
        {
            System.err.println(e.getMessage());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
        
        return ans;
    }
}
