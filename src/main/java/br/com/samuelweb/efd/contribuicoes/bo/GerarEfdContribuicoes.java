package br.com.samuelweb.efd.contribuicoes.bo;

import br.com.samuelweb.efd.contribuicoes.bo.bloco0.GerarBloco0;
import br.com.samuelweb.efd.contribuicoes.bo.bloco1.GerarBloco1;
import br.com.samuelweb.efd.contribuicoes.bo.bloco9.GerarBloco9;
import br.com.samuelweb.efd.contribuicoes.bo.blocoA.GerarBlocoA;
import br.com.samuelweb.efd.contribuicoes.bo.blocoC.GerarBlocoC;
import br.com.samuelweb.efd.contribuicoes.bo.blocoD.GerarBlocoD;
import br.com.samuelweb.efd.contribuicoes.bo.blocoF.GerarBlocoF;
import br.com.samuelweb.efd.contribuicoes.bo.blocoI.GerarBlocoI;
import br.com.samuelweb.efd.contribuicoes.bo.blocoM.GerarBlocoM;
import br.com.samuelweb.efd.contribuicoes.bo.blocoP.GerarBlocoP;
import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.registros.bloco9.Registro9001;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 29/11/2017 - 14:23
 */
public class GerarEfdContribuicoes {

    public static StringBuilder gerar(EfdContribuicoes efdIcmsContribuicoes, StringBuilder sb){

        //BLOCO0
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco0())){
            GerarBloco0.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOA
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoA())){
            GerarBlocoA.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOC
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoC())){
            GerarBlocoC.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOD
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoD())){
            GerarBlocoD.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOF
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoF())){
            GerarBlocoF.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOI
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoI())){
            GerarBlocoI.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOM
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoM())){
            GerarBlocoM.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCOP
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoP())){
            GerarBlocoP.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCO1
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco1())){
            GerarBloco1.gerar(efdIcmsContribuicoes, sb);
        }

        //BLOCO9
        Registro9001 registro9001 = new Registro9001();
        registro9001.setInd_mov("0");
        efdIcmsContribuicoes.getBloco9().setRegistro9001(registro9001);
        GerarBloco9.gerar(efdIcmsContribuicoes.getBloco9(), sb);

        return sb;
    }
}
