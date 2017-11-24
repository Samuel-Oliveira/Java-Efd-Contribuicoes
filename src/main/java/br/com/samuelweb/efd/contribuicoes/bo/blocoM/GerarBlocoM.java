/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.BlocoM;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.BlocoMEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM990;
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

		// REGISTROM300
		if (!Util.isEmpty(blocoM.getRegistroM300())) {
			blocoM.getRegistroM300().stream().forEach(registroM300 -> {
				sb = GerarRegistroM300.gerar(registroM300, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM300);
			});
		}

		// REGISTROM350
		if (!Util.isEmpty(blocoM.getRegistroM350())) {
			sb = GerarRegistroM350.gerar(blocoM.getRegistroM350(), sb);
			efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM350);
		}

		// REGISTROM400
		if (!Util.isEmpty(blocoM.getRegistroM400())) {
			blocoM.getRegistroM400().stream().forEach(registroM400 -> {
				sb = GerarRegistroM400.gerar(registroM400, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM400);

				// REGISTROM410
				if (!Util.isEmpty(registroM400.getRegistroM410())) {
					registroM400.getRegistroM410().stream().forEach(registroM410 -> {
						sb = GerarRegistroM410.gerar(registroM410, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM410);
					});
				}
			});
		}

		// REGISTROM500
		if (!Util.isEmpty(blocoM.getRegistroM500())) {
			blocoM.getRegistroM500().stream().forEach(registroM500 -> {
				sb = GerarRegistroM500.gerar(registroM500, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM500);

				// REGISTROM505
				if (!Util.isEmpty(registroM500.getRegistroM505())) {
					registroM500.getRegistroM505().stream().forEach(registroM505 -> {
						sb = GerarRegistroM505.gerar(registroM505, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM505);
					});
				}

				// REGISTROM510
				if (!Util.isEmpty(registroM500.getRegistroM510())) {
					registroM500.getRegistroM510().stream().forEach(registroM510 -> {
						sb = GerarRegistroM510.gerar(registroM510, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM510);

						// REGISTROM515
						if (!Util.isEmpty(registroM510.getRegistroM515())) {
							registroM510.getRegistroM515().stream().forEach(registroM515 -> {
								sb = GerarRegistroM515.gerar(registroM515, sb);
								efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM515);
							});
						}
					});
				}
			});
		}

		// REGISTROM600
		if (!Util.isEmpty(blocoM.getRegistroM600())) {
			sb = GerarRegistroM600.gerar(blocoM.getRegistroM600(), sb);
			efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM600);

			// REGISTROM605
			if (!Util.isEmpty(blocoM.getRegistroM600().getRegistroM605())) {
				blocoM.getRegistroM600().getRegistroM605().stream().forEach(registroM605 -> {
					sb = GerarRegistroM605.gerar(registroM605, sb);
					efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM605);
				});
			}

			// REGISTROM610
			if (!Util.isEmpty(blocoM.getRegistroM600().getRegistroM610())) {
				blocoM.getRegistroM600().getRegistroM610().stream().forEach(registroM610 -> {
					sb = GerarRegistroM610.gerar(registroM610, sb);
					efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM610);

					// REGISTROM611
					if (!Util.isEmpty(registroM610.getRegistroM611())) {
						sb = GerarRegistroM611.gerar(registroM610.getRegistroM611(), sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM611);
					}

					// REGISTROM620
					if (!Util.isEmpty(registroM610.getRegistroM620())) {
						registroM610.getRegistroM620().stream().forEach(registroM620 -> {

							sb = GerarRegistroM620.gerar(registroM620, sb);
							efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM620);

							// REGISTROM625
							if (!Util.isEmpty(registroM620.getRegistroM625())) {
								registroM620.getRegistroM625().stream().forEach(registroM625 -> {
									sb = GerarRegistroM625.gerar(registroM625, sb);
									efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM625);
								});
							}
						});
					}

					// REGISTROM630
					if (!Util.isEmpty(registroM610.getRegistroM630())) {
						registroM610.getRegistroM630().stream().forEach(registroM630 -> {
							sb = GerarRegistroM630.gerar(registroM630, sb);
							efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM630);
						});
					}
				});
			}
		}

		// REGISTROM700
		if (!Util.isEmpty(blocoM.getRegistroM700())) {
			blocoM.getRegistroM700().stream().forEach(registroM700 -> {
				sb = GerarRegistroM700.gerar(registroM700, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM700);
			});
		}

		// REGISTROM800
		if (!Util.isEmpty(blocoM.getRegistroM800())) {
			blocoM.getRegistroM800().stream().forEach(registroM800 -> {
				sb = GerarRegistroM800.gerar(registroM800, sb);
				efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM800);

				// REGISTROM810
				if (!Util.isEmpty(registroM800.getRegistroM810())) {
					registroM800.getRegistroM810().stream().forEach(registroM810 -> {
						sb = GerarRegistroM810.gerar(registroM810, sb);
						efdContribuicoes.getContadoresBlocoM().incrementar(BlocoMEnum.RegistroM810);
					});
				}
			});
		}

		// REGISTROM990
		if (efdContribuicoes.getContadoresBlocoM().getContRegistroM990() > 0) {
			RegistroM990 registroM990 = new RegistroM990();
			registroM990.setQtd_lin_m(String.valueOf(efdContribuicoes.getContadoresBlocoM().getContRegistroM990() + 1));

			blocoM.setRegistroM990(registroM990);
			sb = GerarRegistroM990.gerar(blocoM.getRegistroM990(), sb);
		}

		return sb;
	}
}
