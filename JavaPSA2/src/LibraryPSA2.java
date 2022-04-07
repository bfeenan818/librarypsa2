
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
                System.out.println("");
                
                System.out.println("");
                
                
                
                Scanner ui = new Scanner(System.in);
                
                System.out.println("Enter the barcode of the item you wish to loan out: ");
                String itemBarcode = ui.nextLine();
                
                System.out.println("Enter the user id of the person loaning the item: ");
                String userID_input = ui.nextLine();
                
//                for (int i = 0; i < handle.itemArrayList.size(); i++){
//                    if (itemBarcode.equals(handle.itemArrayList.get(i))){
//                        System.out.println("Item found.");
//                    }
//                    else{
//                        System.out.println("Item not found");
//                        }
//                }
                
                if (handle.itemArrayList.contains(itemBarcode)){
                    System.out.print("Item Found.");
                } else {
                    System.out.println("Item not Found.");     
                       }
                        
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
