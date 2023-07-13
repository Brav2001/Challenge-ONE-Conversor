package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class MilimetroTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor/1000000;
    }

    @Override
    public double Metro(double valor) {
        return valor/1000;
    }

    @Override
    public double Centimetro(double valor) {
        return valor/10;
    }

    @Override
    public double Milimetro(double valor) {
        return valor;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*1000;
    }

    @Override
    public double Nanometro(double valor) {
        return valor*1000000;
    }

    @Override
    public double Milla(double valor) {
        return valor/1609000;
    }

    @Override
    public double Yarda(double valor) {
        return valor/914.4;
    }

    @Override
    public double Pie(double valor) {
        return valor/304.8;
    }

    @Override
    public double Pulgada(double valor) {
        return valor/ 25.4;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/1852000;
    }
}
