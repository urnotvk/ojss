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
public class JobCategory {
    private int jobCategoryID;
    private String jobCategoryTitle;
    private ArrayList<JobCategory> jobCategories;
    
    public JobCategory(int id, String title)
    {
        jobCategoryID = id;
        jobCategoryTitle = title;
    }
    
    public void setCategoryID(int id)
    {
        jobCategoryID = id;
    }
    public void setCategoryTitle(String title)
    {
        jobCategoryTitle = title;
    }
    public int getCategoryID()
    {
        return jobCategoryID;
    }
    public String getCategoryTitle()
    {
        return jobCategoryTitle;
    }
    public ArrayList<JobCategory> getAllCategories()
    {
        return jobCategories;
    }

}
