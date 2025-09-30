public class ConversorDeMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 50;
        double valorEmReal = converterDolarParaReal(valorEmDolar);
        System.out.println("O valor em reais é: " + valorEmReal);
    }

    public static double converterDolarParaReal(double valorEmDolar) {
        double taxaDeCambio = 5.25; // Exemplo de taxa de câmbio
        return valorEmDolar * taxaDeCambio;
    }
}
