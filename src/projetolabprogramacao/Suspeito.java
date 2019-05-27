package projetolabprogramacao;
public class Suspeito extends Civil{
    private String crime, cela;

    //Métodos Get e Set
    private String getCrime() {
        return crime;
    }

    private void setCrime(String crime) {
        this.crime = crime;
    }

    private String getCela() {
        return cela;
    }

    private void setCela(String cela) {
        this.cela = cela;
    }
    
    //Métodos criados para a classe
    public void pesquisarSuspeito(){
    }
    
    public void editarSuspeito(){
    }
    
    public void removerSuspeito(){
    }

    public void novoSuspeito(String c, String no, String dat, String ra, char ge, String tsan, String esci, String en, String tel,
    int id, String cond, boolean ant, String cri, String cel){
        this.novoCivil(c, no, dat, ra, ge, tsan, esci, en, tel, id, cond, ant);
        this.setCrime(cri);
        this.setCela(cel);
    }
    
    public void mostrarSuspeito(){
        System.out.println("\n-----SUSPEITO-----");
        this.mostrarCivil();
        System.out.println("Crime: " + this.getCrime());
        System.out.println("Cela: " + this.getCela());
    }
    
    
}
