package boletin4.pkg0;

public class consumo {

    private double km, l, vMed, pGas;

    //Builder
    public consumo() {

    }

    public consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        l = litros;
        this.vMed = vMed;
        this.pGas = pGas;

    }

    //method
    public void setKm(double k) { //introduce KM
        this.km = k;
    }

    public void setLitros(double litros) { //introduce l
        this.l = litros;
    }

    public void setvMed(double vMed) { //introduce velocidad media
        this.vMed = vMed;
    }

    public void setpGas(double pGas) { //introduce precio gasolina
        this.pGas = pGas;
    }

    public double getTiempo() { //Devuelveme el Tiempo
        return km / vMed;
    }

    public double consumoMedio() { //Devuelveme el consumoMedio litros
        return (l / km) * 100;
    }

    public double consumoEuros() { //Devuelveme el consumoEuro x Euros
        return (l * pGas / km) * 100;
    }
}
