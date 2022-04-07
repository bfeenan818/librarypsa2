import java.io.IOException;
import java.util.Scanner;




/**
 *
 * @author b00832719
 */
public class LibraryPSA2 {

    private Scanner myObj = new Scanner(System.in);
    private ItemsFile items = new ItemsFile();
//    private UsersFile users = new UsersFile();
//    private LoansFile loans = new LoansFile();
    private Handler handle = new Handler();
    
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
                String itemBarcode = "514284220";
                String userID_input = "B00909463";
                System.out.println("Looking for Barcode: " + itemBarcode);
                System.out.println("Looking for Usere: " + userID_input);
                
                //System.out.println("Enter the barcode of the item you wish to loan out: ");
                //String itemBarcode = ui.nextLine();
                
                
                //System.out.println("Enter the user id of the person loaning the item: ");
                // userID_input = ui.nextLine();
                boolean item = false;
                for (ItemsFile element : handle.itemArrayList){
                    
                    if (element.barcode.equals(itemBarcode)) {
                        item = true;
                        break;
                    }
                }
                    
                System.out.println("Item Found: " + item);
                    
                        
                    
                    
                boolean user = false;
                for (UsersFile aUser : handle.userArrayList){
                    
                    if (aUser.userid.equals(userID_input)) {
                        user = true;
                        break;
                    }
                }
                    
                        System.out.println("User Found: " + user);
                    
                    
                    if (user && item) 
                        System.out.println("Both Found");
                    
                    System.out.println("\n");
                
                
                
                
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
