package object_oriented_programming_1.vip_customer;

public class VipCustomerMain {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("Default Name: " + vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("John", 10);
        System.out.println("Name: " + vipCustomer1.getName() + " Limit: " + vipCustomer1.getLimit());

        VipCustomer vipCustomer2 = new VipCustomer("Bakhtiyar", 10000, "bakhtiyar@g.com");
        System.out.println("Name: " + vipCustomer2.getName() + " Limit: " + vipCustomer2.getLimit() + " Email: " + vipCustomer2.getEmailAddress());
    }
}
