/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.BlocoI;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.BlocoIEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoI {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoI blocoI = efdContribuicoes.getBlocoI();
		sb = sbr;

		// REGISTROI001
		if (!Util.isEmpty(blocoI.getRegistroI001())) {
			GerarRegistroI001.gerar(blocoI.getRegistroI001(), sb);
			efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI001);
		}

		// REGISTROI010
		if (!Util.isEmpty(blocoI.getRegistroI010())) {
			blocoI.getRegistroI010().forEach(registroI010 -> {
				GerarRegistroI010.gerar(registroI010, sb);
				efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI010);

				// REGISTROI100
				if (!Util.isEmpty(registroI010.getRegistroI100())) {
					registroI010.getRegistroI100().forEach(registroI100 -> {
						GerarRegistroI100.gerar(registroI100, sb);
						efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI100);

						// REGISTROI199
						if (!Util.isEmpty(registroI100.getRegistroI199())) {
							registroI100.getRegistroI199().forEach(registroI199 -> {
								GerarRegistroI199.gerar(registroI199, sb);
								efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI199);
							});
						}

						// REGISTROI200
						if (!Util.isEmpty(registroI100.getRegistroI200())) {
							registroI100.getRegistroI200().forEach(registroI200 -> {
								GerarRegistroI200.gerar(registroI200, sb);
								efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI200);

								// REGISTROI299
								if (!Util.isEmpty(registroI200.getRegistroI299())) {
									registroI200.getRegistroI299().forEach(registroI299 -> {
										GerarRegistroI299.gerar(registroI299, sb);
										efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI299);
									});
								}

								// REGISTROI300
								if (!Util.isEmpty(registroI200.getRegistroI300())) {
									registroI200.getRegistroI300().forEach(registroI300 -> {
										GerarRegistroI300.gerar(registroI300, sb);
										efdContribuicoes.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI300);

										// REGISTROI399
										if (!Util.isEmpty(registroI300.getRegistroI399())) {
											registroI300.getRegistroI399().forEach(registroI399 -> {
												GerarRegistroI399.gerar(registroI399, sb);
												efdContribuicoes.getContadoresBlocoI()
														.incrementar(BlocoIEnum.RegistroI399);
											});
										}
									});
								}
							});
						}
					});
				}
			});
		}

		// REGISTROI990
		if (efdContribuicoes.getContadoresBlocoI().getContRegistroI990() > 0) {
			RegistroI990 registroI990 = new RegistroI990();
			registroI990.setQtd_lin_i(String.valueOf(efdContribuicoes.getContadoresBlocoI().getContRegistroI990() + 1));

			blocoI.setRegistroI990(registroI990);
			GerarRegistroI990.gerar(blocoI.getRegistroI990(), sb);
		}

		return sb;
	}
}
