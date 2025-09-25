public class SituacaoAluno {
    public static void main(String[] args) {
        double nota1 = 10, nota2 = 10; double media =  (nota1+nota2)/2;
        if (media == 10) {
            System.out.println(" Parabens, esta aprovado! ");
        }if (media >= 7)  {
            System.out.println(" Aprovado! ");
        }else if(media < 7){
            System.out.println(" Reprovado");
        }
    }   
}
