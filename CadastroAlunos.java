import java.util.Scanner; // Importa a classe Scanner, que permite ler dados digitados pelo usuário
    public class CadastroAlunos { // cria um obejeto da classe CadastroAlunos 
        String nome;
        int matricula;
        double nota;
        public static void main(String[] args) {
            Scanner leia =  new Scanner(System.in); // Cria um objeto Scanner chamado "leia" para capturar entradas do teclado
            Aluno[] alunos = new Aluno[3]; // cria um vetor de String com 3 posicoes (armazenara 3 alunos)
            CadastroAlunos aluno = new CadastroAlunos(); // Cria um objeto INSTANCIA "aluno" da classe CadastroAlunos, que terá os atributos preenchidos
            
            for (int i = 0; i < alunos.length; i++) { // Estrutura de repetição for: percorre todas as posições do vetor "alunos"
                System.out.println("-------- Cadastro dos Alunos");
                alunos[i] = new Aluno(); // Cria uma nova instância de Aluno para cada posição do vetor
                System.out.println("Digite o nome do aluno: "); // Exibe mensagem pedindo o nome do aluno
                alunos[i].nome =leia.nextLine(); // Lê a entrada do usuário e armazena no atributo "nome" do objeto aluno na posição i
                System.out.println("Digite a matricula do aluno: "); // Exibe mensagem pedindo a matrícula do aluno
                alunos[i].maticula = leia.nextInt(); // Lê a entrada do usuário e armazena no atributo "matricula" do objeto aluno na posição i
                System.out.println("Digite a nota do aluno: "); // Exibe mensagem pedindo a nora do aluno
                alunos[i].nota = leia.nextDouble(); // Lê a entrada do usuário e armazena no atributo "nota" do objeto aluno na posição i
                leia.nextLine(); // Limpa o buffer do scanner
            } // Fim do laço for
            
            System.out.println("-------- Dados dos Alunos --------- ");
            for(int i =0; i< alunos.length; i++){
                System.out.println("Aluno: "+alunos[i].nome); // Exibe no console o valor armazenado no atributo "nome"
                System.out.println("Matricula:"+alunos[i].maticula); // Exibe no console o valor armazenado no atributo "matricula"
                System.out.println("Nota: "+alunos[i].nota +"\n"); // Exibe no console o valor armazenado no atributo "nota
            
                leia.close(); // Fecha o objeto Scanner para liberar os recursos do sistema
            }
        }

}
