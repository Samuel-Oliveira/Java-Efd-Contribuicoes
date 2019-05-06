/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.contribuicoes.registros.blocoD.BlocoDEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoD {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoD blocoD = efdContribuicoes.getBlocoD();
		sb = sbr;

		// REGISTROD001
		if (!Util.isEmpty(blocoD.getRegistroD001())) {
			GerarRegistroD001.gerar(blocoD.getRegistroD001(), sb);
			efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD001);
		}

		// REGISTROD010
		if (!Util.isEmpty(blocoD.getRegistroD010())) {
			blocoD.getRegistroD010().forEach(registroD010 -> {
				GerarRegistroD010.gerar(registroD010, sb);
				efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD010);

				// REGISTROD100
				if (!Util.isEmpty(registroD010.getRegistroD100())) {
					registroD010.getRegistroD100().forEach(registroD100 -> {
						GerarRegistroD100.gerar(registroD100, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD100);

						// REGISTROD101
						if (!Util.isEmpty(registroD100.getRegistroD101())) {
							registroD100.getRegistroD101().forEach(registroD101 -> {
								GerarRegistroD101.gerar(registroD101, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD101);
							});
						}

						// REGISTROD105
						if (!Util.isEmpty(registroD100.getRegistroD105())) {
							registroD100.getRegistroD105().forEach(registroD105 -> {
								GerarRegistroD105.gerar(registroD105, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD105);
							});
						}

						// REGISTROD111
						if (!Util.isEmpty(registroD100.getRegistroD111())) {
							registroD100.getRegistroD111().forEach(registroD111 -> {
								GerarRegistroD111.gerar(registroD111, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD111);
							});
						}
					});
				}

				// REGISTROD200
				if (!Util.isEmpty(registroD010.getRegistroD200())) {
					registroD010.getRegistroD200().forEach(registroD200 -> {
						GerarRegistroD200.gerar(registroD200, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD200);

						// REGISTROD201
						if (!Util.isEmpty(registroD200.getRegistroD201())) {
							registroD200.getRegistroD201().forEach(registroD201 -> {
								GerarRegistroD201.gerar(registroD201, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD201);
							});
						}

						// REGISTROD205
						if (!Util.isEmpty(registroD200.getRegistroD205())) {
							registroD200.getRegistroD205().forEach(registroD205 -> {
								GerarRegistroD205.gerar(registroD205, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD205);
							});
						}

						// REGISTROD209
						if (!Util.isEmpty(registroD200.getRegistroD209())) {
							registroD200.getRegistroD209().forEach(registroD209 -> {
								GerarRegistroD209.gerar(registroD209, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD209);
							});
						}
					});
				}

				// REGISTROD300
				if (!Util.isEmpty(registroD010.getRegistroD300())) {
					registroD010.getRegistroD300().forEach(registroD300 -> {
						GerarRegistroD300.gerar(registroD300, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD300);

						// REGISTROD309
						if (!Util.isEmpty(registroD300.getRegistroD309())) {
							registroD300.getRegistroD309().forEach(registroD309 -> {
								GerarRegistroD309.gerar(registroD309, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD309);
							});
						}
					});
				}

				// REGISTROD350
				if (!Util.isEmpty(registroD010.getRegistroD350())) {
					registroD010.getRegistroD350().forEach(registroD350 -> {
						GerarRegistroD350.gerar(registroD350, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD350);

						// REGISTROD359
						if (!Util.isEmpty(registroD350.getRegistroD359())) {
							registroD350.getRegistroD359().forEach(registroD359 -> {
								GerarRegistroD359.gerar(registroD359, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD359);
							});
						}
					});
				}

				// REGISTROD500
				if (!Util.isEmpty(registroD010.getRegistroD500())) {
					registroD010.getRegistroD500().forEach(registroD500 -> {
						GerarRegistroD500.gerar(registroD500, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD500);

						// REGISTROD501
						if (!Util.isEmpty(registroD500.getRegistroD501())) {
							registroD500.getRegistroD501().forEach(registroD501 -> {
								GerarRegistroD501.gerar(registroD501, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD501);
							});
						}

						// REGISTROD505
						if (!Util.isEmpty(registroD500.getRegistroD505())) {
							registroD500.getRegistroD505().forEach(registroD505 -> {
								GerarRegistroD505.gerar(registroD505, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD505);
							});
						}

						// REGISTROD509
						if (!Util.isEmpty(registroD500.getRegistroD509())) {
							registroD500.getRegistroD509().forEach(registroD509 -> {
								GerarRegistroD509.gerar(registroD509, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD509);
							});
						}
					});
				}

				// REGISTROD600
				if (!Util.isEmpty(registroD010.getRegistroD600())) {
					registroD010.getRegistroD600().forEach(registroD600 -> {
						GerarRegistroD600.gerar(registroD600, sb);
						efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD600);

						// REGISTROD601
						if (!Util.isEmpty(registroD600.getRegistroD601())) {
							registroD600.getRegistroD601().forEach(registroD601 -> {
								GerarRegistroD601.gerar(registroD601, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD601);
							});
						}

						// REGISTROD605
						if (!Util.isEmpty(registroD600.getRegistroD605())) {
							registroD600.getRegistroD605().forEach(registroD605 -> {
								GerarRegistroD605.gerar(registroD605, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD605);
							});
						}

						// REGISTROD609
						if (!Util.isEmpty(registroD600.getRegistroD609())) {
							registroD600.getRegistroD609().forEach(registroD609 -> {
								GerarRegistroD609.gerar(registroD609, sb);
								efdContribuicoes.getContadoresBlocoD().incrementar(BlocoDEnum.RegistroD609);
							});
						}
					});
				}
			});
		}

		// REGISTROD990
		if (efdContribuicoes.getContadoresBlocoD().getContRegistroD990() > 0) {
			RegistroD990 registroD990 = new RegistroD990();
			registroD990.setQtd_lin_d(String.valueOf(efdContribuicoes.getContadoresBlocoD().getContRegistroD990() + 1));

			blocoD.setRegistroD990(registroD990);
			GerarRegistroD990.gerar(blocoD.getRegistroD990(), sb);
		}

		return sb;

	}
}
