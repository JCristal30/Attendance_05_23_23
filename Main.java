package Attendance_05_23_23;

public class Main {
    public static void main(String[] args) {    	
    	ToyotaVIOS toyotaVIOS = new ToyotaVIOS(); // A. Car Class
        U2SpyPlane u2SpyPlane = new U2SpyPlane(); // B. Plane Class
        FandangoYacht fandangoYacht = new FandangoYacht(); // C. Boat Class
    
        toyotaVIOS.setSpeed(120);
        toyotaVIOS.setColor("Blue");
        toyotaVIOS.setPrice(1000000.0);
        toyotaVIOS.setTireType("Radial");
        toyotaVIOS.start(); 
        toyotaVIOS.drive(); 
        toyotaVIOS.stop();
        System.out.println();
        
        u2SpyPlane.speed = 500;
        u2SpyPlane.color = "White";
        u2SpyPlane.price = 5000000.0;
        u2SpyPlane.setWingspan(40.5);
        u2SpyPlane.start();
        u2SpyPlane.fly();
        u2SpyPlane.stop();
        System.out.println();
        
        fandangoYacht.speed = 30;
        fandangoYacht.color = "Blue";
        fandangoYacht.price = 3000000.0;
        fandangoYacht.setMainSailColor("White");
        fandangoYacht.start();
        fandangoYacht.floatOnWater();
        fandangoYacht.stop();

        System.out.println("\n----CAR CLASS----");
        System.out.println("Speed: " + toyotaVIOS.getSpeed()); 
        System.out.println("Color: " + toyotaVIOS.getColor());
        System.out.println("Price: " + toyotaVIOS.getPrice());
        System.out.println("Tire Type: " + toyotaVIOS.getTireType());
        
        System.out.println("\n----PLANE CLASS----");
        System.out.println("Speed: " + u2SpyPlane.speed);
        System.out.println("Color: " + u2SpyPlane.color);
        System.out.println("Price: " + u2SpyPlane.price);
        System.out.println("Wingspan: " + u2SpyPlane.getWingspan());

        System.out.println("\n----BOAT CLASS----");
        System.out.println("Speed: " + fandangoYacht.speed);
        System.out.println("Colo : " + fandangoYacht.color);
        System.out.println("Price: " + fandangoYacht.price);
        System.out.println("Main Sail Color: " + fandangoYacht.getMainSailColor());
    }
}
        