/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.BlocoM;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.BlocoMEnum;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoM {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoM blocoM = efdContribuicoes.getBlocoM();
		sb = sbr;

		// REGISTROM001
		if (!Util.isEmpty(blocoM.getRegistroM001())) {
			sb = GerarRegistroM001.gerar(blocoM.getRegistroM001(), sb);
			efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM001);
		}

		// REGISTROM100
		if (!Util.isEmpty(blocoM.getRegistroM100())) {
			blocoM.getRegistroM100().stream().forEach(registroM100 -> {
				sb = GerarRegistroM100.gerar(registroM100, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM100);

				// REGISTROM105
				if (!Util.isEmpty(registroM100.getRegistroM105())) {
					registroM100.getRegistroM105().stream().forEach(registroM105 -> {
						sb = GerarRegistroM105.gerar(registroM105, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM105);
					});
				}

				// REGISTROM110
				if (!Util.isEmpty(registroM100.getRegistroM110())) {
					registroM100.getRegistroM110().stream().forEach(registroM110 -> {
						sb = GerarRegistroM110.gerar(registroM110, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM110);

						// REGISTROM115
						if (!Util.isEmpty(registroM110.getRegistroM115())) {
							registroM110.getRegistroM115().stream().forEach(registroM115 -> {
								sb = GerarRegistroM115.gerar(registroM115, sb);
								efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM115);
							});
						}
					});
				}
			});
		}

		// REGISTROM200
		if (!Util.isEmpty(blocoM.getRegistroM200())) {
			sb = GerarRegistroM200.gerar(blocoM.getRegistroM200(), sb);
			efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM200);

			// REGISTROM205
			if (!Util.isEmpty(blocoM.getRegistroM200().getRegistroM205())) {
				blocoM.getRegistroM200().getRegistroM205().stream().forEach(registroM205 -> {
					sb = GerarRegistroM205.gerar(registroM205, sb);
					efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM205);
				});
			}

			// REGISTROM210
			if (!Util.isEmpty(blocoM.getRegistroM200().getRegistroM210())) {
				blocoM.getRegistroM200().getRegistroM210().stream().forEach(registroM210 -> {
					sb = GerarRegistroM210.gerar(registroM210, sb);
					efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM210);

					// REGISTROM211
					if (!Util.isEmpty(registroM210.getRegistroM211())) {
						sb = GerarRegistroM211.gerar(registroM210.getRegistroM211(), sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM211);
					}

					// REGISTROM220
					if (!Util.isEmpty(registroM210.getRegistroM220())) {
						registroM210.getRegistroM220().stream().forEach(registroM220 -> {
							sb = GerarRegistroM220.gerar(registroM220, sb);
							efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM220);

							// REGISTROM225
							if (!Util.isEmpty(registroM220.getRegistroM225())) {
								registroM220.getRegistroM225().stream().forEach(registroM225 -> {
									sb = GerarRegistroM225.gerar(registroM225, sb);
									efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM225);
								});
							}
						});
					}
					
					// REGISTROM230
					if (!Util.isEmpty(registroM210.getRegistroM230())) {
						registroM210.getRegistroM230().stream().forEach(registroM230 -> {
							sb = GerarRegistroM230.gerar(registroM230, sb);
							efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM230);
						});
					}
				});
			}
		}
	}
}
