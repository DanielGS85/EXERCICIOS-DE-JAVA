<<<<<<< HEAD
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
=======
import java.util.Scanner; // importa a classe Scanner, que permite ler dados digitados pelo usuário no console

public class MediaDeNotas { // declaração da classe principal chamada MediaDeNotas
    public static void main(String[] args) { // método main: ponto de entrada do programa
        Scanner input = new Scanner(System.in); // cria um objeto Scanner para capturar a entrada do teclado
        double soma = 0; // variável que acumula a soma das notas válidas
        int contador = 0; // variável que conta quantas notas válidas foram digitadas

        for (int i = 0; i <= 5; i++) { // laço for que vai repetir 5 vezes (de 1 até 5)
            System.out.print("Digite a nota " + i + ": "); // pede ao usuário para digitar a nota correspondente
            double nota = input.nextDouble(); // lê a nota digitada pelo usuário (tipo double)

            if (nota > 10) { // verifica se a nota é maior que 10 (inválida)

                System.out.println("Nota inválida! Digite novamente."); // avisa que a nota não é aceita
                i--; // decrementa o índice para repetir a mesma posição no próximo loop
                continue; // volta para o início do loop sem contar essa nota
            }

            if (nota < 0) { // verifica se a nota é menor que 0
                System.out.println("Nota menor que 0 detectada. Encerrando..."); // mensagem de encerramento
                break; // interrompe o loop imediatamente
            }

            soma += nota; // adiciona a nota válida à soma total
            contador++;   // incrementa o contador de notas válidas
        }

        if (contador > 0) { // verifica se pelo menos uma nota válida foi digitada
            double media = soma / contador; // calcula a média dividindo a soma pelo número de notas válidas
            System.out.println("A média das notas válidas é: " + media); // exibe a média no console
        } else { // caso nenhuma nota válida tenha sido digitada
            System.out.println("Nenhuma nota válida foi digitada."); // exibe mensagem de aviso
        }

        input.close(); // fecha o objeto Scanner para liberar recursos
    } // fim do método main
} // fim da classe MediaDeNotas
>>>>>>> 19ba6ea08d9b95428a822ff8f742551fc8804a9d
