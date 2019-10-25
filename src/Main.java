import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Flight flight = new Flight(airplane);
        String test = "1\n" + "HA-LOL\n" + "42\n" + "1\n" + "G-OWAC\n" + "101\n" + "2\n" + "HA-LOL\n"
                + "HEL\n" + "BAL\n" + "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" + "2\n"
                + "HA-LOL\n" + "BAL\n" + "HEL\n" + "x\n"
                + "1\n" + "2\n" + "3\n" + "G-OWAC\n" + "x";
        Scanner scanner = new Scanner(test);
        //Scanner scanner = new Scanner(System.in);
        TextUserInterface textUserInterface = new TextUserInterface(flight, airplane);
        textUserInterface.start(scanner, airplane);
    }
}
