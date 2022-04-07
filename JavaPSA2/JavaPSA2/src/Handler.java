
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b00832719
 */
public class Handler {
    public final ArrayList<ItemsFile> itemArrayList = new ArrayList<>();
    public final ArrayList<UsersFile> userArrayList = new ArrayList<>();
    public final ArrayList<LoansFile> loanArrayList = new ArrayList<>();
    
    public void readLoansCSV() throws IOException 
    {   
    String fileIn = "LOANS.csv";
    String line = null;
       

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader inputStream = new BufferedReader(fileReader);
        inputStream.readLine();

        while ((line = inputStream.readLine()) != null) {
            String[] split = line.split(",");
            String barcode = split[0];
            String userid = split[1];
            String issuedate = split[2];
            String duedate = split[3];
            String numrenews = split[4];
            loanArrayList.add(new LoansFile(barcode, userid, issuedate, duedate, numrenews));
        }
        inputStream.close();               
    }
     
    public void printLoansArrayList()
    {
        for (int i = 0;loanArrayList.size() > i; i++) {
            System.out.println(loanArrayList.get(i).toString());    
        }
    }    
    
    
    public void readItemsCSV() throws IOException 
    {   
    String fileIn = "ITEMS.csv";
    String line = null;
       

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader inputStream = new BufferedReader(fileReader);
        inputStream.readLine();

        while ((line = inputStream.readLine()) != null) {
            String[] split = line.split(",");
            String barcode = split[0];
            String author = split[1];
            String title = split[2];
            String type = split[3];
            String year = split[4];
            String isbn = split[5];
            itemArrayList.add(new ItemsFile(barcode, author, title, type, year, isbn));
        }
        inputStream.close();               
    }
     
    public void printItemArrayList()
    {
        
        for (int i = 0;itemArrayList.size() > i; i++) {
            System.out.println(itemArrayList.get(i).toString());    
        }
    }
    
    public void readUsersCSV() throws IOException 
    {   
    String fileIn = "USERS.csv";
    String line = null;
       

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader inputStream = new BufferedReader(fileReader);
        inputStream.readLine();

        while ((line = inputStream.readLine()) != null) {
            String[] split = line.split(",");
            String userid1 = split[0];
            String firstname1 = split[1];
            String lastname1 = split[2];
            String email1 = split[3];
            userArrayList.add(new UsersFile(userid1, firstname1, lastname1, email1));
        }
        inputStream.close();               
    }
     
    public void printUsersArrayList()
    {
        
        for (int i = 0;userArrayList.size() > i; i++) {
            System.out.println(userArrayList.get(i).toString());    
        }
    }


            
}




