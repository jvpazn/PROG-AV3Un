import java.util.List;

public class Setor {
    private String nome;
    private Proj projeto_Principal;
    private List<Proj> projetos_Secundarios;
    private List<Funcionario> funcionarios;
    private List<Estagiario> estagiarios;
    private String id_Setor;

    public Setor(String nome, Proj projeto_Principal, List<Proj> projetos_Secundarios,
                 List<Funcionario> funcionarios, List<Estagiario> estagiarios, String id_Setor){
                    this.nome = nome;
                    this.projeto_Principal = projeto_Principal;
                    this.projetos_Secundarios = projetos_Secundarios;
                    this.funcionarios = funcionarios;
                    this.estagiarios = estagiarios;
                    this.id_Setor = id_Setor;
                 }
         



   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Proj getProjeto_Principal() {
      return this.projeto_Principal;
   }

   public void setProjeto_Principal(Proj projeto_Principal) {
      this.projeto_Principal = projeto_Principal;
   }

   public List<Proj> getProjetos_Secundarios() {
      return this.projetos_Secundarios;
   }

   public void setProjetos_Secundarios(List<Proj> projetos_Secundarios) {
      this.projetos_Secundarios = projetos_Secundarios;
   }

   public List<Funcionario> getFuncionarios() {
      return this.funcionarios;
   }

   public void setFuncionarios(List<Funcionario> funcionarios) {
      this.funcionarios = funcionarios;
   }

   public List<Estagiario> getEstagiarios() {
      return this.estagiarios;
   }

   public void setEstagiarios(List<Estagiario> estagiarios) {
      this.estagiarios = estagiarios;
   }

   public String getId_Setor() {
      return this.id_Setor;
   }

   public void setId_Setor(String id_Setor) {
      this.id_Setor = id_Setor;
   }


}