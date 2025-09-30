public class VerificardoDePermissao {
    public static void main(String[] args) {
        double altura = 1.55;
        boolean estaAcompanhada = true;
        
        if (altura >= 1.60  ||  estaAcompanhada){
            System.out.println("Pode entrar no brinquedo!");
        }
        else {
            System.out.println("Nao pode entrar");
        }
    }
    
}
