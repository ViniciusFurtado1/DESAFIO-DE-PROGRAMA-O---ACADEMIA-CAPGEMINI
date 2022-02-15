import java.util.Scanner;

/**
 * Classe principal do programa para a execução do mesmo.
 * O programa recebe um inteiro n qualquer e imprime uma escada de
 * caracteres * com base e tamanho n.
 *
 * @author Vinicius Furtado
 */
public class Main {
    /**
     * Método responsável pela inicialização do programa e pelo retorno da resposta desejada.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String result = String.valueOf(getStair(n));

        System.out.println(result);
    }

    /**
     * Método responsável por montar uma string em forma de escada a partir de um inteiro qualquer.
     *
     * @param n int - Inteiro que determina o tamanho e a base da escada.
     * @return StringBuilder - String montada na forma de escada.
     */
    public static StringBuilder getStair(int n) {
        StringBuilder stair = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                stair.append(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                stair.append("*");
            }
            if (i != n - 1) {
                stair.append("\n");
            }
        }
        return stair;
    }
}