package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class YardaTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor/1094;
    }

    @Override
    public double Metro(double valor) {
        return valor/1.094;
    }

    @Override
    public double Centimetro(double valor) {
        return valor*91.44;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*914.4;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*914400;
    }

    @Override
    public double Nanometro(double valor) {
        return valor*914400000;
    }

    @Override
    public double Milla(double valor) {
        return valor/1760;
    }

    @Override
    public double Yarda(double valor) {
        return valor;
    }

    @Override
    public double Pie(double valor) {
        return valor*3;
    }

    @Override
    public double Pulgada(double valor) {
        return valor*36;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/2025;
    }
}
