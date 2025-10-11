public class Avaliacao {
    private String Sucesso_esperado;
    private String Nivel_vendas;
    private String Nivel_Complicacao;


    public Avaliacao(String Sucesso_esperado, String Nivel_vendas, String Nivel_Complicacao) {
        this.Sucesso_esperado = Sucesso_esperado;
        this.Nivel_vendas = Nivel_vendas;
        this.Nivel_Complicacao = Nivel_Complicacao;
    }

    public String getSucesso_esperado() {
        return this.Sucesso_esperado;
    }

    public void setSucesso_esperado(String Sucesso_esperado) {
        this.Sucesso_esperado = Sucesso_esperado;
    }

    public String getNivel_vendas() {
        return this.Nivel_vendas;
    }

    public void setNivel_vendas(String Nivel_vendas) {
        this.Nivel_vendas = Nivel_vendas;
    }

    public String getNivel_Complicacao() {
        return this.Nivel_Complicacao;
    }

    public void setNivel_Complicacao(String Nivel_Complicacao) {
        this.Nivel_Complicacao = Nivel_Complicacao;
    }

}
