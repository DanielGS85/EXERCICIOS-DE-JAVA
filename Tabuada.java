<<<<<<< HEAD
public class SomadorDeImpares { // define a classe chamada SomadorDeImpares
    public static void main(String[] args) { // método principal, ponto de entrada do programa
        
        int num, soma = 0; // declara duas variáveis: 'num' (não usada) e 'soma' iniciada em 0

        for (int i = 1; i <= 100; i++) { // laço que percorre os números de 1 até 100
            if (i % 2 != 0) { // verifica se o número 'i' é ímpar (resto da divisão por 2 é diferente de 0)
                soma += i; // se for ímpar, adiciona o valor de 'i' à variável 'soma'
            }
        }

        System.out.println("A soma dos ímpares até 100 é: " + soma); // exibe o resultado final da soma
    } // fim do método main
} // fim da classe SomadorDeImpares
=======
public class Tabuada {
    public static void main(String[] args) {
        int numero = 5; // Você pode alterar esse valor para gerar a tabuada de outro número

        System.out.println("Tabuada do " + numero + ":");  // vai impimi na tela a tabuada do numero escolhido na vaiavel numero = 5
        for (int i = 1; i <= 10; i++) {       // i eh o contador e esta = 1, vai  fazer o loop ate  i <= 10,  o i++ eh o incremento ou adiciona mais 1
            System.out.println(numero + " x " + i + " = " + (numero * i));    /* vai imprimir o numero escolhido na variavel numero = 5, o i
                                                                               que vai de 1 a 10 e o resultado da multiplicacao do numero * i. */
        }
    }    
}
>>>>>>> 19ba6ea08d9b95428a822ff8f742551fc8804a9d
