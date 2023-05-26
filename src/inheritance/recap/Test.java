package inheritance.recap;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nComputer Object\n");

        Computer computer = new Computer("12.2.1","45TG-56YH", "Intel", "Asus", 512.0);
        computer.hasScreen = false;
        computer.hasKeyboard = true;

        System.out.println(computer);

        Computer.boot();
        Computer.runProgram("Slack");
        Computer.runProgram("Zoom");
        Computer.shutDown();

        System.out.println("\nMac Object\n");
        Mac mac = new Mac("12.2.1", "CO2FD011507OW", "2.0 Hz", "macOS MotherBoard",
                250.69);
        mac.hasGarbageMagicMouse = true;

        System.out.println(mac);
        System.out.println("Key of the mac is = " + mac.getKey());
        System.out.println("Has iCloud = " + Mac.hasICloud);
        System.out.println("Has iTunes = " + Mac.hasITunes);
        Mac.boot();
        Mac.runProgram("Safari");
        Mac.getsSlowerWithEveryUpdate();
        Mac.getsSlowerWithEveryUpdate();
        Mac.getsSlowerWithEveryUpdate();
        Mac.getsSlowerWithEveryUpdate();
        Mac.shutDown();

        System.out.println("\nWindows Object\n");

        Windows abesComputer = new Windows("Windows 11", "12kv2-123kd", "Intel i7",
                "Lenovo", 2000.0, true,
                true, true, false);

        System.out.println(abesComputer);
        System.out.println("Key of the PC is = " + abesComputer.getKey());
        System.out.println("Has task manager = " + Windows.hasTaskManager);
        System.out.println("Has start = " + Windows.hasStart);
        Windows.boot();
        Windows.runProgram("Chrome");
        abesComputer.cleansViruses();
        Windows.shutDown();
    }
}
