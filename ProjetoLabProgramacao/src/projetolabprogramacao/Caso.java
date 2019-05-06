package projetolabprogramacao;
public class Caso extends Ocorrencia{
    private  int idCaso;
    private String condicao;

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    public void adicionarCaso(int nres, String pri, String des, String d, String h, int idcas, String cond){
        this.registrarOcorrencia(nres,pri,des,d,h);
        this.setIdCaso(idcas);
        this.setCondicao(cond);
    }
    
    public void editarCaso(){
    }
    
    public void visualizarCaso(){
    }

    @Override
    public String toString() {
        return "Caso{" + "idCaso=" + idCaso + ", condicao=" + condicao + '}';
    }
    
}
