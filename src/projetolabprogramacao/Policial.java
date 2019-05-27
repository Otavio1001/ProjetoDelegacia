package projetolabprogramacao;
public class Policial extends Pessoa{
    private int idPolicial;
    private double salario; 
    private String patente, divisao, formacaoAcademica, especialidade, login, senha;

    
    //Métodos Get e Set
    private int getIdPolicial() {
        return idPolicial;
    }

    private void setIdPolicial(int idPolicial) {
        this.idPolicial = idPolicial;
    }

    private double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    private String getPatente() {
        return patente;
    }

    private void setPatente(String patente) {
        this.patente = patente;
    }

    private String getDivisao() {
        return divisao;
    }

    private void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    private String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    private void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    private String getEspecialidade() {
        return especialidade;
    }

    private void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    private String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    //Métodos criados para a classe
    public void pesquisarPolicial(){
    }
    
    public void editarPolicial(){
    }
    
    public void removerPolicial(){
    }
    
    public void pedirVeiculo(){
    }
    
    public void liberarVeiculo(){
    }

    public void novoPolicial(String c, String no, String dat, String ra, char ge, String tsan, String esci, String en, String tel,
    int id, double sal, String con, String pat, String div, String faca, String esp, String l, String s){
        this.novoPessoa(c, no, dat, ra, ge, tsan, esci, en, tel, con);
        this.setIdPolicial(id);
        this.setSalario(sal);
        this.setPatente(pat);
        this.setDivisao(div);
        this.setFormacaoAcademica(faca);
        this.setEspecialidade(esp);
        this.setLogin(l);
        this.setSenha(s);
    }
    
    public void mostrarPolicial(){
        System.out.println("\n-----POLICIAL-----");
        System.out.println("ID: " + this.getIdPolicial());
        this.mostrarPessoa();
        System.out.print("Patente: " + this.getPatente());
        System.out.print("   Divisão: " + this.getDivisao() + "   Condição: " + this.getCondicao());
        System.out.println("   Salário: " + this.getSalario());
        System.out.print("Formação Acadêmica: " + this.getFormacaoAcademica());
        System.out.println("   Especialidade: " + this.getEspecialidade());
        System.out.println("Login: " + this.getLogin() + "  Senha: " + this.getSenha());
    }
}
