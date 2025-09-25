public class VerificadorDiaSemana {
    public static void main(String[] args) {
        int diaDaSemana = 20;

        switch (diaDaSemana) {
            case 1,7:
            System.out.println("Fim de semana");
                
                break;
           case 2,3,4,5,6:
           System.out.println("Dia da semana");
           break;
            default:
            System.out.println("Dia invalido");
                break;
        }
    }
    
}    // 
