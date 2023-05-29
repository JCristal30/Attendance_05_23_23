package Attendance_05_23_23;

public class FandangoYacht extends Boat {
	private String mainSailColor;

    public void setMainSailColor(String color) {
        this.mainSailColor = color;
    }

    public String getMainSailColor() {
        return mainSailColor;
    }

    @Override
    public void start() {
        System.out.println("Fandango Yacht started.");
    }

    @Override
    public void stop() {
        System.out.println("Fandango Yacht stopped.");
    }

    public void floatOnWater() {
        System.out.println("Fandango Yacht is floating on water.");
    }
}