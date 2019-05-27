package projetolabprogramacao;
public class Pessoa {
    private String cpf, nome, dataNasc, raca, tipoSangue, estadoCivil, endereco, telefone, condicao;
    private char genero;

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getDataNasc() {
        return dataNasc;
    }

    private void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    private String getRaca() {
        return raca;
    }

    private void setRaca(String raca) {
        this.raca = raca;
    }

    private char getGenero() {
        return genero;
    }

    private void setGenero(char genero) {
        this.genero = genero;
    }

    private String getTipoSangue() {
        return tipoSangue;
    }

    private void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    private String getEstadoCivil() {
        return estadoCivil;
    }

    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    private String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    

    public void novoPessoa(String c, String no, String dat, String ra, char ge, String tsan, String esci, String en, String tel, String con){
        this.setCpf(c);
        this.setNome(no);
        this.setDataNasc(dat);
        this.setRaca(ra);
        this.setGenero(ge);
        this.setTipoSangue(tsan);
        this.setEstadoCivil(esci);
        this.setEndereco(en);
        this.setTelefone(tel);
        this.setCondicao(con);
    }
    
    public void mostrarPessoa() {
        System.out.print("CPF: " + this.getCpf());
        System.out.println("      Nome: " + this.getNome());
        System.out.print("Nascido(a): " + this.getDataNasc());
        System.out.print("   Raca: " + this.getRaca());
        System.out.println("    Gênero: " + this.getGenero());
        System.out.print("Tipo Sanguíneo: " + this.getTipoSangue());
        System.out.println("    Estado Civil: " + this.getEstadoCivil());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("    Telefone: " + this.getTelefone());
    }
      
}
