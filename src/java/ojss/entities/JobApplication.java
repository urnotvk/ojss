package ojss.entities;


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
public class JobApplication {
    private int jobApplicationID;
    private JobSeeker jobApplicant;
    private Date dateApplied;
    private String cvFilePath;
    
    public JobApplication(int id, Date date, JobSeeker ja, String c)
    {
        jobApplicationID = id;
        dateApplied = date;
        jobApplicant = ja;
        cvFilePath = c;
    }
    public void setJobApplicationID(int id)
    {
        jobApplicationID = id;
    }
    public void setJobApplicant(JobSeeker ja)
    {
        jobApplicant = ja;
    }
    public void setDateApplied(Date date)
    {
        dateApplied = date;
    }
    public void setCvFilePath(String c)
    {
        cvFilePath = c;
    }
    public int getJobApplicationID()
    {
        return jobApplicationID;
    }
    public JobSeeker getJobApplicant()
    {
        return jobApplicant;
    }
    public Date getDateApplied()
    {
        return dateApplied;
    }
    public String getCvFilePath()
    {
        return cvFilePath;
    }
}
