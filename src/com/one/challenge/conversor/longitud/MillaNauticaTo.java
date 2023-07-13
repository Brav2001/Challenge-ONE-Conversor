package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class MillaNauticaTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor*1.852;
    }

    @Override
    public double Metro(double valor) {
        return valor*1852;
    }

    @Override
    public double Centimetro(double valor) {
        return valor*185200;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*1852000;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*1852000000;
    }

    @Override
    public double Nanometro(double valor) {
        Long val=1852000000000L;
        return valor*val;
    }

    @Override
    public double Milla(double valor) {
        return valor*1.151;
    }

    @Override
    public double Yarda(double valor) {
        return valor*2025;
    }

    @Override
    public double Pie(double valor) {
        return valor*6076;
    }

    @Override
    public double Pulgada(double valor) {
        return valor*72910;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor;
    }
}
