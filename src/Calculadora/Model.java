package Calculadora;

public class Model {
    public float add(float n1, float n2){
        return n1 + n2;
    }

    public float div(float n1, float n2) throws IllegalArgumentException{
        if (n2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        else {
            return n1 / n2;
        }
    }

    public float multiplicate(float n1, float n2){
        return n1 * n2;
    }

    public float sub(float n1, float n2){
            return n1 - n2;
        }
}
