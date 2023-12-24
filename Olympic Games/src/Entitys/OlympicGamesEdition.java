/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitys;
import Code.Regex;
/**
 *
 * @author ventsislavlp
 */
public class OlympicGamesEdition {
    private int ID;
    private String Year_of_conduction;
    private int City;
    private int Type;
    private String Date_of_Start;
    private String Date_of_End;
    
    public void setID(int ID) {
        if(ID > 0)
            this.ID = ID;
    }

    public void setYear_of_conduction(String Year_of_conduction) {
        this.Year_of_conduction = Year_of_conduction;
    }

    public void setCity(int City) {
        if(City >= 95)
            this.City = City;
    }

    public void setType(int Type) {
        if(Type == 1 || Type == 2)
        this.Type = Type;
    }

    public void setDate_of_Start(String Date_of_Start) {
        if(Regex.regex(Date_of_Start))
            this.Date_of_Start = Date_of_Start;
    }

    public void setDate_of_End(String Date_of_End) {
        if(Regex.regex(Date_of_End))
            this.Date_of_End = Date_of_End;
    }

    public int getID() {
        return ID;
    }

    public String getYear_of_conduction() {
        return Year_of_conduction;
    }

    public int getCity() {
        return City;
    }

    public int getType() {
        return Type;
    }

    public String getDate_of_Start() {
        return Date_of_Start;
    }

    public String getDate_of_End() {
        return Date_of_End;
    }
    
    public OlympicGamesEdition(int ID, String Year_of_conduction, int City, int Type, String Date_of_Start, String Date_of_End){
        setID(ID);
        setYear_of_conduction(Year_of_conduction);
        setCity(City);
        setType(Type);
        setDate_of_Start(Date_of_Start);
        setDate_of_End(Date_of_End);
    }
    
    public OlympicGamesEdition(){
        this(1, "", 95, 1, "", "");
    }
    
}
