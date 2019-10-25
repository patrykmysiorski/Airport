import java.util.HashMap;

public class Airplane {
    private HashMap<String, Integer> airplaneInfo;

    public Airplane() {
        this.airplaneInfo = new HashMap<>();
    }

    public HashMap<String, Integer> getAirplaneInfo(){
        return airplaneInfo;
    }

    public void addPlane(String planeID, String capacity) {
        final Integer WRONG_CAPACITY_CODE = -1;
        Integer capacityAsNumber = validateCapacity(capacity);
        if (!planeID.isBlank() && capacityAsNumber != WRONG_CAPACITY_CODE) {
            airplaneInfo.put(planeID, capacityAsNumber);
        }
    }

    public Integer validateCapacity(String capacity) {
        try {
            Integer capacityAsNumber = Integer.parseInt(capacity);
            if (capacityAsNumber > 0) {
                return capacityAsNumber;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
        return -1;
    }

    public void printPlanes() {
        for (String key : airplaneInfo.keySet()) {
            System.out.println(key.concat(" (")
                    .concat(airplaneInfo.get(key).toString())
                    .concat(")"));
        }
    }

    public void printPlaneInfo(String planeID) {
        Integer capacity = airplaneInfo.get(planeID);
        if(capacity != null){
            System.out.println(planeID.concat(" (").concat(capacity.toString()).concat(" ppl)"));
        }
    }
}
