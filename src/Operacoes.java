public class Operacoes {
    public float add(float n1, float n2){
        return n1 + n2;
    }

    public float div(float n1, float n2){
        if (n2 == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return 0; // Retorna 0 em caso de erro
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
