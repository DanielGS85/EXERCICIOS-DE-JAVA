import java.util.Scanner; // Importa a classe Scanner, que permite ler dados digitados pelo usuário

public class Aluno { // Declaração da classe pública chamada "Aluno"
    
    String nome;     // Declaração do atributo "nome" do tipo String (armazenará o nome do aluno)
    int maticula;    // Declaração do atributo "maticula" do tipo int (armazenará a matrícula do aluno)
    double nota;     // Declaração do atributo "nota" do tipo double (armazenará a nota do aluno)
    
    public static void main(String[] args) { // Método main: ponto de entrada do programa
        
        Scanner leia = new Scanner(System.in); 
        // Cria um objeto Scanner chamado "leia" para capturar entradas do teclado
        
        Aluno aluno = new Aluno(); 
        // Cria um objeto "aluno" da classe Aluno, que terá os atributos preenchidos
        
        System.out.printf("\n -------- Cadastro de Alunos --------- \n"); 
        // Exibe um cabeçalho no console para indicar o início do cadastro
        
        System.out.printf("Digite o nome do aluno: "); 
        // Exibe uma mensagem pedindo o nome do aluno
        aluno.nome = leia.nextLine(); 
        // Lê a linha digitada pelo usuário e armazena no atributo "nome" do objeto aluno
        
        System.out.printf("Digite a matrricula do aluno: "); 
        // Exibe uma mensagem pedindo a matrícula do aluno
        aluno.maticula = leia.nextInt(); 
        // Lê o número inteiro digitado e armazena no atributo "maticula" do objeto aluno
        
        System.out.printf("Digite a nota do aluno: "); 
        // Exibe uma mensagem pedindo a nota do aluno
        aluno.nota = leia.nextDouble(); 
        // Lê o número decimal digitado e armazena no atributo "nota" do objeto aluno

        System.out.println(" -------- Dados do Aluno --------- "); 
        // Exibe um cabeçalho no console para indicar a exibição dos dados cadastrados
        
        System.out.println("Aluno :" + aluno.nome); 
        // Exibe no console o valor armazenado no atributo "nome"
        
        System.out.println("Maticula: " + aluno.maticula); 
        // Exibe no console o valor armazenado no atributo "maticula"
        
        System.out.println("Nota: " + aluno.nota); 
        // Exibe no console o valor armazenado no atributo "nota"
        
        leia.close(); 
        // Fecha o objeto Scanner para liberar os recursos do sistema
    } // Fim do método main

} // Fim da classe Aluno



