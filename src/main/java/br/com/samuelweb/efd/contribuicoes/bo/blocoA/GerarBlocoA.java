/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoA;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoA.BlocoA;
import br.com.samuelweb.efd.contribuicoes.registros.blocoA.BlocoAEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoA.RegistroA990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoA {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoA blocoA = efdContribuicoes.getBlocoA();

		sb = sbr;

		// REGISTROA001
		if (!Util.isEmpty(blocoA.getRegistroA001())) {
			GerarRegistroA001.gerar(blocoA.getRegistroA001(), sb);
			efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA001);
		}

		// REGISTROA010
		if (!Util.isEmpty(blocoA.getRegistroA010())) {
			blocoA.getRegistroA010().forEach(registroA010 -> {
				GerarRegistroA010.gerar(registroA010, sb);
				efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA010);

				// REGISTROA100
				if (!Util.isEmpty(registroA010.getRegistroA100())) {
					registroA010.getRegistroA100().forEach(registroA100 -> {
						GerarRegistroA100.gerar(registroA100, sb);
						efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA100);

						// REGISTROA110
						if (!Util.isEmpty(registroA100.getRegistroA110())) {
							registroA100.getRegistroA110().forEach(registroA110 -> {
								GerarRegistroA110.gerar(registroA110, sb);
								efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA110);
							});
						}

						// REGISTROA111
						if (!Util.isEmpty(registroA100.getRegistroA111())) {
							registroA100.getRegistroA111().forEach(registroA111 -> {
								GerarRegistroA111.gerar(registroA111, sb);
								efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA111);
							});
						}

						// REGISTROA120
						if (!Util.isEmpty(registroA100.getRegistroA120())) {
							registroA100.getRegistroA120().forEach(registroA120 -> {
								GerarRegistroA120.gerar(registroA120, sb);
								efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA120);
							});
						}

						// REGISTROA170
						if (!Util.isEmpty(registroA100.getRegistroA170())) {
							registroA100.getRegistroA170().forEach(registroA170 -> {
								GerarRegistroA170.gerar(registroA170, sb);
								efdContribuicoes.getContadoresBlocoA().incrementar(BlocoAEnum.RegistroA170);
							});
						}
					});
				}
			});
		}

		// REGISTROA990
		if (efdContribuicoes.getContadoresBlocoA().getContRegistroA990() > 0) {
			RegistroA990 registroA990 = new RegistroA990();
			registroA990.setQtd_lin_a(String.valueOf(efdContribuicoes.getContadoresBlocoA().getContRegistroA990() + 1));

			blocoA.setRegistroA990(registroA990);
			GerarRegistroA990.gerar(blocoA.getRegistroA990(), sb);
		}

		return sb;
	}
}
