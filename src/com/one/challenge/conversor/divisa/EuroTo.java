package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class EuroTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor * 4549.83;
    }

    @Override
    public double Dolar(double valor) {
        return (valor * 1.09);
    }

    @Override
    public double Euro(double valor) {
        return (valor);
    }

    @Override
    public double Gbp(double valor) {
        return (valor * 0.85);
    }

    @Override
    public double Jpy(double valor) {
        return (valor * 156.83);
    }

    @Override
    public double Krw(double valor) {
        return (valor * 1423.45);
    }
}
