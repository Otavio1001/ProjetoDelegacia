package projetolabprogramacao;
public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String prioridade;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    public void cadastrarVeiculo(String p, String m, int a, String pri){
        this.setPlaca(p);
        this.setModelo(m);
        this.setAno(a);
        this.setPrioridade(pri);
    }
    
    public void editarVeiculo(String p, String m, int a, String pri){
        this.setPlaca(p);
        this.setModelo(m);
        this.setAno(a);
        this.setPrioridade(pri);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", prioridade=" + prioridade + '}';
    }
    
    
}
