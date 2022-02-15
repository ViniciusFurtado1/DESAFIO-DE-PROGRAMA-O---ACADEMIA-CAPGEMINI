import java.util.Scanner;

/**Classe principal do programa para a execução do mesmo.
 * O programa recebe uma String qualquer e informa (se nescessário) a quantidade de
 * caracteres que faltam para atingir o número minimo de caracters nescessários.
 *
 * @author Vinicius Furtado
 */
public class Main {
    /**Método responsável pela inicialização do programa e pelo retorno da resposta desejada.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();

        int result = verifyPassword(password);

        System.out.println(result);
    }

    /**Método responsavel pela verificação da quantidade de Caractes em uma String qualquer,
     * retorna o valor de caracteres nescessarios(caso haja), para a senha se tornar segura.
     *
     * @param password String - Senha que deverá ser verificada.
     * @return int - Número de Caracteres que faltam para a senha se tornar segura.
     */
    public static int verifyPassword(String password) {
        int MIN_LENGTH = 6;
        if (password.length() < MIN_LENGTH) {
            return (MIN_LENGTH - password.length());
        }
        return 0;
    }
}
