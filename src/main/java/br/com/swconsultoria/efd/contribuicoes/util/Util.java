package br.com.swconsultoria.efd.contribuicoes.util;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Collection;

import br.com.swconsultoria.efd.contribuicoes.exception.EfdException;
import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;

public final class Util {


	private final static LocalDate dataVersao2018 = LocalDate.of(2017, 12, 31);
	private final static LocalDate dataVersao2019 = LocalDate.of(2018, 12, 31);
	private final static LocalDate dataVersao2020 = LocalDate.of(2019, 12, 31);

	/**
	 * Construtor privado para garantir o Singleton.
	 */
	private Util() {

	}

	/**
	 * Verifica se um objeto está vazio.
	 * 
	 * @param obj
	 * @return <b>true</b> se o objeto for vazio(empty).
	 */
    public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof Collection)
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}
    
    /**
	 * Preenche o Registro
	 * 
	 * @param String
	 */
    public static String preencheRegistro(String string) {
    	return Util.isEmpty(string)? "" : string;
	}
    
    /**
     * Cria um arquivo com os dados passados 
     * @throws Exception 
     */
    public static void criarPastaArquivo(String pasta, String arquivo , String conteudo ) throws EfdException {
    	
    	File folder = new File(pasta);
    	if(!folder.exists()){
    		folder.mkdirs();
    	}
    	
    	FileWriter fileWriter;
    	try {
    		fileWriter = new FileWriter(new File(pasta+"/"+arquivo));
    		fileWriter.write(conteudo);
    		fileWriter.close();
    	} catch (Exception e) {
    		throw new EfdException("Erro ao Criar Arquivo "+e.getMessage());    		
    	}
    }

	private static LocalDate strToDate(String dataStr) {
		return LocalDate.of(Integer.parseInt(dataStr.substring(4, 8)), Integer.parseInt(dataStr.substring(2, 4)), Integer.parseInt(dataStr.substring(0, 2)));
	}


	public static boolean versao2018(String dataStr) {
		return strToDate(dataStr).isAfter(dataVersao2018);
	}

	public static boolean versao2019(String dataStr) {
		return strToDate(dataStr).isAfter(dataVersao2019);
	}

	public static boolean versao2020(String dataStr) {
		return strToDate(dataStr).isAfter(dataVersao2020);
	}

	public static String getCodVersao(EfdContribuicoes efdContribuicoes) {
		if (versao2020(efdContribuicoes.getBloco0().getRegistro0000().getDt_ini())) {
			return "006";
		} else if (versao2019(efdContribuicoes.getBloco0().getRegistro0000().getDt_ini())) {
			return "005";
		} else if (versao2018(efdContribuicoes.getBloco0().getRegistro0000().getDt_ini())) {
			return "004";
		} else {
			return "003";
		}
	}
    
   
}