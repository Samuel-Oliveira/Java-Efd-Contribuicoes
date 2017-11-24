package br.com.samuelweb.efd.contribuicoes.bo.blocoP;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.BlocoP;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.BlocoPEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * 
 * @author Yuri Lemes
 *
 */
public class GerarBlocoP {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoP blocoP = efdContribuicoes.getBlocoP();
		sb = sbr;

		// REGISTROP001
		if (!Util.isEmpty(blocoP.getRegistroP001())) {
			sb = GerarRegistroP001.gerar(blocoP.getRegistroP001(), sb);
			efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP001);
		}

		// REGISTROP010
		if (!Util.isEmpty(blocoP.getRegistroP010())) {
			blocoP.getRegistroP010().stream().forEach(registroP010 -> {
				sb = GerarRegistroP010.gerar(registroP010, sb);
				efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP010);

				// REGISTROP100
				if (!Util.isEmpty(registroP010.getRegistroP100())) {
					registroP010.getRegistroP100().stream().forEach(registroP100 -> {
						sb = GerarRegistroP100.gerar(registroP100, sb);
						efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP100);

						// REGISTROP110
						if (!Util.isEmpty(registroP100.getRegistroP110())) {
							registroP100.getRegistroP110().stream().forEach(registroP110 -> {
								sb = GerarRegistroP110.gerar(registroP110, sb);
								efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP110);
							});
						}

						// REGISTROP199
						if (!Util.isEmpty(registroP100.getRegistroP199())) {
							registroP100.getRegistroP199().stream().forEach(registroP199 -> {
								sb = GerarRegistroP199.gerar(registroP199, sb);
								efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP199);
							});
						}
					});
				}
			});
		}

		// REGISTROP200
		if (!Util.isEmpty(blocoP.getRegistroP200())) {
			blocoP.getRegistroP200().stream().forEach(registroP200 -> {
				sb = GerarRegistroP200.gerar(registroP200, sb);
				efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP200);

				// REGISTROP210
				if (!Util.isEmpty(registroP200.getRegistroP210())) {
					registroP200.getRegistroP210().stream().forEach(registroP210 -> {
						sb = GerarRegistroP210.gerar(registroP210, sb);
						efdContribuicoes.getContadoresBlocoP().incrementar(BlocoPEnum.RegistroP210);
					});
				}

			});
		}

		// REGISTROP990
		if (efdContribuicoes.getContadoresBlocoP().getContRegistroP990() > 0) {
			RegistroP990 registroP990 = new RegistroP990();
			registroP990.setQtd_lin_p(String.valueOf(efdContribuicoes.getContadoresBlocoP().getContRegistroP990() + 1));

			blocoP.setRegistroP990(registroP990);
			sb = GerarRegistroP990.gerar(blocoP.getRegistroP990(), sb);
		}

		return sb;
	}
}
