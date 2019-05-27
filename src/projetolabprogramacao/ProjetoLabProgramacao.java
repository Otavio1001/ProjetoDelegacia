package projetolabprogramacao;

public class ProjetoLabProgramacao {
    public static void main(String[] args) {
      Policial p2 = new Policial();
      Civil p3 = new Civil();
      Suspeito p4 = new Suspeito();
      Veiculo v1 = new Veiculo();
      Ocorrencia c1 = new Ocorrencia();
      Caso c2 = new Caso();
      
      p2.novoPolicial("999.999.999-99", "Otávio da Justiça", "23/10/1995", "Branco", 'M', "O-", "Solteiro", "Rua da Justiça nº Intrépido", "99999-9999",
              1001, 5000.00, "Capitão", "SWAT", "Formou a Escola", "Todaspossiveis", "jusotswat", "residentevil");
      p3.novoCivil("999.999.999-99", "Otávio X9", "23/10/1995", "Branco", 'M', "O-", "Solteiro", "Rua Confidencial",  "99999-9999",
              20020, "Sob Proteção", false);
      p4.novoSuspeito("999.999.999-99", "Otávio from Darkness", "23/10/1995", "Branco", 'M', "O-", "Solteiro", "Rua da Maldade", "99999-9999",
              30099, "Sob Pena de Morte", true, "Matou o Mar Morto", "Bloco 9999 - Cela 99");
      c1.registrarOcorrencia(4001, "Urgente", "Acabou o Molho Szechuan", "05/05/2019", "21:09");
      c2.adicionarCaso(4002, "Alta", "Spoilaram Vingadores 4", "05/05/2019", "21:10", 5001, "Pendente");
      v1.novoVeiculo(99001, "MAN-9999", "Dragão Voador de Aço", 2170, 1, "Em uso");
      
      p2.mostrarPolicial();
      p3.mostrarCivil();
      p4.mostrarSuspeito();
      v1.mostrarVeiculo();
    }
    
}
