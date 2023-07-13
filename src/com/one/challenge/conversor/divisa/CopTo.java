package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class CopTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor;
    }

    @Override
    public double Dolar(double valor) {
        return (valor * 0.00024);
    }

    @Override
    public double Euro(double valor) {
        return (valor * 0.00022);
    }

    @Override
    public double Gbp(double valor) {
        return (valor * 00.00019);
    }

    @Override
    public double Jpy(double valor) {
        return (valor * 0.035);
    }

    @Override
    public double Krw(double valor) {
        return (valor * 0.32);
    }
}
