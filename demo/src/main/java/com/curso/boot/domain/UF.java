package com.curso.boot.domain;

public enum UF {

    AC(sigla: "AC", descricao: "Acre"),
    AL(sigla: "AL", descricao: "Alagoas"),
    AM(sigla: "AM", descricao: "Amazonas"),
    BA(sigla: "BA", descricao: "Bahia"),
    CE(sigla: "CE", descricao: "Ceará"),
    DF(sigla: "DF", descricao: "Distrito Federal"),
    ES(sigla: "ES", descricao: "Espírito Santos"),
    GO(sigla: "GO", descricao: "Goiás"),
    MA(sigla: "MA", descricao: "Maranhão"),
    MT(sigla: "MT", descricao: "Mato Grosso"),
    MS(sigla: "MS", descricao: "Mato Grosso do Sul"),
    MG(sigla: "MG", descricao: "Minas Gerais"),
    PA(sigla: "PA", descricao: "Pará"),
    PB(sigla: "PB", descricao: "Paraíba"),
    PR(sigla: "PR", descricao: "Paraná"),
    PE(sigla: "PE", descricao: "Pernambuco"),
    PI(sigla: "PI", descricao: "Piauí"),
    RJ(sigla: "RJ", descricao: "Rio de Janeiro"),
    RN(sigla: "RN", descricao: "Rio Grande do Norte"),
    RS(sigla: "RS", descricao: "Rio Grande do Sul"),
    RO(sigla: "RO", descricao: "Rondônia"),
    RR(sigla: "RR", descricao: "Roraima"),
    SC(sigla: "SC", descricao: "Santa Catarina"),
    SP(sigla: "SP", descricao: "São Paulo"),
    SE(sigla: "SE", descricao: "Segipe"),
    TO(sigla: "TO", descricao: "Tocantins");

    private static String sigla;
    private String descricao;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String setDescricao(String descricao) {
        this.descricao = descricao;
    }

    UF(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

}
