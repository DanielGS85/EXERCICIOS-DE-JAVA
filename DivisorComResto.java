public class DivisorComResto {
    public static void main(String[] args){
        int TotalDeItens = 17;
        int CapacidadeDaCaixa = 5;
        int Cociete = TotalDeItens / CapacidadeDaCaixa;
        int Resto =  TotalDeItens % CapacidadeDaCaixa;
        
        System.out.println("Serao preenchidas um total de " +Cociete + " caixas!" );
        System.out.println("sobrarao "+ Resto);  
     }
    }  

