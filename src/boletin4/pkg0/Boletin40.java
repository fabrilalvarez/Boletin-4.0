
package boletin4.pkg0;

public class Boletin40 {

    public static void main(String[] args) {
        //Codigo de la aplicación.
        consumo objconsumo1=new consumo();
        objconsumo1.setvMed(50);
        objconsumo1.setKm(100);
        
        consumo objconsumo2=new consumo(100,50,50,2);
        System.out.println("Consumo: "+objconsumo2.consumoMedio());
        System.out.println("Consumo Euros: "+objconsumo2.consumoEuros());
    }
    
}
