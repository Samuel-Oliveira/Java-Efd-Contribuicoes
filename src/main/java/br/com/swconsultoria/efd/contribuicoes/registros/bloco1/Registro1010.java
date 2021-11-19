/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class Registro1010 {

    private final String reg = "1010";
    private String num_proc;
    private String id_sec_jud;
    private String id_vara;
    private String ind_nat_acao;
    private String desc_dec_jud;
    private String dt_sent_jud;
    private List<Registro1011> registro1011;

    /**
     * @return the num_proc
     */
    public String getNum_proc() {
        return num_proc;
    }

    /**
     * @param num_proc
     *            the num_proc to set
     */
    public void setNum_proc(String num_proc) {
        this.num_proc = num_proc;
    }

    /**
     * @return the id_sec_jud
     */
    public String getId_sec_jud() {
        return id_sec_jud;
    }

    /**
     * @param id_sec_jud
     *            the id_sec_jud to set
     */
    public void setId_sec_jud(String id_sec_jud) {
        this.id_sec_jud = id_sec_jud;
    }

    /**
     * @return the id_vara
     */
    public String getId_vara() {
        return id_vara;
    }

    /**
     * @param id_vara
     *            the id_vara to set
     */
    public void setId_vara(String id_vara) {
        this.id_vara = id_vara;
    }

    /**
     * @return the ind_nat_acao
     */
    public String getInd_nat_acao() {
        return ind_nat_acao;
    }

    /**
     * @param ind_nat_acao
     *            the ind_nat_acao to set
     */
    public void setInd_nat_acao(String ind_nat_acao) {
        this.ind_nat_acao = ind_nat_acao;
    }

    /**
     * @return the desc_dec_jud
     */
    public String getDesc_dec_jud() {
        return desc_dec_jud;
    }

    /**
     * @param desc_dec_jud
     *            the desc_dec_jud to set
     */
    public void setDesc_dec_jud(String desc_dec_jud) {
        this.desc_dec_jud = desc_dec_jud;
    }

    /**
     * @return the dt_sent_jud
     */
    public String getDt_sent_jud() {
        return dt_sent_jud;
    }

    /**
     * @param dt_sent_jud
     *            the dt_sent_jud to set
     */
    public void setDt_sent_jud(String dt_sent_jud) {
        this.dt_sent_jud = dt_sent_jud;
    }

    /**
     * @return the reg
     */
    public String getReg() {
        return reg;
    }

    /**
     * @return the registro1200
     */
    public List<Registro1011> getRegistro1011() {
        if (registro1011 == null) {
            registro1011 = new ArrayList<Registro1011>();
        }
        return registro1011;
    }

}
