package com.example;

public class Token {
    enum Tipo{NUMERO, OPERADOR, PARENTESIS, IDENTIFICADOR, PALABRA_RESERVADA}

    private Tipo tipo;
    private String valor;

    public Token(Tipo tipo, String valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public Tipo getTipo(){return tipo;}
    public String getValor(){return valor;}

    @Override
    public String toString(){
        return "Token [tipo=" + tipo + ", valor=" + valor + "]";
    }
}
