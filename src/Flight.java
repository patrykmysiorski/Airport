import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Flight {
    private Airplane airplane;
    private List<List<String>> flightList;

    public Flight(Airplane airplane){
        this.airplane = airplane;
        this.flightList = new ArrayList<>();
    }

    public void addFlight(String planeID, String departure, String destination) {
        HashMap<String, Integer> airplaneInfo = airplane.getAirplaneInfo();
        Integer capacity = airplaneInfo.get(planeID);
        if (capacity != null) {
            List<String> flight = new ArrayList<>(4);
            flight.add(planeID);
            flight.add(capacity.toString());
            flight.add(departure);
            flight.add(destination);
            flightList.add(flight);
        }
    }

    public void printFlights(){
        for(List<String> flight : flightList){
            System.out.print(flight.get(0));
            System.out.print(" ".concat("(").concat(flight.get(1)));
            System.out.print(" ppl) (".concat(flight.get(2)));
            System.out.println("-".concat(flight.get(3)).concat(")"));
        }
    }
}
