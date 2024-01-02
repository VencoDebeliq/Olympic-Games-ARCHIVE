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

/**
 *
 * @author v_pai
 */
public class Medal_Winners {
    private int ID;
    private String CompetitorID;
    private int OlympicGamesID;
    private int DisciplineID;
    private int Medal_Type;
    private String Description;

    public void setID(int ID) {
        if(ID > 0)
            this.ID = ID;
    }

    public void setCompetitorID(String CompetitorID) {
        this.CompetitorID = CompetitorID;
    }

    public void setOlympicGamesID(int OlympicGamesID) {
        if(OlympicGamesID > 0)
            this.OlympicGamesID = OlympicGamesID;
    }

    public void setDisciplineID(int DisciplineID) {
        if(DisciplineID >= 37)
            this.DisciplineID = DisciplineID;
    }

    public void setMedal_Type(int Medal_Type) {
        if(Medal_Type >= 1 && Medal_Type <= 3)
            this.Medal_Type = Medal_Type;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getID() {
        return ID;
    }

    public String getCompetitorID() {
        return CompetitorID;
    }

    public int getOlympicGamesID() {
        return OlympicGamesID;
    }

    public int getDisciplineID() {
        return DisciplineID;
    }

    public int getMedal_Type() {
        return Medal_Type;
    }

    public String getDescription() {
        return Description;
    }
    
    public Medal_Winners(int ID, String CompetitorID, int OlympicGamesID, int DisciplineID, int Medal_Type, String Description){
        setID(ID);
        setCompetitorID(CompetitorID);
        setDisciplineID(DisciplineID);
        setMedal_Type(Medal_Type);
        setDescription(Description);
    }
    
    public Medal_Winners(){
        this(1, "", 1, 37, 1, "");
    }
    
    public static ArrayList <Medal_Winners> getAll()
    {
        ArrayList <Medal_Winners> ans = new ArrayList <>();
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://Database\\Archive.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Medal_Winners");
            while (rs.next())
            {
                Medal_Winners c = new Medal_Winners();
                c.setID(rs.getInt("ID"));
                c.setCompetitorID(rs.getString("Competitor_ID"));
                c.setOlympicGamesID(rs.getInt("Olympic_Games_ID"));
                c.setDisciplineID(rs.getInt("Discipline_ID"));
                c.setMedal_Type(rs.getInt("Medal_Type"));
                c.setDescription(rs.getString("Description"));
                ans.add(c);
            }
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        
        return ans;
    }
}
