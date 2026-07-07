public class main {

    public static void main(String[] args) {

        Appliance appliance1 = new WashingMachine("LG");
        Appliance appliance2 = new Refrigerator("Panasonic");

        appliance1.turnOn();
        appliance1.operate();
        appliance1.turnOff();

        System.out.println();

        appliance2.turnOn();
        appliance2.operate();
        appliance2.turnOff();
    }
}