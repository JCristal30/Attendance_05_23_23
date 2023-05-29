package Attendance_05_23_23;

class ToyotaVIOS extends Car {
    private String tireType; // Type of tire for Toyota VIOS

    @Override
    public void start() {
        System.out.println("Toyota VIOS started.");
    }
    @Override
    public void stop() {
        System.out.println("Toyota VIOS stopped.");
    }

    public void drive() {
        System.out.println("Toyota VIOS is driving.");
    }

    // Getter and setter for tireType
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
}