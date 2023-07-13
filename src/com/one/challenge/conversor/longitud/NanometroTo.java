package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class NanometroTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        Long val = 1000000000000L;
        return valor/val;
    }

    @Override
    public double Metro(double valor) {
        return valor/1000000000;
    }

    @Override
    public double Centimetro(double valor) {
        return valor/10000000;
    }

    @Override
    public double Milimetro(double valor) {
        return valor/1000000;
    }

    @Override
    public double Micrometro(double valor) {
        return valor/1000;
    }

    @Override
    public double Nanometro(double valor) {
        return valor;
    }

    @Override
    public double Milla(double valor) {
        Long val=1609000000000L;
        return valor/val;
    }

    @Override
    public double Yarda(double valor) {
        return valor/914400000;
    }

    @Override
    public double Pie(double valor) {
        return valor/304800000;
    }

    @Override
    public double Pulgada(double valor) {
        return valor/25400000;
    }

    @Override
    public double MillaNautica(double valor) {
        Long val=1852000000000L;
        return valor/val;
    }
}
