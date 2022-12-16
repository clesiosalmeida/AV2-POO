package Ex01_Banco;

public class Cliente {
    //nome endereco telefone e Cidade

    private String nome;
    private String endereco;
    private String telefone; 
    private Cidade cidade;

    public Cliente(String nome, String endereco, String telefone, Cidade cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    } 

    
    
}
