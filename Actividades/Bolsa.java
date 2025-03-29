package Actividades;
import java.util.ArrayList;
import  java.util.Iterator;

public class Bolsa < T > implements Iterable < T >{
    private ArrayList < T > lista = new ArrayList< T >();
    private int tope;

    public Bolsa (int tope) {
        super();
        this.tope = tope;
    }

    public void add(T objeto){
        if(lista.size() < tope){
            lista.add(objeto);
            System.out.println("guardado");
        }
        else{
            throw new RuntimeException("no caben mas");
        }
    }
    @Override
    public Iterator < T > iterator (){
        return lista.iterator();
    }
}
