
package gabrielalopes.contrutores;
import java.util.Scanner;
public class Pessoa {
    private String nome, cpf, email;
    private String telefone;
    private int id;
    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    // Métodos getter e setter
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        this.nome = scanner.nextLine();

        System.out.println("Digite seu email:");
        this.email = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        this.cpf = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }
}

