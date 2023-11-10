package Khelifi;

public class Marchandise {
    private int num;
    private double poids;
    private double volume;

    public Marchandise(int num, double poids, double volume) {
        this.num = num;
        this.poids = poids;
        this.volume = volume;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Marchandise [num=" + num + ", poids=" + poids + ", volume=" + volume + "]";
    }


}
