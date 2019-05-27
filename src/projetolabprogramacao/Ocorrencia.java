package projetolabprogramacao;
public class Ocorrencia {
    private int nRegistro;
    private String prioridade, descricao, data, horario;

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void registrarOcorrencia(int nres, String pri, String des, String d, String h){
        this.setnRegistro(nres);
        this.setPrioridade(pri);
        this.setDescricao(des);
        this.setData(d);
        this.setHorario(h);
    }
    
    public void editarOcorrencia(){
    }
    
    public void removerOcorrencia(){
    }
    
    public void visualizarOcorrencia(){
    }
   
}
