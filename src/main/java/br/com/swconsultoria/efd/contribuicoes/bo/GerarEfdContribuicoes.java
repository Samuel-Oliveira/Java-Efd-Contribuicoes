package br.com.swconsultoria.efd.contribuicoes.bo;

import br.com.swconsultoria.efd.contribuicoes.bo.bloco0.GerarBloco0;
import br.com.swconsultoria.efd.contribuicoes.bo.bloco0.GerarContadoresBloco0;
import br.com.swconsultoria.efd.contribuicoes.bo.bloco1.GerarBloco1;
import br.com.swconsultoria.efd.contribuicoes.bo.bloco1.GerarContadoresBloco1;
import br.com.swconsultoria.efd.contribuicoes.bo.bloco9.GerarBloco9;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoA.GerarBlocoA;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoA.GerarContadoresBlocoA;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoC.GerarBlocoC;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoC.GerarContadoresBlocoC;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoD.GerarBlocoD;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoD.GerarContadoresBlocoD;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoF.GerarBlocoF;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoF.GerarContadoresBlocoF;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoI.GerarBlocoI;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoI.GerarContadoresBlocoI;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoM.GerarBlocoM;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoM.GerarContadoresBlocoM;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoP.GerarBlocoP;
import br.com.swconsultoria.efd.contribuicoes.bo.blocoP.GerarContadoresBlocoP;
import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 29/11/2017 - 14:23
 */
public class GerarEfdContribuicoes {

    public static StringBuilder gerar(EfdContribuicoes efdIcmsContribuicoes, StringBuilder sb){

        //BLOCO0
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco0())){
            GerarBloco0.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBloco0.gerar(efdIcmsContribuicoes);
        }

        //BLOCOA
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoA())){
            GerarBlocoA.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoA.gerar(efdIcmsContribuicoes);
        }

        //BLOCOC
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoC())){
            GerarBlocoC.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoC.gerar(efdIcmsContribuicoes);
        }

        //BLOCOD
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoD())){
            GerarBlocoD.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoD.gerar(efdIcmsContribuicoes);
        }

        //BLOCOF
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoF())){
            GerarBlocoF.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoF.gerar(efdIcmsContribuicoes);
        }

        //BLOCOI
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoI())){
            GerarBlocoI.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoI.gerar(efdIcmsContribuicoes);
        }

        //BLOCOM
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoM())){
            GerarBlocoM.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoM.gerar(efdIcmsContribuicoes);
        }

        //BLOCOP
        if(!Util.isEmpty(efdIcmsContribuicoes.getBlocoP())){
            GerarBlocoP.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBlocoP.gerar(efdIcmsContribuicoes);
        }

        //BLOCO1
        if(!Util.isEmpty(efdIcmsContribuicoes.getBloco1())){
            GerarBloco1.gerar(efdIcmsContribuicoes, sb);
            GerarContadoresBloco1.gerar(efdIcmsContribuicoes);
        }

        //BLOCO9
        Registro9001 registro9001 = new Registro9001();
        registro9001.setInd_mov("0");
        efdIcmsContribuicoes.getBloco9().setRegistro9001(registro9001);
        GerarBloco9.gerar(efdIcmsContribuicoes.getBloco9(), sb);

        //Nova Linha ao Final do Arquivo:
        sb.append(System.lineSeparator());

        return sb;
    }
}