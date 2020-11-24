import java.util.Scanner;

public class Thermostat {

   private double actualTemp;
   private double aimingTemp;

    public Thermostat() {
    }

    public Thermostat(double actualTemp, double aimingTemp) {
        this.actualTemp = actualTemp;
        this.aimingTemp = aimingTemp;
        try {
            calculateTemp(actualTemp, aimingTemp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getActualTemp() {

        return actualTemp;
    }

    public void setActualTemp(double actualTemp) {

        this.actualTemp = actualTemp;
    }

    public double getAimingTemp() {

        return aimingTemp;
    }

    public void setAimingTemp(double aimingTemp) {

        this.aimingTemp = aimingTemp;
    }

    public void calculateTemp(double actualTemp, double aimingTemp) throws InterruptedException {
        double difference = aimingTemp - actualTemp;

        if (difference > 0) {

            while (actualTemp < aimingTemp) {

                System.out.println("aktualna temperatura to " + actualTemp);
                actualTemp += 0.5;
                Thread.sleep(1000);
            }
            if (actualTemp == aimingTemp) System.out.println("osiągnieto temperatire docelowa " + aimingTemp);
        }
        if (difference < 0) {
            while (actualTemp > aimingTemp) {

                System.out.println("aktualna temperatura to " + actualTemp);
                actualTemp -= 0.5;
                Thread.sleep(1000);

            }
            if (actualTemp == aimingTemp) System.out.println("osiągnieto temperature docelowa " + aimingTemp);
        }


    }


}








