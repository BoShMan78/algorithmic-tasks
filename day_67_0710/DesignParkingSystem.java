// https://leetcode.com/problems/design-parking-system/submissions/1414729723/

class ParkingSystem {
    int big;
    int medium;
    int small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big - 1 < 0) {
                    return false;
                } else {
                    big--;
                    return true;
                }
            case 2:    
                if (medium - 1 < 0) {
                    return false;
                } else {
                    medium--;
                    return true;
                }
            case 3:    
                if (small - 1 < 0) {
                    return false;
                } else {
                    small--;
                    return true;
                } 
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
