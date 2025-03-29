package Ejercicios;

public class Operable <T extends Number> {

    private T num1;
    private T num2;

    //construtor
    public Operable(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double resta() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double producto() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double division() {
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("No se puede dividir entre 0 algun valor");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    @Override
    public String toString(){
        return "Operable: [num1="+ num1 +", num2="+ num2 +"]";
    }

}
