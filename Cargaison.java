package Khelifi;

import java.util.ArrayList;
import java.util.List;

public abstract class Cargaison {
    protected static int ref;
    protected double distanceParcours;
    protected double poids;
    protected List<Marchandise> marchandises = new ArrayList<Marchandise>();

    public Cargaison(double distanceParcours, double poids) {
        this.distanceParcours = distanceParcours;
        this.poids = poids;
        ref ++;
    }
    //Ajouter Marchandise
    public abstract double calculerCoutTransport();

    public void ajouterMarchandise(Marchandise m)  {
        this.marchandises.add(m);
    }

    public void consulterMarchandise(int num) throws Exception {
        int n = 0;
        for(Marchandise m : marchandises) {
            if(m.getNum() == num)
                n += 1;
        }
        if(n == 0) {
            throw new Exception("Marchandise introuvable");
        }
    }


    public double getPoidsTotal() {
        double poidsTotal = 0;

        for (Marchandise m : marchandises) {
            poidsTotal += m.getPoids();
        }

        return poidsTotal;
    }

    public double getVolumeTotal() {
        double volumeTotal = 0;

        for (Marchandise m : marchandises) {
            volumeTotal += m.getVolume();
        }

        return volumeTotal;
    }

    public String afficherMarchandise() {
        String s ="";
        for (Marchandise m : marchandises) {
            s += m.toString() + "\n";
        }
        return s;
    }

    public List<Marchandise> getMarchandises() {
        return marchandises;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public double getDistanceParcours() {
        return distanceParcours;
    }

    public void setDistanceParcours(double distanceParcours) {
        this.distanceParcours = distanceParcours;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }



    @Override
    public String toString() {
        return "Cargaison [ref=" + ref + ", distanceParcours=" + distanceParcours + ", masseLimite=" + poids
                + "]";
    }

}

