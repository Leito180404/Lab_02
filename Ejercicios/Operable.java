package Ejercicios;

public interface Operable<E> {

    E suma(E otro);

    E resta(E otro);

    E producto(E otro);

    E division(E otro);

}

class NumeroOperable implements Operable<NumeroOperable> {
    private double valor;

    public NumeroOperable(double valor) {
        this.valor = valor;
    }

    @Override
    public NumeroOperable suma(NumeroOperable otro) {
        return new NumeroOperable(this.valor + otro.valor);
    }

    @Override
    public NumeroOperable resta(NumeroOperable otro) {
        return new NumeroOperable(this.valor - otro.valor);
    }

    @Override
    public NumeroOperable producto(NumeroOperable otro) {
        return new NumeroOperable(this.valor * otro.valor);
    }

    @Override
    public NumeroOperable division(NumeroOperable otro) {
        if(otro.valor == 0){
            throw new ArithmeticException("No se puede dividir por cero un numero");
        }
        return new NumeroOperable(this.valor / otro.valor);
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return "NumeroOperable: [valor=" + valor + "]";
    }
}
