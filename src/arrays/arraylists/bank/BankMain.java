package arrays.arraylists.bank;

import arrays.arraylists.bank.bank.Bank;
import arrays.arraylists.bank.bank.Branch;
import arrays.arraylists.bank.bank.Customer;

public class BankMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Bakhtiyar");
        customer.addTransaction(200.00);
        customer.addTransaction(300.00);
        customer.addTransaction(600.00);
        Customer customer2 = new Customer("John");
        customer2.addTransaction(50.00);
        customer2.addTransaction(30.00);
        customer2.addTransaction(200.00);
        Branch branch = new Branch("Nazimabad");
        branch.addCustomer(customer);
        Branch branch2 = new Branch("Shah Faisal");
        branch2.addCustomer(customer2);
        Bank bank = new Bank("Alfalah");
        bank.addBranch(branch);
        bank.addBranch(branch2);

        for (Branch b : bank.getBranches()){
            System.out.println(b.hashCode());
        }


        for (int i = 0; i < bank.getBranches().size(); i++){
            for (int j = 0; j < bank.getBranches().get(i).getCustomers().size(); j++){
                for (int k = 0; k < bank.getBranches().get(i).getCustomers().get(j).getTransactions().size(); k++){
                    System.out.println("Bank: " + bank.getBankName() + "\n" +
                            "Branch Name: " + bank.getBranches().get(i).getBranchName() + "\n" +
                            "Customer Name: " + bank.getBranches().get(i).getCustomers().get(j).getCustomerName() + "\n" +
                            "Transactions: " + bank.getBranches().get(i).getCustomers().get(j).getTransactions().get(k) + "\n" );
                }
            }
        }
    }
}
