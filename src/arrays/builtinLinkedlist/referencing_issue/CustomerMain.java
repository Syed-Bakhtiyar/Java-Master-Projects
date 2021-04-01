package arrays.builtinLinkedlist.referencing_issue;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("balance for customer: " + customer.getBalance());
    }
}
