package br.com.samuelweb.efd.contribuicoes.bo;

import br.com.samuelweb.efd.contribuicoes.bo.bloco0.GerarBloco0;
import br.com.samuelweb.efd.contribuicoes.bo.bloco1.GerarBloco1;
import br.com.samuelweb.efd.contribuicoes.bo.blocoA.GerarBlocoA;
import br.com.samuelweb.efd.contribuicoes.bo.blocoC.GerarBlocoC;
import br.com.samuelweb.efd.contribuicoes.bo.blocoD.GerarBlocoD;
import br.com.samuelweb.efd.contribuicoes.bo.blocoF.GerarBlocoF;
import br.com.samuelweb.efd.contribuicoes.bo.blocoI.GerarBlocoI;
import br.com.samuelweb.efd.contribuicoes.bo.blocoM.GerarBlocoM;
import br.com.samuelweb.efd.contribuicoes.bo.blocoP.GerarBlocoP;
import br.com.samuelweb.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 29/11/2017 - 14:23
 */
public class GerarEfdContribuicoes {

    public static StringBuilder gerar(EfdContribuicoes efdIcmsContribuicoes, StringBuilder sb){

        //BLOCO0
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco0())){
            sb = GerarBloco0.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBloco0.gerar(efdIcmsContribuicoes);
        }

        //BLOCOA
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoA())){
            sb = GerarBlocoA.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoC.gerar(efdIcmsContribuicoes);
        }

        //BLOCOC
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoC())){
            sb = GerarBlocoC.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoC.gerar(efdIcmsContribuicoes);
        }

        //BLOCOD
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoD())){
            sb = GerarBlocoD.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoD.gerar(efdIcmsContribuicoes);
        }

        //BLOCOF
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoF())){
            sb = GerarBlocoF.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoE.gerar(efdIcmsContribuicoes);
        }

        //BLOCOI
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoI())){
            sb = GerarBlocoI.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoG.gerar(efdIcmsContribuicoes);
        }

        //BLOCOM
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoM())){
            sb = GerarBlocoM.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoH.gerar(efdIcmsContribuicoes);
        }

        //BLOCOP
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoP())){
            sb = GerarBlocoP.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBlocoK.gerar(efdIcmsContribuicoes);
        }

        //BLOCO1
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco1())){
            sb = GerarBloco1.gerar(efdIcmsContribuicoes, sb);
//            efdIcmsContribuicoes = GerarContadoresBloco1.gerar(efdIcmsContribuicoes);
        }

        //BLOCO9
//        Registro9001 registro9001 = new Registro9001();
//        registro9001.setInd_mov("0");
//        efdIcmsContribuicoes.getBloco9().setRegistro9001(registro9001);
//        sb = GerarBloco9.gerar(efdIcmsContribuicoes.getBloco9(), sb);

        return sb;
    }
}
