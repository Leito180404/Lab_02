package Actividades;

public class Principal {
    public static void main(String[] args){
        Bolsa < Chocolatina > BolsaCho = new Bolsa < Chocolatina > ();
        Chocolatina c = new Chocolatina("Milky");
        Chocolatina c1 = new Chocolatina("Milky");
        Chocolatina c2 = new Chocolatina("Ferrero");
        BolsaCho.add(c);
        BolsaCho.add(c1);
        
    }
}
