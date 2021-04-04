package interfaces_abstract_and_inner_classes.innerclass.introduction;

public class GearBoxMain {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        // for public classes
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//        GearBox.Gear second = mcLaren.new Gear(2, 15.14);
//        System.out.println(first.driveSpeed(1000));
//
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println((mcLaren.wheelSpeed(6000)));

    }
}
