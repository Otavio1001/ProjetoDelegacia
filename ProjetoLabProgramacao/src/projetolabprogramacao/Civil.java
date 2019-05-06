package projetolabprogramacao;
public class Civil extends Pessoa{
    private int idCivil;
    private String condicao;
    private boolean antecedentes;
    
    public void adicionarCivil(){
    }
    
    public void pesquisarCivil(){    
    }
    
    public void editarCivil(){    
    }
    
    public void removerCivil(){    
    }

    public int getIdCivil() {
        return idCivil;
    }

    public void setIdCivil(int idCivil) {
        this.idCivil = idCivil;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public boolean isAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }
    
    public void cadastrarCivil(String c, String n, String e, String ec, String d, String t, int idciv, String cond, boolean ant){
        this.cadastrarPessoa(c, n, e, ec, d, t);
        this.setIdCivil(idciv);
        this.setCondicao(cond);
        this.setAntecedentes(ant);
    }

    @Override
    public String toString() {
        return "Civil{" + "idCivil=" + idCivil + ", condicao=" + condicao + ", antecedentes=" + antecedentes + '}';
    }
    
}
