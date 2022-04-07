/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author b00832719
 */
public class ItemsFile {
    String barcode ;
    String author;
    String title;
    String type;
    String year;
    String isbn;
    
 public ItemsFile(String barcode, String author, String title, String type, String year, String isbn)
    {
        this.barcode = barcode;
        this.author = author;
        this.title = title;
        this.type = type;
        this.year = year;
        this.isbn = isbn;
    }

    ItemsFile() {

    }

    ItemsFile(String userid, String firstname, String lastname, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){ 
        String itemformated =  "Barcode - " + this.barcode + ", " + 
                               "author - "  + this.author + ", " + 
                               "title- " + this.title + ", " + 
                               "type - " + this.type + ", " + 
                               "year- " + this.year + ", " + 
                               "isbn- " + this.isbn;
             
        return itemformated;  
    }
    
    public String getBarcode() {
        return this.barcode;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getYear() {
        return this.year;
    }
    
    public String getIsbn() {
        return this.isbn;
    }
}
