/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitys;

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
}
