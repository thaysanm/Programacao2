
public class Novela {

    String titulo, dtinicioefim, horarioex, autor, emissora;
    boolean cenasviolencia, cenassexo, cenasdrogas;
    double audiencia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDtinicioefim() {
        return dtinicioefim;
    }

    public void setDtinicioefim(String dtinicioefim) {
        this.dtinicioefim = dtinicioefim;
    }

    public String getHorarioex() {
        return horarioex;
    }

    public void setHorarioex(String horarioex) {
        this.horarioex = horarioex;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public Double getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Double audiencia) {
        this.audiencia = audiencia;
    }

    public boolean isCenasviolencia() {
        return cenasviolencia;
    }

    public void setCenasviolencia(boolean cenasviolencia) {
        this.cenasviolencia = cenasviolencia;
    }

    public boolean isCenassexo() {
        return cenassexo;
    }

    public void setCenassexo(boolean cenassexo) {
        this.cenassexo = cenassexo;
    }

    public boolean isCenasdrogas() {
        return cenasdrogas;
    }

    public void setCenasdrogas(boolean cenasdrogas) {
        this.cenasdrogas = cenasdrogas;
    }

    public Integer obterClassificacao() {
        int clas = 0;
        if (cenasviolencia == false && cenasdrogas == false && cenassexo == false) {
            clas = 0;
        } else if (cenasviolencia == true && cenasdrogas == false && cenassexo == false) {
            clas = 14;
        } else if (cenasviolencia == true && cenasdrogas == true) {
            clas = 16;
        } else if (cenasviolencia == true && cenasdrogas == true && cenassexo == true) {
            clas = 18;
        }
        return clas;
    }

    public Double obterAudiencia() {
        double aud;
        aud = audiencia * 10.000;
        return aud;
    }

}