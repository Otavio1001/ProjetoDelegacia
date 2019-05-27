package projetolabprogramacao;
public class Civil extends Pessoa{
    private int idCivil;
    private boolean antecedentes;
    
    
    //Métodos Get e Set
     private int getIdCivil() {
        return idCivil;
    }

    private void setIdCivil(int idCivil) {
        this.idCivil = idCivil;
    }

    private boolean isAntecedentes() {
        return antecedentes;
    }

    private void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }
    
    
    //Métodos Criados pra classe
    public void adicionarCivil(){
    }
    
    public void pesquisarCivil(){    
    }
    
    public void editarCivil(){    
    }
    
    public void removerCivil(){    
    }

   
    
    public void novoCivil(String c, String no, String dat, String ra, char ge, String tsan, String esci, String en, String tel,
    int id, String con, boolean ant){
        this.novoPessoa(c, no, dat, ra, ge, tsan, esci, en, tel, con);
        this.setIdCivil(id);
        this.setAntecedentes(ant);
    }

    public void mostrarCivil(){
        System.out.println("\n-----CIVIL-----");
        System.out.println("ID: " + this.getIdCivil());
        this.mostrarPessoa();
        System.out.print("Condição: " + this.getCondicao());
        if(this.isAntecedentes()){
            System.out.println("   Antecedentes: Sim");
        } else{
            System.out.println("   Antecedentes: Não");
        }
    }    
}
