import java.util.List;


public class Proj {
    private String nome;
    private String conteudo;
    private String DataFinal;
    private List<Patrocinador> patrocinadores;
    private Avaliacao avaliacao;


    public Proj(String nome, String conteudo, String DataFinal, List<Patrocinador> patrocinadores, Avaliacao avaliacao) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.DataFinal = DataFinal;
        this.patrocinadores = patrocinadores;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataFinal() {
        return this.DataFinal;
    }

    public void setDataFinal(String DataFinal) {
        this.DataFinal = DataFinal;
    }

    public List<Patrocinador> getPatrocinadores() {
        return this.patrocinadores;
    }

    public void setPatrocinadores(List<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public Avaliacao getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

}
