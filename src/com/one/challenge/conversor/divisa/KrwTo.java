package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class KrwTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor * 3.20;
    }

    @Override
    public double Dolar(double valor) {
        return (valor * 0.00076);
    }

    @Override
    public double Euro(double valor) {
        return (valor * 0.00070);
    }

    @Override
    public double Gbp(double valor) {
        return (valor * 00.00060);
    }

    @Override
    public double Jpy(double valor) {
        return (valor * 0.11);
    }

    @Override
    public double Krw(double valor) {
        return (valor);
    }
}
