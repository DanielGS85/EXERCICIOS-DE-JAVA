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
