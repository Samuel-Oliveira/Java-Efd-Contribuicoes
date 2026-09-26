/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.BlocoCEnum;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarBlocoC {


	public static StringBuilder gerar(EfdContribuicoes efdContribuicoes, StringBuilder sbr) {
		BlocoC blocoC = efdContribuicoes.getBlocoC();


		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			GerarRegistroC001.gerar(blocoC.getRegistroC001(), sbr);
			efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC010
		if (!Util.isEmpty(blocoC.getRegistroC010())) {
			blocoC.getRegistroC010().forEach(registroC010 -> {
				GerarRegistroC010.gerar(registroC010, sbr);
				efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC010);

				// REGISTROC100
				if (!Util.isEmpty(registroC010.getRegistroC100())) {
					registroC010.getRegistroC100().forEach(registroC100 -> {
						GerarRegistroC100.gerar(registroC100, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC100);

						// REGISTROC110
						if (!Util.isEmpty(registroC100.getRegistroC110())) {
							registroC100.getRegistroC110().forEach(registroC110 -> {
								GerarRegistroC110.gerar(registroC110, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC110);

							});
						}

						// REGISTROC111
						if (!Util.isEmpty(registroC100.getRegistroC111())) {
							registroC100.getRegistroC111().forEach(registroC111 -> {
								GerarRegistroC111.gerar(registroC111, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC111);
							});
						}

						// REGISTROC120
						if (!Util.isEmpty(registroC100.getRegistroC120())) {
							registroC100.getRegistroC120().forEach(registroC120 -> {
								GerarRegistroC120.gerar(registroC120, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC120);
							});
						}

						// REGISTROC170
						if (!Util.isEmpty(registroC100.getRegistroC170())) {
							registroC100.getRegistroC170().forEach(registroC170 -> {
								GerarRegistroC170.gerar(registroC170, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC170);
							});
						}

						// REGISTROC175
						if (!Util.isEmpty(registroC100.getRegistroC175())) {
							registroC100.getRegistroC175().forEach(registroC175 -> {
								GerarRegistroC175.gerar(registroC175, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC175);
							});
						}
					});
				}

				// REGISTROC180
				if (!Util.isEmpty(registroC010.getRegistroC180())) {
					registroC010.getRegistroC180().forEach(registroC180 -> {
						GerarRegistroC180.gerar(registroC180, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC180);

						// REGISTROC181
						if (!Util.isEmpty(registroC180.getRegistroC181())) {
							registroC180.getRegistroC181().forEach(registroC181 -> {
								GerarRegistroC181.gerar(registroC181, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC181);
							});
						}

						// REGISTROC185
						if (!Util.isEmpty(registroC180.getRegistroC185())) {
							registroC180.getRegistroC185().forEach(registroC185 -> {
								GerarRegistroC185.gerar(registroC185, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC185);
							});
						}

						// REGISTROC188
						if (!Util.isEmpty(registroC180.getRegistroC188())) {
							registroC180.getRegistroC188().forEach(registroC188 -> {
								GerarRegistroC188.gerar(registroC188, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC188);
							});
						}
					});
				}

				// REGISTROC190
				if (!Util.isEmpty(registroC010.getRegistroC190())) {
					registroC010.getRegistroC190().forEach(registroC190 -> {
						GerarRegistroC190.gerar(registroC190, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC190);

						// REGISTROC191
						if (!Util.isEmpty(registroC190.getRegistroC191())) {
							registroC190.getRegistroC191().forEach(registroC191 -> {
								GerarRegistroC191.gerar(registroC191, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC191);
							});
						}

						// REGISTROC195
						if (!Util.isEmpty(registroC190.getRegistroC195())) {
							registroC190.getRegistroC195().forEach(registroC195 -> {
								GerarRegistroC195.gerar(registroC195, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC195);
							});
						}

						// REGISTROC198
						if (!Util.isEmpty(registroC190.getRegistroC198())) {
							registroC190.getRegistroC198().forEach(registroC198 -> {
								GerarRegistroC198.gerar(registroC198, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC198);
							});
						}

						// REGISTROC199
						if (!Util.isEmpty(registroC190.getRegistroC199())) {
							registroC190.getRegistroC199().forEach(registroC199 -> {
								GerarRegistroC199.gerar(registroC199, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC199);
							});
						}
					});
				}

				// REGISTROC380
				if (!Util.isEmpty(registroC010.getRegistroC380())) {
					registroC010.getRegistroC380().forEach(registroC380 -> {
						GerarRegistroC380.gerar(registroC380, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC380);

						// REGISTROC381
						if (!Util.isEmpty(registroC380.getRegistroC381())) {
							registroC380.getRegistroC381().forEach(registroC381 -> {
								GerarRegistroC381.gerar(registroC381, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC381);
							});
						}

						// REGISTROC385
						if (!Util.isEmpty(registroC380.getRegistroC385())) {
							registroC380.getRegistroC385().forEach(registroC385 -> {
								GerarRegistroC385.gerar(registroC385, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC385);
							});
						}

					});
				}

				// REGISTROC395
				if (!Util.isEmpty(registroC010.getRegistroC395())) {
					registroC010.getRegistroC395().forEach(registroC395 -> {
						GerarRegistroC395.gerar(registroC395, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC395);

						// REGISTROC396
						if (!Util.isEmpty(registroC395.getRegistroC396())) {
							registroC395.getRegistroC396().forEach(registroC396 -> {
								GerarRegistroC396.gerar(registroC396, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC396);
							});
						}
					});
				}

				// REGISTROC400
				if (!Util.isEmpty(registroC010.getRegistroC400())) {
					registroC010.getRegistroC400().forEach(registroC400 -> {
						GerarRegistroC400.gerar(registroC400, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC400);

						// REGISTROC405
						if (!Util.isEmpty(registroC400.getRegistroC405())) {
							registroC400.getRegistroC405().forEach(registroC405 -> {
								GerarRegistroC405.gerar(registroC405, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC405);

								// REGISTROC481
								if (!Util.isEmpty(registroC405.getRegistroC481())) {
									registroC405.getRegistroC481().forEach(registroC481 -> {
										GerarRegistroC481.gerar(registroC481, sbr);
										efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC481);
									});
								}

								// REGISTROC485
								if (!Util.isEmpty(registroC405.getRegistroC485())) {
									registroC405.getRegistroC485().forEach(registroC485 -> {
										GerarRegistroC485.gerar(registroC485, sbr);
										efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC485);
									});
								}
							});
						}

						// REGISTROC489
						if (!Util.isEmpty(registroC400.getRegistroC489())) {
							registroC400.getRegistroC489().forEach(registroC489 -> {
								GerarRegistroC489.gerar(registroC489, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC489);
							});
						}
					});
				}

				// REGISTROC490
				if (!Util.isEmpty(registroC010.getRegistroC490())) {
					registroC010.getRegistroC490().forEach(registroC490 -> {
						GerarRegistroC490.gerar(registroC490, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC490);

						// REGISTROC491
						if (!Util.isEmpty(registroC490.getRegistroC491())) {
							registroC490.getRegistroC491().forEach(registroC491 -> {
								GerarRegistroC491.gerar(registroC491, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC491);
							});
						}

						// REGISTROC495
						if (!Util.isEmpty(registroC490.getRegistroC495())) {
							registroC490.getRegistroC495().forEach(registroC495 -> {
								GerarRegistroC495.gerar(registroC495, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC495);
							});
						}
						// REGISTROC499
						if (!Util.isEmpty(registroC490.getRegistroC499())) {
							registroC490.getRegistroC499().forEach(registroC499 -> {
								GerarRegistroC499.gerar(registroC499, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC499);
							});
						}
					});
				}

				// REGISTROC500
				if (!Util.isEmpty(registroC010.getRegistroC500())) {
					registroC010.getRegistroC500().forEach(registroC500 -> {
						GerarRegistroC500.gerar(efdContribuicoes,registroC500, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC500);

						// REGISTROC501
						if (!Util.isEmpty(registroC500.getRegistroC501())) {
							registroC500.getRegistroC501().forEach(registroC501 -> {
								GerarRegistroC501.gerar(registroC501, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC501);
							});
						}

						// REGISTROC505
						if (!Util.isEmpty(registroC500.getRegistroC505())) {
							registroC500.getRegistroC505().forEach(registroC505 -> {
								GerarRegistroC505.gerar(registroC505, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC505);
							});
						}
						// REGISTROC509
						if (!Util.isEmpty(registroC500.getRegistroC509())) {
							registroC500.getRegistroC509().forEach(registroC509 -> {
								GerarRegistroC509.gerar(registroC509, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC509);
							});
						}
					});
				}

				// REGISTROC600
				if (!Util.isEmpty(registroC010.getRegistroC600())) {
					registroC010.getRegistroC600().forEach(registroC600 -> {
						GerarRegistroC600.gerar(registroC600, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);

						// REGISTROC601
						if (!Util.isEmpty(registroC600.getRegistroC601())) {
							registroC600.getRegistroC601().forEach(registroC601 -> {
								GerarRegistroC601.gerar(registroC601, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC601);
							});
						}

						// REGISTROC605
						if (!Util.isEmpty(registroC600.getRegistroC605())) {
							registroC600.getRegistroC605().forEach(registroC605 -> {
								GerarRegistroC605.gerar(registroC605, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC605);
							});
						}
						// REGISTROC609
						if (!Util.isEmpty(registroC600.getRegistroC609())) {
							registroC600.getRegistroC609().forEach(registroC609 -> {
								GerarRegistroC609.gerar(registroC609, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC609);
							});
						}
					});
				}

				// REGISTROC800
				if (!Util.isEmpty(registroC010.getRegistroC800())) {
					registroC010.getRegistroC800().forEach(registroC800 -> {
						GerarRegistroC800.gerar(registroC800, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC800);

						// REGISTROC810
						if (!Util.isEmpty(registroC800.getRegistroC810())) {
							registroC800.getRegistroC810().forEach(registroC810 -> {
								GerarRegistroC810.gerar(registroC810, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC810);
							});
						}

						// REGISTROC820
						if (!Util.isEmpty(registroC800.getRegistroC820())) {
							registroC800.getRegistroC820().forEach(registroC820 -> {
								GerarRegistroC820.gerar(registroC820, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC820);
							});
						}
						// REGISTROC830
						if (!Util.isEmpty(registroC800.getRegistroC830())) {
							registroC800.getRegistroC830().forEach(registroC830 -> {
								GerarRegistroC830.gerar(registroC830, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC830);
							});
						}
					});
				}

				// REGISTROC860
				if (!Util.isEmpty(registroC010.getRegistroC860())) {
					registroC010.getRegistroC860().forEach(registroC860 -> {
						GerarRegistroC860.gerar(registroC860, sbr);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC860);

						// REGISTROC870
						if (!Util.isEmpty(registroC860.getRegistroC870())) {
							registroC860.getRegistroC870().forEach(registroC870 -> {
								GerarRegistroC870.gerar(registroC870, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC870);
							});
						}

						// REGISTROC880
						if (!Util.isEmpty(registroC860.getRegistroC880())) {
							registroC860.getRegistroC880().forEach(registroC880 -> {
								GerarRegistroC880.gerar(registroC880, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC880);
							});
						}
						// REGISTROC890
						if (!Util.isEmpty(registroC860.getRegistroC890())) {
							registroC860.getRegistroC890().forEach(registroC890 -> {
								GerarRegistroC890.gerar(registroC890, sbr);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC890);
							});
						}
					});
				}
			});

		}

		// REGISTROC990
		if (efdContribuicoes.getContadoresBlocoC().getContRegistroC990() > 0) {
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_c(String.valueOf(efdContribuicoes.getContadoresBlocoC().getContRegistroC990() + 1));

			blocoC.setRegistroC990(registroC990);
			GerarRegistroC990.gerar(blocoC.getRegistroC990(), sbr);
		}

		return sbr;
	}
}
