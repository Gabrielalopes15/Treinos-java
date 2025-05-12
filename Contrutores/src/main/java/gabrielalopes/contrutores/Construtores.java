package gabrielalopes.contrutores;

public class Construtores {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriela", "gabriela@email.com", "123.456.789-00");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("CPF: " + pessoa.getCpf());
    }
}
