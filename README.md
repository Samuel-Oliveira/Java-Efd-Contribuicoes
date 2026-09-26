# Java-Efd-Contribuicoes [![MIT License](https://img.shields.io/github/license/Samuel-Oliveira/Java-Efd-Contribuicoes.svg) ](https://github.com/Samuel-Oliveira/Java-Efd-Contribuicoes/blob/master/LICENSE) [![Maven Central](https://img.shields.io/maven-central/v/br.com.swconsultoria/java-efd-contribuicoes.svg?label=Maven%20Central)](https://search.maven.org/artifact/br.com.swconsultoria/java-efd-contribuicoes/1.32.2/jar)
Projeto Para implementação de Efd-Contribuições(Escrituação Fiscal Digital Pis/Cofins) em ambientes Java de Forma Facilitada.

## Dúvidas, Sugestões ou Consultoria
[![Java Brasil](https://discordapp.com/api/guilds/519583346066587676/widget.png?style=banner2)](https://discord.gg/ZXpqnaV)

## Gostou do Projeto? Dê sua colaboração pelo Pix: 01713390108
<img src="https://swconsultoria.com.br/pix.png" width="200">

A Lib abstrai toda a geração dos registros, sendo necessario apenas o preenchimento dos mesmos.
Os Registros de Quantidade de Linhas e quantidades de Registros(Bloco 9) são calculados e gerados automaticamente pela Lib.


Para Iniciar : 
- Caso use Libs baixe o java-efd-contribuicoes-1.32.2.jar (https://github.com/Samuel-Oliveira/Java-Efd-Contribuicoes/raw/master/java-efd-contribuicoes-1.32.2.jar) e o adicione às bibliotecas de Seu Projeto.

- Caso use Maven :
```
<dependency>
  <groupId>br.com.swconsultoria</groupId>
  <artifactId>java-efd-contribuicoes</artifactId>
  <version>1.32.2</version>
</dependency>
```

Veja a Wiki https://github.com/Samuel-Oliveira/Java-Efd-Contribuicoes/wiki, para ter um Tutorial Completo.
________________________________________________________________________________________________

# Historico de Versões

## v1.32.2 - 26/09/2026
- Corrigida condição de corrida: as classes internas de geração de bloco (`GerarBloco0/1/9/A/C/D/F/I/M/P`) guardavam o acumulador de saída e o contador do Bloco 9 em campos `static`, então duas gerações simultâneas na mesma JVM podiam trocar linhas entre si ou corromper a contagem de `QTD_LIN_9`. Os campos foram removidos e o estado passou a ser local a cada chamada. Não há mudança de API nem de comportamento em uso sequencial: a saída gerada é byte a byte idêntica à da versão 1.32.1.

## v1.32.1 - 12/11/2023
- Corrigido VL_CRED_APU duplicado - Registro 1100

## v1.32.0 - 27/07/2023
- Re Upado para Maven

## v1.31.0 - 08/05/2019
- Disponibilizado para Comunidade
