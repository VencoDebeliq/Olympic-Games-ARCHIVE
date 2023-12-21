/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitys;

/**
 *
 * @author ventsislavlp
 */
public class Competitor {
    private int ID;
    private String First_Name;
    private String Last_Name;
    private int Sex;
    private int Nationality;
    private String Date_of_birth;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public void setSex(int Sex) {
        if(Sex == 1 || Sex == 2)
            this.Sex = Sex;
    }

    public void setNationality(int Nationality) {
        if(Nationality >= 1 && Nationality <= 225)
            this.Nationality = Nationality;
    }

    public void setDate_of_birth(String Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }
    //regex nqkoga
    public int getID() {
        return ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public int getSex() {
        return Sex;
    }

    public int getNationality() {
        return Nationality;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }
    
    public Competitor (int ID, String First_Name, String Last_Name, int Sex, int Nationality, String Date_of_birth){
        setID(ID);
        setFirst_Name(First_Name);
        setLast_Name(Last_Name);
        setSex(Sex);
        setNationality(Nationality);
        setDate_of_birth(Date_of_birth);
    }
    
    public Competitor(){
        this(0, "", "", 1, 1, "01.01.1900");
    }
}
