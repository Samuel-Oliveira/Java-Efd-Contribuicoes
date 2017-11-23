/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.BlocoF;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.BlocoFEnum;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoF {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoF blocoF = efdContribuicoes.getBlocoF();
		sb = sbr;

		// REGISTROF001
		if (!Util.isEmpty(blocoF.getRegistroF001())) {
			sb = GerarRegistroF001.gerar(blocoF.getRegistroF001(), sb);
			efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF001);
		}

		// REGISTROF010
		if (!Util.isEmpty(blocoF.getRegistroF010())) {
			blocoF.getRegistroF010().stream().forEach(registroF010 -> {
				sb = GerarRegistroF010.gerar(registroF010, sb);
				efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF010);

				// REGISTROF100
				if (!Util.isEmpty(registroF010.getRegistroF100())) {
					registroF010.getRegistroF100().stream().forEach(registroF100 -> {
						sb = GerarRegistroF100.gerar(registroF100, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF100);

						// REGISTROF111
						if (!Util.isEmpty(registroF100.getRegistroF111())) {
							registroF100.getRegistroF111().stream().forEach(registroF111 -> {
								sb = GerarRegistroF111.gerar(registroF111, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF111);
							});
						}
					});
				}

				// REGISTROF120
				if (!Util.isEmpty(registroF010.getRegistroF120())) {
					registroF010.getRegistroF120().stream().forEach(registroF120 -> {
						sb = GerarRegistroF120.gerar(registroF120, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF120);

						// REGISTROF129
						if (!Util.isEmpty(registroF120.getRegistroF129())) {
							registroF120.getRegistroF129().stream().forEach(registroF129 -> {
								sb = GerarRegistroF129.gerar(registroF129, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF129);
							});
						}
					});
				}

				// REGISTROF130
				if (!Util.isEmpty(registroF010.getRegistroF130())) {
					registroF010.getRegistroF130().stream().forEach(registroF130 -> {
						sb = GerarRegistroF130.gerar(registroF130, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF130);

						// REGISTROF139
						if (!Util.isEmpty(registroF130.getRegistroF139())) {
							registroF130.getRegistroF139().stream().forEach(registroF139 -> {
								sb = GerarRegistroF139.gerar(registroF139, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF139);
							});
						}
					});
				}

				// REGISTROF150
				if (!Util.isEmpty(registroF010.getRegistroF150())) {
					registroF010.getRegistroF150().stream().forEach(registroF150 -> {
						sb = GerarRegistroF150.gerar(registroF150, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF150);
					});
				}

				// REGISTROF200
				if (!Util.isEmpty(registroF010.getRegistroF200())) {
					registroF010.getRegistroF200().stream().forEach(registroF200 -> {
						sb = GerarRegistroF200.gerar(registroF200, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF200);

						// REGISTROF205
						if (!Util.isEmpty(registroF200.getRegistroF205())) {
							sb = GerarRegistroF205.gerar(registroF200.getRegistroF205(), sb);
							efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF205);
						}

						// REGISTROF210
						if (!Util.isEmpty(registroF200.getRegistroF210())) {
							registroF200.getRegistroF210().stream().forEach(registroF210 -> {
								sb = GerarRegistroF210.gerar(registroF210, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF210);
							});
						}
						
						// REGISTROF211
						if (!Util.isEmpty(registroF200.getRegistroF211())) {
							registroF200.getRegistroF211().stream().forEach(registroF211 -> {
								sb = GerarRegistroF211.gerar(registroF211, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF211);
							});
						}
					});
				}
			});
		}
	}
}
