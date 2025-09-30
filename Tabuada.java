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
