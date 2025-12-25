package data_hiding;

public class Emp {
    public static void main(String[] args) {
    // Creating employee object of bank type
        Bank _emp = new Bank();

        // Assigning employee object values
        _emp.bank_id = 12345;
        _emp.name = "Roshan";

        // _emp.get_balance(123456)
        _emp.set_balance(10000, 12345);
        // This will no get access as bank_id is given wrong
        // so
        // unauthorised user is not getting access that is
        // data hiding

        long emp_balance = _emp.get_balance(12345);
        // As this time it is valid user it will get access

        // Display commands
        System.out.println("User Name"
                           + "  " + _emp.name);
        System.out.println("Bank_ID"
                           + "  " + _emp.bank_id);
        System.out.println("Current Balance"
                           + "  " + emp_balance);
      }
}
