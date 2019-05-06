package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Bloco1Enum;
import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * 
 * @author Yuri Lemes
 *
 */
public class GerarBloco1 {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		Bloco1 bloco1 = efdContribuicoes.getBloco1();
		sb = sbr;

		// REGISTRO1001
		if (!Util.isEmpty(bloco1.getRegistro1001())) {
			GerarRegistro1001.gerar(bloco1.getRegistro1001(), sb);
			efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1001);
		}

		// REGISTRO1010
		if (!Util.isEmpty(bloco1.getRegistro1010())) {
			bloco1.getRegistro1010().forEach(registro1010 -> {
				GerarRegistro1010.gerar(registro1010, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1010);
			});
		}

		// REGISTRO1020
		if (!Util.isEmpty(bloco1.getRegistro1020())) {
			bloco1.getRegistro1020().forEach(registro1020 -> {
				GerarRegistro1020.gerar(registro1020, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1020);
			});
		}

		// REGISTRO1100
		if (!Util.isEmpty(bloco1.getRegistro1100())) {
			bloco1.getRegistro1100().forEach(registro1100 -> {
				GerarRegistro1100.gerar(registro1100, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1100);

				// REGISTRO1101
				if (!Util.isEmpty(registro1100.getRegistro1101())) {
					registro1100.getRegistro1101().forEach(registro1101 -> {
						GerarRegistro1101.gerar(registro1101, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1101);

						// REGISTRO1102
						if (!Util.isEmpty(registro1101.getRegistro1102())) {
							GerarRegistro1102.gerar(registro1101.getRegistro1102(), sb);
							efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1102);
						}
					});
				}
			});
		}

		// REGISTRO1200
		if (!Util.isEmpty(bloco1.getRegistro1200())) {
			bloco1.getRegistro1200().forEach(registro1200 -> {
				GerarRegistro1200.gerar(registro1200, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1200);

				// REGISTRO1210
				if (!Util.isEmpty(registro1200.getRegistro1210())) {
					registro1200.getRegistro1210().forEach(registro1210 -> {
						GerarRegistro1210.gerar(registro1210, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1210);
					});
				}

				// REGISTRO1220
				if (!Util.isEmpty(registro1200.getRegistro1220())) {
					registro1200.getRegistro1220().forEach(registro1220 -> {
						GerarRegistro1220.gerar(registro1220, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1220);
					});
				}
			});
		}

		// REGISTRO1300
		if (!Util.isEmpty(bloco1.getRegistro1300())) {
			bloco1.getRegistro1300().forEach(registro1300 -> {
				GerarRegistro1300.gerar(registro1300, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1300);
			});
		}

		// REGISTRO1500
		if (!Util.isEmpty(bloco1.getRegistro1500())) {
			bloco1.getRegistro1500().forEach(registro1500 -> {
				GerarRegistro1500.gerar(registro1500, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1500);

				// REGISTRO1501
				if (!Util.isEmpty(registro1500.getRegistro1501())) {
					registro1500.getRegistro1501().forEach(registro1501 -> {
						GerarRegistro1501.gerar(registro1501, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1501);

						// REGISTRO1502
						if (!Util.isEmpty(registro1501.getRegistro1502())) {
							GerarRegistro1502.gerar(registro1501.getRegistro1502(), sb);
							efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1502);
						}
					});
				}
			});
		}

		// REGISTRO1600
		if (!Util.isEmpty(bloco1.getRegistro1600())) {
			bloco1.getRegistro1600().forEach(registro1600 -> {
				GerarRegistro1600.gerar(registro1600, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1600);

				// REGISTRO1610
				if (!Util.isEmpty(registro1600.getRegistro1610())) {
					registro1600.getRegistro1610().forEach(registro1610 -> {
						GerarRegistro1610.gerar(registro1610, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1610);
					});
				}

				// REGISTRO1620
				if (!Util.isEmpty(registro1600.getRegistro1620())) {
					registro1600.getRegistro1620().forEach(registro1620 -> {
						GerarRegistro1620.gerar(registro1620, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1620);
					});
				}
			});
		}

		// REGISTRO1700
		if (!Util.isEmpty(bloco1.getRegistro1700())) {
			bloco1.getRegistro1700().forEach(registro1700 -> {
				GerarRegistro1700.gerar(registro1700, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1700);
			});
		}

		// REGISTRO1800
		if (!Util.isEmpty(bloco1.getRegistro1800())) {
			bloco1.getRegistro1800().forEach(registro1800 -> {
				GerarRegistro1800.gerar(registro1800, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1800);

				// REGISTRO1809
				if (!Util.isEmpty(registro1800.getRegistro1809())) {
					registro1800.getRegistro1809().forEach(registro1809 -> {
						GerarRegistro1809.gerar(registro1809, sb);
						efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1809);
					});
				}
			});
		}

		// REGISTRO1900
		if (!Util.isEmpty(bloco1.getRegistro1900())) {
			bloco1.getRegistro1900().forEach(registro1900 -> {
				GerarRegistro1900.gerar(registro1900, sb);
				efdContribuicoes.getContadoresBloco1().incrementar(Bloco1Enum.Registro1900);
			});
		}

		// REGISTRO1990
		if (efdContribuicoes.getContadoresBloco1().getContRegistro1990() > 0) {
			Registro1990 registro1990 = new Registro1990();
			registro1990.setQtd_lin_1(String.valueOf(efdContribuicoes.getContadoresBloco1().getContRegistro1990() + 1));

			bloco1.setRegistro1990(registro1990);
			GerarRegistro1990.gerar(bloco1.getRegistro1990(), sb);
		}

		return sb;

	}
}
