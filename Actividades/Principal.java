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
        Golosina g = new Golosina("caramelo", 1);
        Golosina g1 = new Golosina("Chicle", 1.2);
        Golosina g2 = new Golosina("Chupetin", 2);

        bolsaGo.add(g);
        bolsaGo.add(g1);
        bolsaGo.add(g2);
        System.out.println("En la bolsa de golosinas hay: ");
        for (Golosina j: bolsaGo){
            System.out.println("Golosina: " + j.getNombre() + "peso: " + j.getPeso());
        }
    }
}
