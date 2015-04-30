package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
Banco b = new Banco();
        Integer op = -1;
        conta c = new conta();
      while (op != 7) {
        op = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n1. Abrir conta "
                + "\n2. Consultar saldo "
                + "\n3. Depositar "
                + "\n4. Sacar "
                + "\n5. Consultar saldo final"
                + "\n6. Virificar qual banco é"
                + "\n7. Resumo"
                + "\n8. Fechar conta."));

        switch (op) {
            case 1:{ //dados //abir conta
                String nome, agencia, numero;
                nome = JOptionPane.showInputDialog("Correntista: ");
                agencia = JOptionPane.showInputDialog("Agencia: ");
                numero = JOptionPane.showInputDialog("Numero");
                c.abrir(nome, agencia, numero);
                JOptionPane.showMessageDialog(null, "A conta foi aberta");
                 
                    break;
                }
            case 2: {//saldo
                JOptionPane.showMessageDialog(null, "Seu saldo é de:" + c.retornarSaldo());

                break;
            }
            case 3: {//deposito
                float vl = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
                boolean deucerto = c.deposito(vl);
                if (deucerto == true) {
                    JOptionPane.showMessageDialog(null, "Ok ");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel depositar. ");
                }
                break;
            }
            case 4: {//saque
                float sq = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
                boolean certo = c.saque(sq);
                if (certo == true) {
                    JOptionPane.showMessageDialog(null, "Ok ");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel fazer o saque.");
                }
                break;
            }
            case 5: {//saldo
                JOptionPane.showMessageDialog(null, "Seu saldo final é de:" + c.retornarSaldo());
                break;
            }
            case 6: { //banco
                String pc = "-1";
                
                pc = JOptionPane.showInputDialog("1. 001 "
                        + "\n2. 047 "
                        + "\n3. 037 "
                        + "\n4. 041 "
                        + "\n5. 004 ");
                b.buscarBanco(pc);
                JOptionPane.showMessageDialog(null, "O seu banco é " + b.nomeBanc);

                break;
            }
            case 7:{//resumo
                            JOptionPane.showMessageDialog(null, "Nome do correntista: " + c.nomeCorrentista + "\nAgencia: " + c.agencia 
                                    + "\nNumero da conta: " + c.numeroConta + "\n Banco: " + b.nomeBanc);
               break; 
            }
            case 8: {//fechar conta
                c.fecharconta();

                JOptionPane.showMessageDialog(null, "A conta foi fechada");
                break;
            }
            default: {

            }
        }
    }
}
}