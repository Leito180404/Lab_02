package Ejercicios;

public class OperacionesMatDouble<E extends Number> implements Operable<E> {

    private E valor;
    private Class<E> type;

    public OperacionesMatDouble(E valor, Class<E> type) {
        this.valor = valor;
        this.type = type;
    }

    @Override
    public E suma(E otro) {
        return type.cast(Double.valueOf(valor.doubleValue() + otro.doubleValue()));
    }

    @Override
    public E resta(E otro) {
        return type.cast(Double.valueOf(valor.doubleValue() - otro.doubleValue()));
    }

    @Override
    public E producto(E otro) {
        return type.cast(Double.valueOf(valor.doubleValue() * otro.doubleValue()));
    }

    @Override
    public E division(E otro) {
        if (otro.doubleValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return type.cast(Double.valueOf(valor.doubleValue() / otro.doubleValue()));
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "OperacionesMatDouble [valor=" + valor + "]";
    }
}
