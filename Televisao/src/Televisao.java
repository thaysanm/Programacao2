import javax.swing.JOptionPane;
public class Televisao {

    public static void main(String[] args) {
        Ator at = new Ator();

        Integer neventos;

        at.nomeator = JOptionPane.showInputDialog("Informações do Ator\nNome: ");
        at.dtnascimentoator = JOptionPane.showInputDialog("Data de nascimento: ");
        at.emailator = JOptionPane.showInputDialog("E-mail: ");
        at.nomeartisticoator = JOptionPane.showInputDialog("Nome artístico: ");
        at.cidadeator = JOptionPane.showInputDialog("Cidade: ");
        at.enderecoator = JOptionPane.showInputDialog("Endereço: ");
        at.bairroator = JOptionPane.showInputDialog("Bairro: ");
        at.estadoator = JOptionPane.showInputDialog("Estado: ");
        at.qtnovelas = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de novelas já feitas: "));
        at.salmensalator = Double.parseDouble(JOptionPane.showInputDialog("Salário mensal: "));
        at.cacheeventoator = Double.parseDouble(JOptionPane.showInputDialog("Cachê por evento: "));
        neventos = Integer.parseInt(JOptionPane.showInputDialog("Quantos eventos você participou nesse mês? "));

        JOptionPane.showMessageDialog(null, "Informações ATOR\nNome artístico: " + at.nomeartisticoator
                + "\nData de nascimento: " + at.dtnascimentoator + "\n" + "E-mail: " + at.emailator
                + "\nQuantidade de novelas: " + at.qtnovelas + "\nStatus: " + at.obterStatus()
                + "\nGanhos Mensais: R$" + at.calcularGanhos(neventos));

        Emissora e = new Emissora();

        e.nomeemissora = "GLOBO";
        e.tvabertaoufechada = true;

        JOptionPane.showMessageDialog(null, "Informações EMISSORA\nEmissora: " + e.nomeemissora
                + "\nAberta ou Fechada: " + e.tvabertaoufechada);

        Novela n = new Novela();

        n.titulo = "IMPERIO";
        n.dtinicioefim = "10/06/2014 à 25/08/2015";
        n.horarioex = "21:00 hrs";
        n.autor = "JOAO MANOEL CARNEIRO";
        n.emissora = "GLOBO";
        n.cenasviolencia = false;
        n.cenasdrogas = false;
        n.cenassexo = false;
        n.audiencia = 150000;

        JOptionPane.showMessageDialog(null, "Informações NOVELA\nTítulo: " + n.titulo + "\nData de ínicio e fim: "
                + n.dtinicioefim + "\n" + "Horário de exibição: " + n.horarioex + "\nAutor: " + n.autor
                + "\nEmissora: " + n.emissora + "\nPossui cenas de:\nViolência: " + n.cenasviolencia
                + "\nDrogas: " + n.cenasdrogas + "\nSexo: " + n.cenassexo + "\nAudiência: " + n.obterAudiencia()
                + " pessoa(s)" + "\nEssa " + "novela é indicada para " + n.obterClassificacao() + " anos.\nOBS: "
                + "0 anos = Livre.");

        Apresentador a = new Apresentador();

        a.nomeapre = "Luciano";
        a.dtnascimentoapre = "15/03/1989";
        a.programa = "Caldeirão do Huck";
        a.emailapre = "luciano.h@hotmail.com";
        a.nomeartisticoapre = "Luciano Huck";
        a.cidadeapre = "São Paulo";
        a.enderecoapre = "Rua do Luciano";
        a.bairroapre = "Bairro do Luciano";
        a.estadoapre = "SP";
        a.cacheeventoapre = 35000;
        a.salmensalapre = 15000;
        a.valormerch = 2000;

        JOptionPane.showMessageDialog(null, "Informações APRESENTADOR\nNome: " + a.nomeapre + "\nData de nascimento: "
                + a.dtnascimentoapre + "\n" + "Programa: " + a.programa + "\nE-mail: " + a.emailapre
                + "\nNome artístico do apresentador: " + a.nomeartisticoapre + "\n" + "Cidade: " + a.cidadeapre
                + "\nEndereço: " + a.enderecoapre + "\nBairro: " + a.bairroapre + "\nEstado: " + a.estadoapre
                + "\nGanhos mensais: R$" + a.calcularGanhosApre());
    }
}