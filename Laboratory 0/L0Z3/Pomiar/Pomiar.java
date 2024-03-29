package Pomiar;

import java.io.Serializable;

public class Pomiar implements Serializable {

    private Czas czas;
    private double temperatura;

    public Pomiar(Czas czas, double temperatura) {
        this.czas = czas;
        this.temperatura = temperatura;
    }

    public Czas getCzas() {
        return czas;
    }

    public void setCzas(Czas czas) {
        this.czas = czas;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String toString(){
        return czas.toString() + " Temperatura: " + temperatura;
    }
}
