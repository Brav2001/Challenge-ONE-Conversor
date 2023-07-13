package com.one.challenge.conversor.longitud;
/**
 * @author Brayan_Acosta_Vivas
 */
public class CentimetroTo implements LongitudInterface {
    @Override
    public double Kilometro(double valor) {
        return valor/100000;
    }

    @Override
    public double Metro(double valor) {
        return valor/100;
    }

    @Override
    public double Centimetro(double valor) {
        return valor;
    }

    @Override
    public double Milimetro(double valor) {
        return valor*10;
    }

    @Override
    public double Micrometro(double valor) {
        return valor*10000;
    }

    @Override
    public double Nanometro(double valor) {
        return valor*10000000;
    }

    @Override
    public double Milla(double valor) {
        return valor/160900;
    }

    @Override
    public double Yarda(double valor) {
        return valor/91.44;
    }

    @Override
    public double Pie(double valor) {
        return valor/30.48;
    }

    @Override
    public double Pulgada(double valor) {
        return valor/2.54;
    }

    @Override
    public double MillaNautica(double valor) {
        return valor/185200;
    }
}
