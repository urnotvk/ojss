package ojss.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hunter
 */
public class Recruiter extends User {
    private String recruiterName;
    private String contactPerson;
    private String contactEmail;
    private String contactAddress;
    private int contactPhone;
    private Recruiter recruiter;
    
    public Recruiter(int id, String name, String pw, String ut, String person, String mail, String address, int phone)
    {
        super(id, name, pw, ut);
        recruiterName = name;
        contactPerson = person;
        contactEmail = mail;
        contactAddress = address;
        contactPhone = phone;
    }
    
    public String getRecruiterName()
    {
        return recruiterName;
    }
    public String getContactPerson()
    {
        return contactPerson;
    }
    public String getContactEmail()
    {
        return contactEmail;
    }
    public String getContactAddress()
    {
        return contactAddress;
    }
    public int contactPhone()
    {
        return contactPhone;
    }
    
         
    public Recruiter getRecruiterDetails(User user)
    {
        //get data from DB, then set to recruiter
        return recruiter;
    }
}
