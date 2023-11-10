package Khelifi;

public class Cargaison_Routiere extends Cargaison {

    public Cargaison_Routiere(double distanceParcours, double poids) {
        super(distanceParcours, poids);
        // TODO Auto-generated constructor stub
    }


    public double calculerCoutTransport() {
        // TODO Auto-generated method stub
        double v = getVolumeTotal();
        double p = getPoidsTotal();
        if (v < 380000) {
            return 4 * distanceParcours * p;
        } else {
            return 6 * distanceParcours * p;
        }
    }

    @Override
    public String toString() {
        return "Cargaison Routière [" + ref + "] cout = " + calculerCoutTransport();
    }

}
