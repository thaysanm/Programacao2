
public class Ator {

    String nomeator, dtnascimentoator, emailator, nomeartisticoator, cidadeator,
            enderecoator, bairroator, estadoator;
    Double qtnovelas, salmensalator, cacheeventoator;

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    public String getDtnascimentoator() {
        return dtnascimentoator;
    }

    public void setDtnascimentoator(String dtnascimentoator) {
        this.dtnascimentoator = dtnascimentoator;
    }

    public Double getQtnovelas() {
        return qtnovelas;
    }

    public void setQtnovelas(Double qtnovelas) {
        this.qtnovelas = qtnovelas;
    }

    public String getEmailator() {
        return emailator;
    }

    public void setEmailator(String emailator) {
        this.emailator = emailator;
    }

    public String getNomeartisticoator() {
        return nomeartisticoator;
    }

    public void setNomeartisticoator(String nomeartisticoator) {
        this.nomeartisticoator = nomeartisticoator;
    }

    public Double getSalmensalator() {
        return salmensalator;
    }

    public void setSalmensalator(Double salmensalator) {
        this.salmensalator = salmensalator;
    }

    public Double getCacheeventoator() {
        return cacheeventoator;
    }

    public void setCacheeventoator(Double cacheeventoator) {
        this.cacheeventoator = cacheeventoator;
    }

    public String getCidadeator() {
        return cidadeator;
    }

    public void setCidadeator(String cidadeator) {
        this.cidadeator = cidadeator;
    }

    public String getEnderecoator() {
        return enderecoator;
    }

    public void setEnderecoator(String enderecoator) {
        this.enderecoator = enderecoator;
    }

    public String getBairroator() {
        return bairroator;
    }

    public void setBairroator(String bairroator) {
        this.bairroator = bairroator;
    }

    public String getEstadoator() {
        return estadoator;
    }

    public void setEstadoator(String estadoator) {
        this.estadoator = estadoator;
    }

    public String obterStatus() {
        String status;
        if (qtnovelas <= 3 && salmensalator < 5000) {
            status = "Calouro";
        } else if (qtnovelas >= 6 && salmensalator >= 5000 && salmensalator <= 30000) {
            status = "Revelação";
        } else if (qtnovelas >= 6 && salmensalator > 30000) {
            status = "Jóia";
        } else if (qtnovelas > 9 && salmensalator <= 30000) {
            status = "Elenco de Apoio";
        } else if (salmensalator >= 30000 && salmensalator <= 100000) {
            status = "Elenco Principal";
        } else if (salmensalator > 100000) {
            status = "Estrela";
        } else {
            status = "Elenco Regular";
        }
        return status;
    }

    public Double calcularGanhos(Integer neventos) {
        Double ganhos;
        neventos = 3;
        ganhos = (cacheeventoator * neventos) + salmensalator;
        return ganhos;
    }

}