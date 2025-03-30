package Ejercicios;

public class OperacionesMatInteger implements Operable<Integer> {

    private Integer valor;

    public OperacionesMatInteger(Integer valor) {
        this.valor = valor;
    }

    @Override
    public Integer suma(Integer otro) {
        return valor + otro;
    }

    @Override
    public Integer resta(Integer otro) {
        return valor - otro;
    }

    @Override
    public Integer producto(Integer otro) {
        return valor * otro;
    }

    @Override
    public Integer division(Integer otro) {
        if (otro == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return valor / otro;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "OperacionesMatInteger [valor=" + valor + "]";
    }
}

