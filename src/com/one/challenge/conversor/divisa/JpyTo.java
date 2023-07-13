package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class JpyTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor * 29.01;
    }

    @Override
    public double Dolar(double valor) {
        return (valor * 0.0069);
    }

    @Override
    public double Euro(double valor) {
        return (valor * 0.0064);
    }

    @Override
    public double Gbp(double valor) {
        return (valor * 0.0055);
    }

    @Override
    public double Jpy(double valor) {
        return (valor);
    }

    @Override
    public double Krw(double valor) {
        return (valor * 9.08);
    }
}
