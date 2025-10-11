public class Cargo {
    private String titulo;
    private String descricao;
    private int nivelSalarialMinimo;
    private String requisitos;


    public Cargo(String titulo, String descricao, int nivelSalarialMinimo, String requisitos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nivelSalarialMinimo = nivelSalarialMinimo;
        this.requisitos = requisitos;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelSalarialMinimo() {
        return this.nivelSalarialMinimo;
    }

    public void setNivelSalarialMinimo(int nivelSalarialMinimo) {
        this.nivelSalarialMinimo = nivelSalarialMinimo;
    }

    public String getRequisitos() {
        return this.requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

}
