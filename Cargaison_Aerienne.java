package Khelifi;

public class Cargaison_Aerienne extends Cargaison {

    public Cargaison_Aerienne(double distanceParcours, double poids) {
        super(distanceParcours, poids);
    }

    @Override
    public double calculerCoutTransport() {
        // TODO Auto-generated method stub
        double v = getVolumeTotal();
        double p = getPoidsTotal();
        if (v < 80000) {
            return 10 * distanceParcours * p;
        } else {
            return 12 * distanceParcours * p;
        }
    }

    @Override
    public String toString() {
        return "Cargaison Aerienne [" + ref + "] cout = " + calculerCoutTransport();
    }

}