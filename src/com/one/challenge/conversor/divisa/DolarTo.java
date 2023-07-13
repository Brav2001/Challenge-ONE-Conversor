package com.one.challenge.conversor.divisa;

/**
 * @author Brayan_Acosta_Vivas
 */

public class DolarTo implements DivisaInterface {
    @Override
    public double Cop(double valor) {
        return valor * 4180;
    }

    @Override
    public double Dolar(double valor) {
        return valor;
    }

    @Override
    public double Euro(double valor) {
        return (valor * 0.92);
    }

    @Override
    public double Gbp(double valor) {
        return (valor * 0.79);
    }

    @Override
    public double Jpy(double valor) {
        return (valor * 144.12);
    }

    @Override
    public double Krw(double valor) {
        return (valor * 1308.45);
    }
}
