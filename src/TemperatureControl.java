import java.util.Scanner;

public class TemperatureControl {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj aktualna temperature");
        double actualTemp = scan.nextDouble();
        scan.nextLine();
        System.out.println("podaj temperature docelowa");
        double aimingTemp = scan.nextDouble();

        Thermostat t = new Thermostat(actualTemp, aimingTemp);

    }
}
