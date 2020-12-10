package dependencyinversion.right;

public class main {

    public static void main(String[] args) {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

    }
}
