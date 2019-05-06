package projetolabprogramacao;

public class ProjetoLabProgramacao {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Policial p2 = new Policial();
      Civil p3 = new Civil();
      Suspeito p4 = new Suspeito();
      Veiculo v1 = new Veiculo();
      Ocorrencia c1 = new Ocorrencia();
      Caso c2 = new Caso();
      
      p1.cadastrarPessoa("999.999.999-99", "Otávio Antônio", "Rua Comun nºNormalzinho", "Solteiro", "23/10/1995", "99999-9999");
      p2.editarPolicial("999.999.999-99", "Otávio da Justiça", "Rua da Justiça nºIntrépido", "Solteiro", "23/10/1995", "99999-9999", 1001, 5000.00f, "Capitão", "O-", "SWAT", "Formou a Escola", "Todaspossiveis", "jusotswat", "residentevil");
      p3.cadastrarCivil("999.999.999-99", "Otávio X9", "Rua Confidencial", "Solteiro", "23/10/1995", "99999-9999", 20020, "Sob Proteção", false);
      p4.editarSuspeito("999.999.999-99", "Otávio from Darkness", "Rua da Maldade", "Solteiro", "23/10/1995", "99999-9999", 30099, "Sob Pena de Morte", true, "Matou o Mar Morto", "Bloco 9999 - Cela 99");
      c1.registrarOcorrencia(4001, "Urgente", "Acabou o Molho Szechuan", "05/05/2019", "21:09");
      c2.adicionarCaso(4002, "Alta", "Spoilaram Vingadores 4", "05/05/2019", "21:10", 5001, "Pendente");
      v1.cadastrarVeiculo("MAN-9999", "Dragão Voador de Aço", 2170, "Em uso");
      
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);
      System.out.println(p4);
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(v1);
    }
    
}
