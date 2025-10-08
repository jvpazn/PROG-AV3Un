import java.util.Date;

public class Usuario {
    private String nome;
    private String senha;
    private Date dataDeNascimento;
    private String CPF;
    private String emailPessoal;

    public Usuario(String nome, String senha, Date dataDeNascimento, String CPF, String emailPessoal) {
        this.nome = nome;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
        this.CPF = CPF;
        this.emailPessoal = emailPessoal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmailPessoal() {
        return this.emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

}
