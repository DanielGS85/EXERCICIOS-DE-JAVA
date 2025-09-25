public class IdentificardorDeIdade {
    public static void main(String[] args) {
        int idade =25;

        if(idade < 12){
            System.out.println("Classificaçao da idade é criança! ");
        }
        else if(idade < 18 ){
            System.out.println("Classificaçao da idade é adolecesnte! ");
        }
        if(idade  < 60 ){
            System.out.println("Classificaçao da idade é adulto! ");
        }
        else if(idade >= 60){
            System.out.println("Classificaçao da idade é idoso! ");
        }
        
    }
}
