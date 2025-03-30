package Ejercicios;


public class OperacionesMatInteger<E extends Number> implements Operable<E> {

    private E valor;
    private Class<E> type;

    public OperacionesMatInteger(E valor, Class<E> type) {
        this.valor = valor;
        this.type = type;
    }

    @Override
    public E suma(E otro) {
        return type.cast(Integer.valueOf(valor.intValue() + otro.intValue()));
    }

    @Override
    public E resta(E otro) {
        return type.cast(Integer.valueOf(valor.intValue() - otro.intValue()));
    }

    @Override
    public E producto(E otro) {
        return type.cast(Integer.valueOf(valor.intValue() * otro.intValue()));
    }

    @Override
    public E division(E otro) {
        if (otro.intValue() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return type.cast(Integer.valueOf(valor.intValue() / otro.intValue()));
    }
}

