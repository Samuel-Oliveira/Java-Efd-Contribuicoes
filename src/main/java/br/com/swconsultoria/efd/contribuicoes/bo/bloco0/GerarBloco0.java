/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Bloco0;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Bloco0Enum;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBloco0 {

    private static StringBuilder sb = null;

    public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {

        Bloco0 bloco0 = efdContribuicoes.getBloco0();

        sb = sbr;

        // REGISTRO0000
        if (!Util.isEmpty(bloco0.getRegistro0000())) {
            GerarRegistro0000.gerar(efdContribuicoes, bloco0.getRegistro0000(), sb);
            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0000);
        }

        // REGISTRO0001
        if (!Util.isEmpty(bloco0.getRegistro0001())) {
            GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0001);
        }

        // REGISTRO0035
        if (!Util.isEmpty(bloco0.getRegistro0035())) {
            bloco0.getRegistro0035().forEach(registro0035 -> {
                GerarRegistro0035.gerar(registro0035, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0035);
            });
        }

        // REGISTRO0100
        if (!Util.isEmpty(bloco0.getRegistro0100())) {
            bloco0.getRegistro0100().forEach(registro0100 -> {
                GerarRegistro0100.gerar(registro0100, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0100);
            });
        }

        // REGISTRO0110
        if (!Util.isEmpty(bloco0.getRegistro0110())) {
            GerarRegistro0110.gerar(bloco0.getRegistro0110(), sb);
            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0110);

            // REGISTRO0111
            if (!Util.isEmpty(bloco0.getRegistro0110().getRegistro0111())) {
                GerarRegistro0111.gerar(bloco0.getRegistro0110().getRegistro0111(), sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0111);
            }
        }

        // REGISTRO0120
        if (!Util.isEmpty(bloco0.getRegistro0120())) {
            bloco0.getRegistro0120().forEach(registro0120 -> {
                GerarRegistro0120.gerar(registro0120, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0120);
            });
        }

        // REGISTRO0140
        if (!Util.isEmpty(bloco0.getRegistro0140())) {
            bloco0.getRegistro0140().forEach(registro0140 -> {
                GerarRegistro0140.gerar(registro0140, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0140);

                // REGISTRO0145
                if (!Util.isEmpty(registro0140.getRegistro0145())) {
                    GerarRegistro0145.gerar(registro0140.getRegistro0145(), sb);
                    efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0145);
                }

                // REGISTRO0150
                if (!Util.isEmpty(registro0140.getRegistro0150())) {
                    registro0140.getRegistro0150().forEach(registro0150 -> {
                        GerarRegistro0150.gerar(registro0150, sb);
                        efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0150);
                    });
                }

                // REGISTRO0190
                if (!Util.isEmpty(registro0140.getRegistro0190())) {
                    registro0140.getRegistro0190().forEach(registro0190 -> {
                        GerarRegistro0190.gerar(registro0190, sb);
                        efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0190);
                    });
                }

                // REGISTRO0200
                if (!Util.isEmpty(registro0140.getRegistro0200())) {
                    registro0140.getRegistro0200().forEach(registro0200 -> {
                        GerarRegistro0200.gerar(registro0200, sb);
                        efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0200);

                        // REGISTRO0205
                        if (!Util.isEmpty(registro0200.getRegistro0205())) {
                            registro0200.getRegistro0205().forEach(registro0205 -> {
                                GerarRegistro0205.gerar(registro0205, sb);
                                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0205);
                            });
                        }

                        // REGISTRO0206
                        if (!Util.isEmpty(registro0200.getRegistro0206())) {
                            GerarRegistro0206.gerar(registro0200.getRegistro0206(), sb);
                            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0206);
                        }

                        // REGISTRO0208
                        if (!Util.isEmpty(registro0200.getRegistro0208())) {
                            GerarRegistro0208.gerar(registro0200.getRegistro0208(), sb);
                            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0208);
                        }
                    });
                }

                // REGISTRO0400
                if (!Util.isEmpty(registro0140.getRegistro0400())) {
                    registro0140.getRegistro0400().forEach(registro0400 -> {
                        GerarRegistro0400.gerar(registro0400, sb);
                        efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0400);
                    });
                }

                // REGISTRO0450
                if (!Util.isEmpty(registro0140.getRegistro0450())) {
                    registro0140.getRegistro0450().forEach(registro0450 -> {
                        GerarRegistro0450.gerar(registro0450, sb);
                        efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0450);
                    });
                }

            });
        }

        // REGISTRO0500
        if (!Util.isEmpty(bloco0.getRegistro0500())) {
            bloco0.getRegistro0500().forEach(registro0500 -> {
                GerarRegistro0500.gerar(registro0500, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0500);
            });
        }

        // REGISTRO0600
        if (!Util.isEmpty(bloco0.getRegistro0600())) {
            bloco0.getRegistro0600().forEach(registro0600 -> {
                GerarRegistro0600.gerar(registro0600, sb);
                efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0600);
            });
        }

        // REGISTRO0900
        if (!Util.isEmpty(bloco0.getRegistro0900())) {
            GerarRegistro0900.gerar(bloco0.getRegistro0900(), sb);
            efdContribuicoes.getContadoresBloco0().incrementar(Bloco0Enum.Registro0900);
        }

        // REGISTRO0990
        if (efdContribuicoes.getContadoresBloco0().getContRegistro0990() > 0) {
            Registro0990 registro0990 = new Registro0990();
            registro0990.setQtd_lin_0(String.valueOf(efdContribuicoes.getContadoresBloco0().getContRegistro0990() + 1));

            bloco0.setRegistro0990(registro0990);
            GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
        }

        return sb;
    }
}
