import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.Date;





/**
 *
 * @author b00832719
 */
public class LibraryPSA2 {

    private Scanner myObj = new Scanner(System.in);
    private ItemsFile items = new ItemsFile();
    private UsersFile users = new UsersFile();
    private LoansFile loans = new LoansFile();
    
    private Handler handle = new Handler();
    UsersFile usrPtr;
    ItemsFile bookPtr;

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LibraryPSA2 thisObj = new LibraryPSA2();
        thisObj.populateArrays();
        thisObj.menuInterface();
        
    }
    
    private void populateArrays() throws IOException {
        handle.readItemsCSV();
        handle.readLoansCSV();
        handle.readUsersCSV();
    }
    
    @SuppressWarnings("element-type-mismatch")
    private void menuInterface() throws IOException 
    {
        System.out.println("----- Welcome to the Library System! -----");
        System.out.println("Please select which option you wish to use: ");
        
        System.out.println("1) Loan an item out");
        System.out.println("2) Extend a Loan");
        System.out.println("3) Return and Item");
        System.out.println("4) View all Loans");
        System.out.println("5) View all Items");
        System.out.println("6) Exit Program");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Preferred Option: ");
        String input = myObj.nextLine();
        
        
        boolean userInput = true;
        while(userInput) {
            switch(input) {
                case "1":
                System.out.print("\n\n");
                Scanner ui = new Scanner(System.in);
                
                
                //TEST DATA                
                System.out.println("Enter the barcode of the item you wish to loan out: ");
                String itemBarcode = ui.nextLine();
                System.out.println("Enter the User ID of the personyou wish to loan out to: ");
                String userID_input = ui.nextLine();

                System.out.println("Looking for Barcode: " + itemBarcode);
                System.out.println("Looking for Usere: " + userID_input);
                
                boolean item = false;
                for (ItemsFile element : handle.itemArrayList){
                    
                    if (element.barcode.equals(itemBarcode)) {
                        item = true;
                        bookPtr = element;
                        break;
                    }
                }
                    
                System.out.println("Item Found: " + item);
                    
                        
                    
                    
                boolean user = false;
                for (UsersFile aUser : handle.userArrayList){
                    
                    if (aUser.userid.equals(userID_input)) {
                        user = true;
                        usrPtr = aUser;
                        break;
                    }
                }
                
                
                System.out.println("User Found: " + user);
                    
                    
                    if (user && item) 
                        System.out.println("Both Found");
                    
                    System.out.println("\n");
                
                int length = 0;
                for (ItemsFile aType : handle.itemArrayList){
                    
                    if (bookPtr.type.equals("Book")) {
                        System.out.println("This is a book.");
                        length = 28;
                        break;
                    } else {
                        System.out.println("This is multimedia");
                        length = 7;
                        break;
                    }
                }
                
                LocalDate issued = LocalDate.now();
                DateTimeFormatter myFormatIssued = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String formattedDate = issued.format(myFormatIssued);
                                
                LocalDate dueDate = issued.plusDays(length);
                
                DateTimeFormatter myFormatDueDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String formattedDueDate = dueDate.format(myFormatIssued);
                
                
                userInput = false;
                menuInterface();
                break;
                case "2":
                System.out.println("Renew a Loan"); //method would go here
                userInput = false; //stop loop from constantly looping
                menuInterface();   //calls mainMenu again
                break;
                case "3":
                System.out.println("Return a Loan");
                userInput = false; //stop loop from constantly looping
                menuInterface();
                break;
                case "4":
                System.out.println("");
                handle.printLoansArrayList();
                System.out.println("");
                userInput = false;
                menuInterface();
                break;
                case "5":
                System.out.println("");
                handle.printItemArrayList();
                System.out.println("");
                userInput = false;
                menuInterface();
                break;
                case "6":
                userInput = false;
                menuInterface();
                break;
            }
        }   
    }    
}
