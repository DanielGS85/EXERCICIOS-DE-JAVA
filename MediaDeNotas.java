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