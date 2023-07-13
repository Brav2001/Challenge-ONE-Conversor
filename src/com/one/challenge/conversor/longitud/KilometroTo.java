package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class KilometroTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor;
    }

    @Override
    public double Metro(double valor) {
        return valor * 1000;
    }

    @Override
    public double Centimetro(double valor) {
        return valor * 100000;
    }

    @Override
    public double Milimetro(double valor) {
        return valor * 1000000;
    }

    @Override
    public double Micrometro(double valor) {
        return valor * 1000000000;
    }

    @Override
    public double Nanometro(double valor) {
        Long val= 1000000000000L;
        return valor * val;
    }

    @Override
    public double Milla(double valor) {
        return valor / 1.609;
    }

    @Override
    public double Yarda(double valor) {
        return valor * 1094;
    }

    @Override
    public double Pie(double valor) {
        return valor * 3281;
    }

    @Override
    public double Pulgada(double valor) {
        return valor * 39370;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/1.852;
    }
}
