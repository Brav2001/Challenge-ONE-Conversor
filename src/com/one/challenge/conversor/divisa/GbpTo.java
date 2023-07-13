package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class GbpTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor * 5257.19;
    }

    @Override
    public double Dolar(double valor) {
        return (valor * 1.27);
    }

    @Override
    public double Euro(double valor) {
        return (valor * 1.17);
    }

    @Override
    public double Gbp(double valor) {
        return (valor);
    }

    @Override
    public double Jpy(double valor) {
        return (valor * 183.47);
    }

    @Override
    public double Krw(double valor) {
        return (valor * 1665.10);
    }
}
