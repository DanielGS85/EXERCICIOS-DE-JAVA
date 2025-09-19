import java.util.Scanner;
public class nome {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Ola " +nome+"!");
        leia.close();
    }
    
}
