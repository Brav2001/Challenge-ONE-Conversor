package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class MillaTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor * 1.609;
    }

    @Override
    public double Metro(double valor) {
        return valor * 1609;
    }

    @Override
    public double Centimetro(double valor) {
        return valor*160900;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*1609000;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*1609000000;
    }

    @Override
    public double Nanometro(double valor) {
        Long val=1609000000000L;
        return valor*val;
    }

    @Override
    public double Milla(double valor) {
        return valor;
    }

    @Override
    public double Yarda(double valor) {
        return valor *1760;
    }

    @Override
    public double Pie(double valor) {
        return valor*5280;
    }

    @Override
    public double Pulgada(double valor) {
        return valor* 63360;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/1.151;
    }
}
