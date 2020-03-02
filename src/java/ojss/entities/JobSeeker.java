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
public class JobSeeker extends User {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private int age;
    private String address;
    private int phone;
    private ArrayList<JobSeeker> skillets;
    private JobSeeker seeker;
    
    public JobSeeker(int id, String name, String pw, String ut, String fname, String lname, String mail, String gen, int a, String add, int pho, JobSeeker jobseeker)
    {
        super(id, name, pw, ut);
        firstName = fname;
        lastName = lname;
        email = mail;
        gender = gen;
        age = a;
        address = add;
        phone = pho;
        skillets.add(jobseeker);
    }
    
     public void setFirstName(String fname)
     {
         firstName = fname;
     }
     public void setLastName(String lname)
     {
         lastName = lname;
     }
     public void setEmail(String mail)
     {
         email = mail;
     }
     public void setGender(String gen)
     {
         gender = gen;
     }
     public void setAge(int a)
     {
         age = a;
     }
     public void setAddress(String add)
     {
         address = add;
     }
     public void setPhone(int pho)
     {
         phone = pho;
     }
     public void setSkillets(JobSeeker jobseeker)
     {
         skillets.add(jobseeker);
     }
     public String getFirestName()
     {
         return firstName;
     }
     public String getLastName()
     {
         return lastName;
     }
     public String getEmail()
     {
         return email;
     }
     public String getGender()
     {
         return gender;
     }
     public int getAge()
     {
         return age;
     }
     public String getAddress()
     {
         return address;
     }
     public int getPhone()
     {
         return phone;
     }
     public ArrayList<JobSeeker> getSkillets()
     {
         return skillets;
     }
     
    public JobSeeker getJobSeekerDetails(User user)
    {
        //get data from DB, then set to seeker
        return seeker;
    }
}
