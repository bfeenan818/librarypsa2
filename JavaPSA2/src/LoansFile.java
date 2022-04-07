/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bfeen
 */
public class LoansFile {
    String barcode;
    String userid;
    String issuedate;
    String duedate;
    String numrenews;
    
 public LoansFile(String barcode, String userid, String issuedate, String duedate, String numrenews)
    {
        this.barcode = barcode;
        this.userid = userid;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.numrenews = numrenews;
    }

    LoansFile() {

    }
    
     public String toString(){ 
        String itemformated =  "UserID - " + this.barcode + ", " + 
                               "FirstName - "  + this.userid + ", " + 
                               "LastName - " + this.issuedate + ", " + 
                               "LastName - " + this.duedate + ", " + 
                               "Email - " + this.numrenews;
             
        return itemformated;  
    }
    
    public String getBarcodes() {
        return this.barcode;
    }
    
    public String getUser_id() {
        return this.userid;
    }
    
    public String getIssuedate() {
        return this.issuedate;
    }
    
    public String getTDuedate() {
        return this.duedate;
    }
    
    public String getNumrenews() {
        return this.numrenews;
    }
    
}