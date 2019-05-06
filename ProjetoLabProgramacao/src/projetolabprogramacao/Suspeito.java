package projetolabprogramacao;
public class Suspeito extends Civil{
    private String crime, cela;

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getCela() {
        return cela;
    }

    public void setCela(String cela) {
        this.cela = cela;
    }
    
    public void pesquisarSuspeito(){
    }
    
    public void editarSuspeito(String c, String n, String e, String ec, String d, String t, int idciv, String cond, boolean ant, String cri, String cel){
        this.cadastrarCivil(c,n,e,ec,d,t,idciv,cond,ant);
        this.setCrime(cri);
        this.setCela(cel);
    }
    
    public void removerSuspeito(){
    }

    @Override
    public String toString() {
        return "Suspeito{" + "crime=" + crime + ", cela=" + cela + '}';
    }
    
    
}
