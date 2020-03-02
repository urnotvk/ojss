package ojss.entities;


import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunter
 */
public class Skillset {
    private int skillID;
    private String skillTitle;
    private String skillDescription;
    private ArrayList<Skillset> skillsets;
    
    public Skillset(int id, String title, String des)
    {
        skillID = id;
        skillTitle = title;
        skillDescription = des;
    }
    
    public void setSkillID(int id)
    {
        skillID = id;
    }
    public void setSkillTitle(String title)
    {
        skillTitle = title;
    }
    public void setSkillDescription(String des)
    {
        skillDescription = des;
    }
    public int getSkillID()
    {
        return skillID;
    }
    public String getSkillTitle()
    {
        return skillTitle;
    }
    public String getSkillDescription()
    {
        return skillDescription;
    }
    public ArrayList<Skillset> getAllSkillSets()
    {
        return skillsets;
    }
}
