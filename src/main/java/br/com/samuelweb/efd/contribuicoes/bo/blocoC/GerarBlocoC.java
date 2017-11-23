/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.BlocoCEnum;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC990;
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

				// REGISTROC190
				if (!Util.isEmpty(registroC010.getRegistroC190())) {
					registroC010.getRegistroC190().stream().forEach(registroC190 -> {
						sb = GerarRegistroC190.gerar(registroC190, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC190);

						// REGISTROC191
						if (!Util.isEmpty(registroC190.getRegistroC191())) {
							registroC190.getRegistroC191().stream().forEach(registroC191 -> {
								sb = GerarRegistroC191.gerar(registroC191, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC191);
							});
						}

						// REGISTROC195
						if (!Util.isEmpty(registroC190.getRegistroC195())) {
							registroC190.getRegistroC195().stream().forEach(registroC195 -> {
								sb = GerarRegistroC195.gerar(registroC195, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC195);
							});
						}

						// REGISTROC198
						if (!Util.isEmpty(registroC190.getRegistroC198())) {
							registroC190.getRegistroC198().stream().forEach(registroC198 -> {
								sb = GerarRegistroC198.gerar(registroC198, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC198);
							});
						}

						// REGISTROC199
						if (!Util.isEmpty(registroC190.getRegistroC199())) {
							registroC190.getRegistroC199().stream().forEach(registroC199 -> {
								sb = GerarRegistroC199.gerar(registroC199, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC199);
							});
						}
					});
				}

				// REGISTROC380
				if (!Util.isEmpty(registroC010.getRegistroC380())) {
					registroC010.getRegistroC380().stream().forEach(registroC380 -> {
						sb = GerarRegistroC380.gerar(registroC380, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC380);

						// REGISTROC381
						if (!Util.isEmpty(registroC380.getRegistroC381())) {
							registroC380.getRegistroC381().stream().forEach(registroC381 -> {
								sb = GerarRegistroC381.gerar(registroC381, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC381);
							});
						}

						// REGISTROC385
						if (!Util.isEmpty(registroC380.getRegistroC385())) {
							registroC380.getRegistroC385().stream().forEach(registroC385 -> {
								sb = GerarRegistroC385.gerar(registroC385, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC385);
							});
						}

					});
				}

				// REGISTROC395
				if (!Util.isEmpty(registroC010.getRegistroC395())) {
					registroC010.getRegistroC395().stream().forEach(registroC395 -> {
						sb = GerarRegistroC395.gerar(registroC395, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC395);

						// REGISTROC396
						if (!Util.isEmpty(registroC395.getRegistroC396())) {
							registroC395.getRegistroC396().stream().forEach(registroC396 -> {
								sb = GerarRegistroC396.gerar(registroC396, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC396);
							});
						}
					});
				}

				// REGISTROC400
				if (!Util.isEmpty(registroC010.getRegistroC400())) {
					registroC010.getRegistroC400().stream().forEach(registroC400 -> {
						sb = GerarRegistroC400.gerar(registroC400, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC400);

						// REGISTROC405
						if (!Util.isEmpty(registroC400.getRegistroC405())) {
							registroC400.getRegistroC405().stream().forEach(registroC405 -> {
								sb = GerarRegistroC405.gerar(registroC405, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC405);

								// REGISTROC481
								if (!Util.isEmpty(registroC405.getRegistroC481())) {
									registroC405.getRegistroC481().stream().forEach(registroC481 -> {
										sb = GerarRegistroC481.gerar(registroC481, sb);
										efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC481);
									});
								}

								// REGISTROC485
								if (!Util.isEmpty(registroC405.getRegistroC485())) {
									registroC405.getRegistroC485().stream().forEach(registroC485 -> {
										sb = GerarRegistroC485.gerar(registroC485, sb);
										efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC485);
									});
								}
							});
						}

						// REGISTROC489
						if (!Util.isEmpty(registroC400.getRegistroC489())) {
							registroC400.getRegistroC489().stream().forEach(registroC489 -> {
								sb = GerarRegistroC489.gerar(registroC489, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC489);
							});
						}
					});
				}

				// REGISTROC490
				if (!Util.isEmpty(registroC010.getRegistroC490())) {
					registroC010.getRegistroC490().stream().forEach(registroC490 -> {
						sb = GerarRegistroC490.gerar(registroC490, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC490);

						// REGISTROC491
						if (!Util.isEmpty(registroC490.getRegistroC491())) {
							registroC490.getRegistroC491().stream().forEach(registroC491 -> {
								sb = GerarRegistroC491.gerar(registroC491, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC491);
							});
						}

						// REGISTROC495
						if (!Util.isEmpty(registroC490.getRegistroC495())) {
							registroC490.getRegistroC495().stream().forEach(registroC495 -> {
								sb = GerarRegistroC495.gerar(registroC495, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC495);
							});
						}
						// REGISTROC499
						if (!Util.isEmpty(registroC490.getRegistroC499())) {
							registroC490.getRegistroC499().stream().forEach(registroC499 -> {
								sb = GerarRegistroC499.gerar(registroC499, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC499);
							});
						}
					});
				}

				// REGISTROC500
				if (!Util.isEmpty(registroC010.getRegistroC500())) {
					registroC010.getRegistroC500().stream().forEach(registroC500 -> {
						sb = GerarRegistroC500.gerar(registroC500, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC500);

						// REGISTROC501
						if (!Util.isEmpty(registroC500.getRegistroC501())) {
							registroC500.getRegistroC501().stream().forEach(registroC501 -> {
								sb = GerarRegistroC501.gerar(registroC501, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC501);
							});
						}

						// REGISTROC505
						if (!Util.isEmpty(registroC500.getRegistroC505())) {
							registroC500.getRegistroC505().stream().forEach(registroC505 -> {
								sb = GerarRegistroC505.gerar(registroC505, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC505);
							});
						}
						// REGISTROC509
						if (!Util.isEmpty(registroC500.getRegistroC509())) {
							registroC500.getRegistroC509().stream().forEach(registroC509 -> {
								sb = GerarRegistroC509.gerar(registroC509, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC509);
							});
						}
					});
				}

				// REGISTROC600
				if (!Util.isEmpty(registroC010.getRegistroC600())) {
					registroC010.getRegistroC600().stream().forEach(registroC600 -> {
						sb = GerarRegistroC600.gerar(registroC600, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);

						// REGISTROC601
						if (!Util.isEmpty(registroC600.getRegistroC601())) {
							registroC600.getRegistroC601().stream().forEach(registroC601 -> {
								sb = GerarRegistroC601.gerar(registroC601, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC601);
							});
						}

						// REGISTROC605
						if (!Util.isEmpty(registroC600.getRegistroC605())) {
							registroC600.getRegistroC605().stream().forEach(registroC605 -> {
								sb = GerarRegistroC605.gerar(registroC605, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC605);
							});
						}
						// REGISTROC609
						if (!Util.isEmpty(registroC600.getRegistroC609())) {
							registroC600.getRegistroC609().stream().forEach(registroC609 -> {
								sb = GerarRegistroC609.gerar(registroC609, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC609);
							});
						}
					});
				}

				// REGISTROC800
				if (!Util.isEmpty(registroC010.getRegistroC800())) {
					registroC010.getRegistroC800().stream().forEach(registroC800 -> {
						sb = GerarRegistroC800.gerar(registroC800, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC800);

						// REGISTROC810
						if (!Util.isEmpty(registroC800.getRegistroC810())) {
							registroC800.getRegistroC810().stream().forEach(registroC810 -> {
								sb = GerarRegistroC810.gerar(registroC810, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC810);
							});
						}

						// REGISTROC820
						if (!Util.isEmpty(registroC800.getRegistroC820())) {
							registroC800.getRegistroC820().stream().forEach(registroC820 -> {
								sb = GerarRegistroC820.gerar(registroC820, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC820);
							});
						}
						// REGISTROC830
						if (!Util.isEmpty(registroC800.getRegistroC830())) {
							registroC800.getRegistroC830().stream().forEach(registroC830 -> {
								sb = GerarRegistroC830.gerar(registroC830, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC830);
							});
						}
					});
				}

				// REGISTROC860
				if (!Util.isEmpty(registroC010.getRegistroC860())) {
					registroC010.getRegistroC860().stream().forEach(registroC860 -> {
						sb = GerarRegistroC860.gerar(registroC860, sb);
						efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC860);

						// REGISTROC870
						if (!Util.isEmpty(registroC860.getRegistroC870())) {
							registroC860.getRegistroC870().stream().forEach(registroC870 -> {
								sb = GerarRegistroC870.gerar(registroC870, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC870);
							});
						}

						// REGISTROC880
						if (!Util.isEmpty(registroC860.getRegistroC880())) {
							registroC860.getRegistroC880().stream().forEach(registroC880 -> {
								sb = GerarRegistroC880.gerar(registroC880, sb);
								efdContribuicoes.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC880);
							});
						}
						// REGISTROC890
						if (!Util.isEmpty(registroC860.getRegistroC890())) {
							registroC860.getRegistroC890().stream().forEach(registroC890 -> {
								sb = GerarRegistroC890.gerar(registroC890, sb);
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
			sb = GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
