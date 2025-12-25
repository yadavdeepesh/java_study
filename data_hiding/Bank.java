package data_hiding;
// Importing generic libraries
import java.io.*;

// Java Program showing working of data hiding

// Class created named Bank
class Bank {
    // Private data (data hiding)
    private long CurBalance = 0;

    // Bank_id is checked for authentication
    long bank_id;
    String name;

    // Getter function to modify private data

    public long get_balance(long Id){
        if(this.bank_id == Id){
             // Return current balance
            return CurBalance;
        }
          // Unauthorised user
    return -1;
    } 
     // Setter function
     public void set_balance(long balance, long Id){
        // Comparing bank_id of user and the given Id
        // then only it will get access
        if (this.bank_id == Id) {
            // Update balance in current ID
            CurBalance = CurBalance + balance;
        }
     }

    
}
