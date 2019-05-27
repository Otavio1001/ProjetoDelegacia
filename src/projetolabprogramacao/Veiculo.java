package projetolabprogramacao;
public class Veiculo {
    private String placa, modelo, condicao;
    private int idVeiculo, ano, prioridade;
    
    

    //Métodos Get e Set
    private int getIdVeiculo() {
        return idVeiculo;
    }
    
    private void setIdVeiculo(int idVeiculo) {    
        this.idVeiculo = idVeiculo;
    }

    private String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    private int getPrioridade() {
        return prioridade;
    }

    private void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    private String getCondicao() {
        return condicao;
    }

    private void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
    //Métodos criados para a classe
    public void cadastrarVeiculo(){
    }
    
    public void editarVeiculo(){
    }
 
    public void novoVeiculo(int id, String p, String m, int a, int pri, String con){
        this.setIdVeiculo(id);
        this.setPlaca(p);
        this.setModelo(m);
        this.setAno(a);
        this.setPrioridade(pri);
        this.setCondicao(con);
    }
    
    public void mostrarVeiculo(){
        System.out.println("\n-----VEÍCULO-----");
        System.out.println("ID: " + this.getIdVeiculo());
        System.out.println("Modelo: " + this.getModelo() + "   Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno() + "   Prioridade: " + this.getPrioridade() + "   Condição: " + this.getCondicao());
    }
    
}
