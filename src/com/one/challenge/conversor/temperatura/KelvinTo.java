package com.one.challenge.conversor.temperatura;

/**
 * @author Brayan_Acosta_Vivas
 */

import com.one.challenge.conversor.utilities.Response;

public class KelvinTo implements TemperaturaInterface {


    @Override
    public Response Kelvin(double valor) {
        Response response = new Response();
        response.setValor(valor);
        response.setMessage(null);
        return response;
    }

    @Override
    public Response Celsius(double valor) {
        Response response = new Response();
        response.setValor((valor - 273.15));
        response.setMessage("Reste al valor 273.15");
        return response;
    }

    @Override
    public Response Fahrenheit(double valor) {
        Response response = new Response();
        response.setValor(((valor - 273.15)* 9/5 + 32));
        response.setMessage("([VALOR] − 273.15) × 9/5 + 32");
        return response;
    }

    @Override
    public Response Rankine(double valor) {
        Response response = new Response();
        response.setValor(valor*1.8);
        response.setMessage("Multiplique por 1.8");
        return response;
    }

    @Override
    public Response Reaumur(double valor) {
        Response response = new Response();
        response.setValor((4*(valor - 273.15) / 5));
        response.setMessage("(4*([VALOR] - 273.15) / 5)");
        return response;
    }
}
