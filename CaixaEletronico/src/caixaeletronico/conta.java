package caixaeletronico;

public class conta {

    String agencia;
    String numeroConta;
    String nomeCorrentista;
    Float saldo;
    Boolean ativa;
    
    conta ()
    {
        this.agencia = null;
        this.numeroConta = null;
        this.nomeCorrentista = null;
        this.saldo = null;
        this.ativa = null;
    }

    void abrir(String nome, String ag, String numcont) {
        this.agencia = ag;
        numeroConta = numcont;
        nomeCorrentista = nome;
        saldo = 0.0f;
        ativa = true;
    }

    Boolean fecharconta() {
        Boolean retorno;
        if (saldo == 0.0) {
            ativa = false;
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    Boolean deposito(float val) {
        if (ativa == true) {
            saldo = saldo + val;
            return true;
        } else {
            return false;
        }
    }

    Boolean saque(float saq) {
        if (saldo >= saq & ativa){
        saldo = saldo - saq;
        return true;
    }
        else
        {
            return false;
}
}
 Float retornarSaldo ()
 {
     return saldo;
 }
}