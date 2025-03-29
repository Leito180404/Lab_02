package Ejercicios;

public class OperacionesMatDouble implements Operable<Double>{
    private Double valor;

    public OperacionesMatDouble(Double valor){
        this.valor = valor;
    }

    @Override
    public Double suma(Double otro){
        return valor + otro;
    }
}
