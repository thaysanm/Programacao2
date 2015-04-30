package cassino;

public class Conta {

    String nome;
    String login;
    String senha;
    Double gold;
    Double cash;
    Boolean jogando;
    String roupa;
    String sapato;
    String acessorio;

    public Conta() {

        nome = null;
        login = null;
        senha = null;
        gold = 0.0;
        cash = 0.0;
        jogando = false;
        roupa = null;
        sapato = null;
        acessorio = null;
    }

    Boolean realizarCadastro(String vnome, String vlogin, String vsenha, String vconfirma) {
        Boolean deucerto;
        if (vsenha.equals(vconfirma)) {
            nome = vnome;
            login = vlogin;
            senha = vsenha;
            gold = 50.0;
            cash = 0.0;
            jogando = false;
            roupa = "Calça e camisa";
            sapato = "Chinelo rider";
            acessorio = "Relógio do camelô";

            deucerto = true;
        } else {
            deucerto = false;
        }
        return deucerto;
    }

    Boolean abrir(String vlogin, String vsenha) {
        Boolean deucerto;
        if (vlogin.equals(login) && vsenha.equals(senha)) {
            jogando = true;
            deucerto = true;
        } else {
            jogando = false;
            deucerto = false;
        }
        return jogando;
    }

    Boolean inserirCash(String numCartao, double insValor) {

        if (jogando == true) {
            if (numCartao.length() == 16) {
                if (insValor <= 10.0) {
                    cash = insValor * 1;
                } else if (insValor >= 11.0 && insValor <= 50.00) {
                    cash = insValor * 2;
                }
            } else {
                cash = insValor * 3;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    Boolean compraRopa(String iten) {
        if (iten == "1") {
            if (cash >= 40) {
                cash = cash - 40;
                return true;
            } else {
                return false;
            }
        } else if (iten == "2") {
            if (cash >= 45) {
                cash = cash - 45;
                return true;
            } else {
                return false;
            }
        }
        if (iten == "3") {
            if (cash >= 35) {
                cash = cash - 35;
                return true;
            } else {
                return false;
            }
        }
        if (iten == "4") {
            if (cash >= 35) {
                cash = cash - 35;
                return true;
            } else {
                return false;
            }
        }

    }
}

    
