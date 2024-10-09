// https://leetcode.com/problems/design-underground-system/submissions/1416972859/

class UndergroundSystem {
    private Map<Integer, CheckIn> checkInMap = new HashMap<>();
    private Map<String, CheckOut> checkOutMap = new HashMap<>();

    private class CheckIn {
        private String startStation;
        private int time;

        public CheckIn(String startStation, int time) {
            this.startStation = startStation;
            this.time = time;
        }
    }

    private class CheckOut {
        private int numOfTrips;
        private int totalTime;

        public CheckOut(int numOfTrips, int totalTime) {
            this.numOfTrips = numOfTrips;
            this.totalTime = totalTime;
        }
    }

    public void checkIn(int id, String stationName, int t) {
        CheckIn checkIn = new CheckIn(stationName, t);
        checkInMap.put(id, checkIn);
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = checkInMap.get(id);
        String startEndStation = checkIn.startStation + ":" + stationName;
        checkOutMap.putIfAbsent(startEndStation, new CheckOut(0, 0));
        int numOfTrips = checkOutMap.get(startEndStation).numOfTrips + 1;
        int totalTime = checkOutMap.get(startEndStation).totalTime + t - checkIn.time;
        CheckOut checkOut = new CheckOut(numOfTrips, totalTime);
        checkOutMap.put(startEndStation, checkOut);
    }

    public double getAverageTime(String startStation, String endStation) {
        CheckOut checkOut = checkOutMap.get(startStation + ":" + endStation);
        return (double) checkOut.totalTime / checkOut.numOfTrips;
    }    
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
