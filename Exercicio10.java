package JavaBasico;

public class Exercicio10 {
    public static void main(String[] args) {

        int dia = 1;
        String resultado;

        switch (dia) {
            case 1:
                resultado = "Segunda-feira";
                break;

            case 2:
                resultado = "Terça-feira";
                break;

            default:
                resultado = "Dia não cadastrado";
                break;
        }

        System.out.printf("Dia da semana: %s%n", resultado);
    }
}
