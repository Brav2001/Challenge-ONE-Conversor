package com.one.challenge.conversor.longitud;

/**
 * @author Brayan_Acosta_Vivas
 */

public class PieTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor/3281;
    }

    @Override
    public double Metro(double valor) {
        return valor/3.281;
    }

    @Override
    public double Centimetro(double valor) {
        return valor*30.48;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*304.8;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*304800;
    }

    @Override
    public double Nanometro(double valor) {
        return valor*304800000;
    }

    @Override
    public double Milla(double valor) {
        return valor/ 5280;
    }

    @Override
    public double Yarda(double valor) {
        return valor/3;
    }

    @Override
    public double Pie(double valor) {
        return valor;
    }

    @Override
    public double Pulgada(double valor) {
        return valor*12;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/6076;
    }
}
