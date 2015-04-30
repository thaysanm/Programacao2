public class Emissora {
   
    String nomeemissora, endereco;
    boolean tvabertaoufechada;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeemissora() {
        return nomeemissora;
    }

    public void setNomeemissora(String nomeemissora) {
        this.nomeemissora = nomeemissora;
    }

    public Boolean getTvabertaoufechada() {
        return tvabertaoufechada;
    }

    public void setTvabertaoufechada(Boolean tvabertaoufechada) {
        this.tvabertaoufechada = tvabertaoufechada;
    }

    public Emissora() {
        nomeemissora = null;
        tvabertaoufechada = false;
    }

}