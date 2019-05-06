package projetolabprogramacao;
public class Policial extends Pessoa{
    private int idPolicial;
    private float salario; 
    private String patente, tipoSanguineo, divisao, formacaoAcademica, especialidade, login, senha;

    public int getIdPolicial() {
        return idPolicial;
    }

    public void setIdPolicial(int idPolicial) {
        this.idPolicial = idPolicial;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void pesquisarPolicial(){
        
    }
    
    public void editarPolicial(String c, String n, String e, String ec, String d, String t, int idpol, float sal, String pa, String tsan, String div, String faca, String esp, String l, String s){
        this.cadastrarPessoa(c, n, e, ec, d, t);
        this.setIdPolicial(idpol);
        this.setSalario(sal);
        this.setPatente(pa);
        this.setTipoSanguineo(tsan);
        this.setDivisao(div);
        this.setFormacaoAcademica(faca);
        this.setEspecialidade(esp);
        this.setLogin(l);
        this.setSenha(s);
    }
    
    public void removerPolicial(){

    }
    
    public void pedirVeiculo(){

    }
    
    public void liberarVeiculo(){
    
    }

    @Override
    public String toString() {
        return "Policial{" + "idPolicial=" + idPolicial + ", salario=" + salario + ", patente=" + patente + ", tipoSanguineo=" + tipoSanguineo + ", divisao=" + divisao + ", formacaoAcademica=" + formacaoAcademica + ", especialidade=" + especialidade + ", login=" + login + ", senha=" + senha + '}';
    }
}
