package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class PulgadaTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor/39370;
    }

    @Override
    public double Metro(double valor) {
        return valor/ 39.37;
    }

    @Override
    public double Centimetro(double valor) {
        return valor*2.54;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*25.4;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*25400;
    }

    @Override
    public double Nanometro(double valor) {
        return valor*25400000;
    }

    @Override
    public double Milla(double valor) {
        return valor/63360;
    }

    @Override
    public double Yarda(double valor) {
        return valor/36;
    }

    @Override
    public double Pie(double valor) {
        return valor/12;
    }

    @Override
    public double Pulgada(double valor) {
        return valor;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/72910;
    }
}
