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
