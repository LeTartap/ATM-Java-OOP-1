
public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("National Australia Bank");

        if(bank.createBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomerToBranch("Adelaide", "Tim", 50.05);
        bank.addCustomerToBranch("Adelaide", "Mike", 175.34);
        bank.addCustomerToBranch("Adelaide", "Percy", 220.12);

        bank.createBranch("Sydney");
        bank.addCustomerToBranch("Sydney", "Bob", 150.54);

        bank.callAddTransctionToCustomerInBranch("Adelaide", "Tim", 44.22);
        bank.callAddTransctionToCustomerInBranch("Adelaide", "Tim", 12.44);
        bank.callAddTransctionToCustomerInBranch("Adelaide", "Mike", 1.65);

        bank.callPrintCustomerListByName("Adelaide");
        bank.callPrintCustomerListByName("Sydndey");

        bank.createBranch("Melbourne");

        if(!bank.addCustomerToBranch("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.createBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.callAddTransctionToCustomerInBranch("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomerToBranch("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}