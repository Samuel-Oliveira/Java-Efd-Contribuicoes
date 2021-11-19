/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0900;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0900 {

    public static StringBuilder gerar(Registro0900 registro0900, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro0900.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_a()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_a()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_c()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_c()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_d()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_d()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_f()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_f()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_i()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_i()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_bloco_1()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_nrb_bloco_1()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_periodo()));
        sb.append("|").append(Util.preencheRegistro(registro0900.getRec_total_nrb_periodo()));
        sb.append("|").append('\n');

        return sb;
    }
}
