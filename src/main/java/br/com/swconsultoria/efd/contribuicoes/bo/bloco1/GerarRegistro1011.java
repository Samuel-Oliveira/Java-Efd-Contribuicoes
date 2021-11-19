/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1011;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1011 {

    public static StringBuilder gerar(Registro1011 registro1011, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registro1011.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getReg_ref()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getChave_doc()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCod_part()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCod_item()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getDt_oper()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_oper()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCst_pis()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_bc_pis()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getAliq_pis()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_pis()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCst_cofins()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_bc_cofins()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getAliq_cofins()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_cofins()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCst_pis_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_bc_pis_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getAliq_pis_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_pis_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCst_cofins_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_bc_cofins_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getAliq_cofins_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getVl_cofins_susp()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCod_cta()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getCod_ccus()));
        sb.append("|").append(Util.preencheRegistro(registro1011.getDesc_doc_oper()));
        sb.append("|").append('\n');

        return sb;
    }
}
