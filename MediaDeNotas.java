import java.util.Scanner; // importa a classe Scanner, que permite ler dados digitados pelo usuário

public class MediaDeNotas { // define a classe principal chamada MediaDeNotas
    public static void main(String[] args) { // método principal, ponto de entrada do programa
        Scanner sc = new Scanner(System.in); // cria um objeto Scanner chamado 'sc' para capturar entrada do teclado

        double soma = 0; // inicializa a variável 'soma' que vai acumular o total das notas
        double[] notas = new double[5]; // cria um array de 5 posições para armazenar as notas digitadas

        for (int i = 0; i < 5; i++) { // laço que se repete 5 vezes, com i variando de 0 a 4 (índices do array)
            System.out.println("Digite a nota " + (i + 1) + ":"); // exibe a mensagem pedindo a nota (com número legível)
            notas[i] = sc.nextDouble(); // lê a nota digitada pelo usuário e armazena na posição i do array

            soma += notas[i]; // adiciona a nota digitada à variável 'soma'

            // verifica se a nota é maior que 10
            if (notas[i] > 10) {
                continue; // ignora o restante do loop e vai para a próxima nota (mas já somou a nota inválida!)
            }
            // verifica se a nota é menor que 0
            else if (notas[i] < 0) {
                break; // interrompe o loop completamente (mas também já somou a nota inválida!)
            }
        }

        double media = soma / notas.length; // calcula a média dividindo a soma pelo número de notas (5)
        System.out.println("A média das notas validas é: " + media); // exibe a média calculada no console

        sc.close(); // fecha o Scanner para liberar recursos
    } // fim do método main
} // fim da classe MediaDeNotas
