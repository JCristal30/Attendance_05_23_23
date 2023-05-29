package Attendance_05_23_23;

public class U2SpyPlane extends Plane {
	private double wingspan;

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public void start() {
        System.out.println("U2-Spy Plane started.");
    }

    @Override
    public void stop() {
        System.out.println("U2-Spy Plane stopped.");
    }
    public void fly() {
        System.out.println("U2-Spy Plane is flying.");
    }
}
