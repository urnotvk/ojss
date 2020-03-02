package ojss.entities;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunter
 */

public class Job {
    private int jobID;
    private String jobTitle;
    private String companyName;
    private Date openDate;
    private Date closedDate;
    private String category;
    private String description;
    private float salary;
    private String location;
    private ArrayList<Job> jobApplications;
    
    public Job(int id, String title, String name, Date od, Date cd, String cate, String des, float sal,String loca, Job job)
    {
        jobID = id;
        jobTitle = title;
        companyName = name;
        openDate = od;
        closedDate = cd;
        category = cate;
        description = des;
        salary = sal;
        location = loca;
        jobApplications.add(job);
    }
    
    public void setJob(int id)
    {
        jobID = id;
    }
    public void setJobTitle(String title)
    {
        jobTitle = title;
    }
    public void setCompanyName(String name)
    {
        companyName = name;
    }
    public void setOpenDate(Date od)
    {
        openDate = od;
    }
    public void setCloseDate(Date cd)
    {
        closedDate = cd;
    }
    public void setCategroy(String cate)
    {
        category = cate;
    }
    public void setDescription(String des)
    {
        description = des;
    }
    public void setSalary(float sal)
    {
        salary = sal;
    }
    public void setLocation(String loca)
    {
        location = loca;
    }
    public void setJobApplications(Job job)
    {
        jobApplications.add(job);
    }
    public int getJobID()
    {
        return jobID;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    public Date getOpenDate()
    {
        return openDate;
    }
    public Date getClosedDate()
    {
        return closedDate;
    }
    public String getCategory()
    {
        return category;
    }
    public String getDescription()
    {
        return description;
    }
    public float getSalary()
    {
        return salary;
    }
    public String getLocation()
    {
        return location;
    }
    public ArrayList<Job> getJobApplications()
    {
        return jobApplications;
    }
}
