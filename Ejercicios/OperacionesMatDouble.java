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

    @Override
    public Double resta(Double otro){
        return valor - otro;
    }

    @Override
    public Double producto(Double otro){
        return valor * otro;
    }

    @Override
    public Double division(Double otro){
        return valor / otro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "OperacionesMatDouble [valor=" + valor + "]";
    }
}
