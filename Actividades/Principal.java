package Actividades;

public class Principal {
    public static void main(String[] args){
        Bolsa < Chocolatina > BolsaCho = new Bolsa < Chocolatina > (3);
        Chocolatina c = new Chocolatina("Milky");
        Chocolatina c1 = new Chocolatina("LaIberica");
        Chocolatina c2 = new Chocolatina("Ferrero");
        BolsaCho.add(c);
        BolsaCho.add(c1);
        BolsaCho.add(c2);
        for(Chocolatina i : BolsaCho){
            System.out.println("Chocolate: " + i.getMarca());
        }

        Bolsa<Golosina> bolsaGo = new Bolsa<Golosina> (3);
        Golosina g = new Golosina("caramelo", 1)
        Golosina g1
    }
}
