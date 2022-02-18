import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**Classe principal do programa onde se encontram todos os métodos para a execução do mesmo.
 * O programa recebe uma String qualquer e encontra o número de pares de Substrings que são anagramas.
 *
 * @author Vinicius Furtado
 *
 */
public class Main {
    /**Método responsável pela inicialização do programa e pelo retorno da resposta desejada.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr;
        String str = input.nextLine();
        int num;

        arr = getAllSubstrings(str);
        num = getNumOfAnagrams(arr);

        System.out.println(num);
    }

    /**Método responsável pelo retorno da quantidade de anagramas em um Array de Strings.
     *
     * @param arr ArrayList<String> - Array contendo todas as Substrings.
     * @return int - Número de anagramas.
     */
    public static int getNumOfAnagrams(ArrayList<String> arr) {
        int cont = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                char[] temp1 = arr.get(i).toCharArray();
                char[] temp2 = arr.get(j).toCharArray();

                Arrays.sort(temp1);
                Arrays.sort(temp2);

                if(Arrays.equals(temp1, temp2)) {
                    cont++;
                }
            }
        }
        return cont;
    }

    /**Método responsável pelo retorno de todas as substrings contidas em uma string.
     *
     * @param str String - String a ser verificada.
     * @return arr - ArrayList contendo todas as Substrings da string em questão.
     */
    public static ArrayList<String> getAllSubstrings(String str) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                arr.add(str.substring(i, j));
            }
        }
        return arr;
    }
}
