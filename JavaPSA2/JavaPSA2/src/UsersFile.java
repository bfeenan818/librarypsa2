/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bfeen
 */
public class UsersFile {
    String userid;
    String firstname;
    String lastname;
    String email;
    
 public UsersFile(String userid, String firstname, String lastname, String email)
    {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    UsersFile() {

    }
    
    public String toString(){ 
        String itemformated =  "UserID - " + this.userid + ", " + 
                               "FirstName - "  + this.firstname + ", " + 
                               "LastName - " + this.lastname + ", " + 
                               "Email - " + this.email;
             
        return itemformated;  
    }
    
    public String getUserid() {
        return this.userid;
    }
    
    public String getFirstname() {
        return this.firstname;
    }
    
    public String getLastname() {
        return this.lastname;
    }
    
    public String getEmail() {
        return this.email;
    }
    
}
