package object_oriented_programming_1.vip_customer;

public class VipCustomer {
    private String name;
    private double limit;
    private String emailAddress;

    public VipCustomer() {
        this("default", 10, "default@g.com");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "unknown@g.com");
    }

    public VipCustomer(String name, double limit, String emailAddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
