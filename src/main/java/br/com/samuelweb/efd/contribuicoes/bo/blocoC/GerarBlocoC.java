/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.BlocoCEnum;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoC blocoC = efdContribuicoes.getBlocoC();

		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			sb = GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC010
		if (!Util.isEmpty(blocoC.getRegistroC010())) {
			blocoC.getRegistroC010().stream().forEach(registroC010 -> {
				sb = GerarRegistroC010.gerar(registroC010, sb);
				efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC010);

				// REGISTROC100
				if (!Util.isEmpty(registroC010.getRegistroC100())) {
					registroC010.getRegistroC100().stream().forEach(registroC100 -> {
						sb = GerarRegistroC100.gerar(registroC100, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC100);

						// REGISTROC110
						if (!Util.isEmpty(registroC100.getRegistroC110())) {
							registroC100.getRegistroC110().stream().forEach(registroC110 -> {
								sb = GerarRegistroC110.gerar(registroC110, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC110);

							});
						}

						// REGISTROC111
						if (!Util.isEmpty(registroC100.getRegistroC111())) {
							registroC100.getRegistroC111().stream().forEach(registroC111 -> {
								sb = GerarRegistroC111.gerar(registroC111, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC111);
							});
						}

						// REGISTROC120
						if (!Util.isEmpty(registroC100.getRegistroC120())) {
							registroC100.getRegistroC120().stream().forEach(registroC120 -> {
								sb = GerarRegistroC120.gerar(registroC120, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC120);
							});
						}

						// REGISTROC170
						if (!Util.isEmpty(registroC100.getRegistroC170())) {
							registroC100.getRegistroC170().stream().forEach(registroC170 -> {
								sb = GerarRegistroC170.gerar(registroC170, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC170);
							});
						}

						// REGISTROC175
						if (!Util.isEmpty(registroC100.getRegistroC175())) {
							registroC100.getRegistroC175().stream().forEach(registroC175 -> {
								sb = GerarRegistroC175.gerar(registroC175, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC175);
							});
						}
					});
				}

				// REGISTROC180
				if (!Util.isEmpty(registroC010.getRegistroC180())) {
					registroC010.getRegistroC180().stream().forEach(registroC180 -> {
						sb = GerarRegistroC180.gerar(registroC180, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC180);

						// REGISTROC181
						if (!Util.isEmpty(registroC180.getRegistroC181())) {
							registroC180.getRegistroC181().stream().forEach(registroC181 -> {
								sb = GerarRegistroC181.gerar(registroC181, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC181);
							});
						}

						// REGISTROC185
						if (!Util.isEmpty(registroC180.getRegistroC185())) {
							registroC180.getRegistroC185().stream().forEach(registroC185 -> {
								sb = GerarRegistroC185.gerar(registroC185, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC185);
							});
						}

						// REGISTROC188
						if (!Util.isEmpty(registroC180.getRegistroC188())) {
							registroC180.getRegistroC188().stream().forEach(registroC188 -> {
								sb = GerarRegistroC188.gerar(registroC188, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC188);
							});
						}
					});
				}
			});

		}
	}
}
