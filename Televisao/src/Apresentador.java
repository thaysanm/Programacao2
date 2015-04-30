
public class Apresentador {

    String nomeapre, dtnascimentoapre, programa, emailapre, nomeartisticoapre,
            cidadeapre, enderecoapre,
            bairroapre, estadoapre;

    double cacheeventoapre, salmensalapre, valormerch;

    public String getNomeapre() {
        return nomeapre;
    }

    public void setNomeapre(String nomeapre) {
        this.nomeapre = nomeapre;
    }

    public String getDtnascimentoapre() {
        return dtnascimentoapre;
    }

    public void setDtnascimentoapre(String dtnascimentoapre) {
        this.dtnascimentoapre = dtnascimentoapre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEmailapre() {
        return emailapre;
    }

    public void setEmailapre(String emailapre) {
        this.emailapre = emailapre;
    }

    public String getNomeartisticoapre() {
        return nomeartisticoapre;
    }

    public void setNomeartisticoapre(String nomeartisticoapre) {
        this.nomeartisticoapre = nomeartisticoapre;
    }

    public Double getSalmensalapre() {
        return salmensalapre;
    }

    public void setSalmensalapre(Double salmensalapre) {
        this.salmensalapre = salmensalapre;
    }

    public Double getCacheeventoapre() {
        return cacheeventoapre;
    }

    public void setCacheeventoapre(Double cacheeventoapre) {
        this.cacheeventoapre = cacheeventoapre;
    }

    public Double getValormerch() {
        return valormerch;
    }

    public void setValormerch(Double valormerch) {
        this.valormerch = valormerch;
    }

    public String getCidadeapre() {
        return cidadeapre;
    }

    public void setCidadeapre(String cidadeapre) {
        this.cidadeapre = cidadeapre;
    }

    public String getEnderecoapre() {
        return enderecoapre;
    }

    public void setEnderecoapre(String enderecoapre) {
        this.enderecoapre = enderecoapre;
    }

    public String getBairroapre() {
        return bairroapre;
    }

    public void setBairroapre(String bairroapre) {
        this.bairroapre = bairroapre;
    }

    public String getEstadoapre() {
        return estadoapre;
    }

    public void setEstadoapre(String estadoapre) {
        this.estadoapre = estadoapre;
    }

    public Double calcularGanhosApre() {
        Integer neventosapre = 3;
        Double ganhosapre;
        ganhosapre = (neventosapre * cacheeventoapre) + salmensalapre + valormerch;
        return ganhosapre;
    }

    public Apresentador() {
        salmensalapre = 0.0;
        valormerch = 0.0;
        nomeapre = null;
        dtnascimentoapre = null;
        programa = null;
        emailapre = null;
        nomeartisticoapre = null;
        cidadeapre = null;
        enderecoapre = null;
        bairroapre = null;
        estadoapre = null;
    }
}