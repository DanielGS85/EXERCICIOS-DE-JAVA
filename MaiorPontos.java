import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class MaiorPontos { // Declaração da classe principal

    public static void main(String[] args) { // Método main: ponto de entrada do programa

        Scanner sc = new Scanner(System.in); // Criação do objeto Scanner para capturar entradas

        int[] pontos = new int[6]; // Declaração de um vetor de inteiros com 6 posições
        int maior = Integer.MIN_VALUE; // Variável para armazenar o maior valor (inicializada com o menor inteiro possível)

        for (int i = 0; i < pontos.length; i++) { // Laço for: percorre todas as posições do vetor
            System.out.print("Digite o ponto " + (i + 1) + ": "); // Solicita ao usuário o valor
            pontos[i] = sc.nextInt(); // Lê o valor digitado e armazena no vetor
            if (pontos[i] > maior) { // Verifica se o valor atual é maior que o armazenado em "maior"
                maior = pontos[i]; // Atualiza o maior valor
            }
        } // Fim do laço for

        System.out.print("Pontos digitados: "); // Exibe mensagem inicial
        for (int p : pontos) { // Laço for-each: percorre o vetor para exibir os valores
            System.out.print(p + " "); // Mostra cada ponto separado por espaço
        }

        System.out.println("\nMaior pontuação: " + maior); // Exibe o maior valor encontrado

        sc.close(); // Fecha o Scanner para liberar recursos
    } // Fim do método main
} // Fim da classe MaiorPontuacao