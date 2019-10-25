import java.util.Scanner;

public class TextUserInterface {
    private Flight flight;
    private Airplane airplane;

    public TextUserInterface(Flight flight, Airplane airplane){
        this.airplane = airplane;
        this.flight = flight;
    }

    public void start(Scanner scanner, Airplane airplane) {
        String planeID;
        String capacity;
        String departure;
        String destination;

        printAirplanePanel();
        String userChoice = "";
        while (!userChoice.equals("x")) {
            printOperationForAirplane();
            userChoice = scanner.nextLine();
            switch (userChoice) {
                case "1":
                    System.out.print("Give plane ID: ");
                    planeID = scanner.nextLine();
                    System.out.print("Give plane capacity: ");
                    capacity = scanner.nextLine();
                    airplane.addPlane(planeID, capacity);
                    break;
                case "2":
                    System.out.print("Give plane ID: ");
                    planeID = scanner.nextLine();
                    System.out.print("Give departure airport code: ");
                    departure = scanner.nextLine();
                    System.out.print("Give destination airport code: ");
                    destination = scanner.nextLine();
                    flight.addFlight(planeID, departure, destination);
                    break;
                case "x":
                    break;
                default:
                    System.out.println("Wrong option!");
            }
        }

        printFlightPanel();
        userChoice = "";
        while (!userChoice.equals("x")) {
            printOperationForFlight();
            userChoice = scanner.nextLine();
            switch (userChoice) {
                case "1":
                    airplane.printPlanes();
                    break;
                case "2":
                    flight.printFlights();
                    break;
                case "3":
                    System.out.print("Give plane ID: ");
                    planeID = scanner.nextLine();
                    airplane.printPlaneInfo(planeID);
            }
        }

    }

    private void printAirplanePanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
    }

    private void printFlightPanel() {
        System.out.println("Flight service");
        System.out.println("------------\n");
    }

    private void printOperationForAirplane() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }

    private void printOperationForFlight() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
}
