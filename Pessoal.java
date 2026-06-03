public class Pessoa {
    private Sting nome;
    private string cpf;
    private string endereco;
    private telefone;
    public string sexo;
    
    public Pessoa(String nome, String cpf, String endereco, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public void cadastro() {
        System.out.println("Pessoa cadastrada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
    }
    public Sting getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Sting getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getSexo() {
        return sexo;
    }
}
