/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.BlocoF;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.BlocoFEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF990;
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
			GerarRegistroF001.gerar(blocoF.getRegistroF001(), sb);
			efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF001);
		}

		// REGISTROF010
		if (!Util.isEmpty(blocoF.getRegistroF010())) {
			blocoF.getRegistroF010().forEach(registroF010 -> {
				GerarRegistroF010.gerar(registroF010, sb);
				efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF010);

				// REGISTROF100
				if (!Util.isEmpty(registroF010.getRegistroF100())) {
					registroF010.getRegistroF100().forEach(registroF100 -> {
						GerarRegistroF100.gerar(registroF100, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF100);

						// REGISTROF111
						if (!Util.isEmpty(registroF100.getRegistroF111())) {
							registroF100.getRegistroF111().forEach(registroF111 -> {
								GerarRegistroF111.gerar(registroF111, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF111);
							});
						}
					});
				}

				// REGISTROF120
				if (!Util.isEmpty(registroF010.getRegistroF120())) {
					registroF010.getRegistroF120().forEach(registroF120 -> {
						GerarRegistroF120.gerar(registroF120, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF120);

						// REGISTROF129
						if (!Util.isEmpty(registroF120.getRegistroF129())) {
							registroF120.getRegistroF129().forEach(registroF129 -> {
								GerarRegistroF129.gerar(registroF129, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF129);
							});
						}
					});
				}

				// REGISTROF130
				if (!Util.isEmpty(registroF010.getRegistroF130())) {
					registroF010.getRegistroF130().forEach(registroF130 -> {
						GerarRegistroF130.gerar(registroF130, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF130);

						// REGISTROF139
						if (!Util.isEmpty(registroF130.getRegistroF139())) {
							registroF130.getRegistroF139().forEach(registroF139 -> {
								GerarRegistroF139.gerar(registroF139, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF139);
							});
						}
					});
				}

				// REGISTROF150
				if (!Util.isEmpty(registroF010.getRegistroF150())) {
					registroF010.getRegistroF150().forEach(registroF150 -> {
						GerarRegistroF150.gerar(registroF150, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF150);
					});
				}

				// REGISTROF200
				if (!Util.isEmpty(registroF010.getRegistroF200())) {
					registroF010.getRegistroF200().forEach(registroF200 -> {
						GerarRegistroF200.gerar(registroF200, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF200);

						// REGISTROF205
						if (!Util.isEmpty(registroF200.getRegistroF205())) {
							GerarRegistroF205.gerar(registroF200.getRegistroF205(), sb);
							efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF205);
						}

						// REGISTROF210
						if (!Util.isEmpty(registroF200.getRegistroF210())) {
							registroF200.getRegistroF210().forEach(registroF210 -> {
								GerarRegistroF210.gerar(registroF210, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF210);
							});
						}

						// REGISTROF211
						if (!Util.isEmpty(registroF200.getRegistroF211())) {
							registroF200.getRegistroF211().forEach(registroF211 -> {
								GerarRegistroF211.gerar(registroF211, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF211);
							});
						}
					});
				}

				// REGISTROF500
				if (!Util.isEmpty(registroF010.getRegistroF500())) {
					registroF010.getRegistroF500().forEach(registroF500 -> {
						GerarRegistroF500.gerar(registroF500, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF500);

						// REGISTROF509
						if (!Util.isEmpty(registroF500.getRegistroF509())) {
							registroF500.getRegistroF509().forEach(registroF509 -> {
								GerarRegistroF509.gerar(registroF509, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF509);
							});
						}

					});
				}

				// REGISTROF510
				if (!Util.isEmpty(registroF010.getRegistroF510())) {
					registroF010.getRegistroF510().forEach(registroF510 -> {
						GerarRegistroF510.gerar(registroF510, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF510);

						// REGISTROF519
						if (!Util.isEmpty(registroF510.getRegistroF519())) {
							registroF510.getRegistroF519().forEach(registroF519 -> {
								GerarRegistroF519.gerar(registroF519, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF519);
							});
						}

					});
				}

				// REGISTROF525
				if (!Util.isEmpty(registroF010.getRegistroF525())) {
					registroF010.getRegistroF525().forEach(registroF525 -> {
						GerarRegistroF525.gerar(registroF525, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF525);

					});
				}

				// REGISTROF550
				if (!Util.isEmpty(registroF010.getRegistroF550())) {
					registroF010.getRegistroF550().forEach(registroF550 -> {
						GerarRegistroF550.gerar(registroF550, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF550);

						// REGISTROF559
						if (!Util.isEmpty(registroF550.getRegistroF559())) {
							registroF550.getRegistroF559().forEach(registroF559 -> {
								GerarRegistroF559.gerar(registroF559, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF559);
							});
						}
					});
				}

				// REGISTROF560
				if (!Util.isEmpty(registroF010.getRegistroF560())) {
					registroF010.getRegistroF560().forEach(registroF560 -> {
						GerarRegistroF560.gerar(registroF560, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF560);

						// REGISTROF569
						if (!Util.isEmpty(registroF560.getRegistroF569())) {
							registroF560.getRegistroF569().forEach(registroF569 -> {
								GerarRegistroF569.gerar(registroF569, sb);
								efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF569);
							});
						}
					});
				}

				// REGISTROF600
				if (!Util.isEmpty(registroF010.getRegistroF600())) {
					registroF010.getRegistroF600().forEach(registroF600 -> {
						GerarRegistroF600.gerar(registroF600, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF600);
					});
				}

				// REGISTROF700
				if (!Util.isEmpty(registroF010.getRegistroF700())) {
					registroF010.getRegistroF700().forEach(registroF700 -> {
						GerarRegistroF700.gerar(registroF700, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF700);
					});
				}

				// REGISTROF800
				if (!Util.isEmpty(registroF010.getRegistroF800())) {
					registroF010.getRegistroF800().forEach(registroF800 -> {
						GerarRegistroF800.gerar(registroF800, sb);
						efdContribuicoes.getContadoresBlocoF().incrementar(BlocoFEnum.RegistroF800);
					});
				}

			});
		}

		// REGISTROF990
		if (efdContribuicoes.getContadoresBlocoF().getContRegistroF990() > 0) {
			RegistroF990 registroF990 = new RegistroF990();
			registroF990.setQtd_lin_f(String.valueOf(efdContribuicoes.getContadoresBlocoF().getContRegistroF990() + 1));

			blocoF.setRegistroF990(registroF990);
			GerarRegistroF990.gerar(blocoF.getRegistroF990(), sb);
		}

		return sb;
	}
}
