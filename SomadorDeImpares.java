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
public class SomadorDeImpares {
    public static void main(String[] args) {
          int soma =0;                         // variavel que vai guardar a soma dos numeros impares 
          for(int i= 1; i<= 100; i+= 2){       // i inicia em 1, o loop vai ate 100 e o incremento eh de 2 em 2
               soma += i;                      // soma = soma + i
               System.out.println(soma);       // imprime a soma dos numeros impares ate o momento
               if(i % 2 != 0){         // se o resto da divisao de i por 2 for diferente de 0, ou seja, se i for impar
                    System.out.println(soma); // imprime na tela que i eh impar
            }
        }
    }
}
>>>>>>> 19ba6ea08d9b95428a822ff8f742551fc8804a9d
