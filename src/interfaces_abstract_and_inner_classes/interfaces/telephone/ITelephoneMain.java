package interfaces_abstract_and_inner_classes.interfaces.telephone;

public class ITelephoneMain {
    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(24565);
        myPhone.powerOn();
        myPhone.callPhone(24565);
        myPhone.answer();
    }
}
