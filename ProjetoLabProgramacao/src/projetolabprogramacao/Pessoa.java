package projetolabprogramacao;
public class Pessoa {
    private String cpf, nome, endereco, estadoCivil, dataNasc, telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarPessoa(String c, String n, String e, String ec, String d, String t){
        this.setCpf(c);
        this.setNome(n);
        this.setEndereco(e);
        this.setEstadoCivil(ec);
        this.setDataNasc(d);
        this.setTelefone(t);
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + ", dataNasc=" + dataNasc + ", telefone=" + telefone + '}';
    }
    
    
}
