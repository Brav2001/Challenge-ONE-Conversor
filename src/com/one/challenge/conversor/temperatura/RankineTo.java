package com.one.challenge.conversor.temperatura;
/**
 * @author Brayan_Acosta_Vivas
 */

import com.one.challenge.conversor.utilities.Response;

public class RankineTo implements TemperaturaInterface {

    @Override
    public Response Kelvin(double valor) {
        Response response = new Response();
        response.setValor((valor * 5/9));
        response.setMessage("Multiplique el valor por 5/9");
        return response;
    }

    @Override
    public Response Celsius(double valor) {
        Response response = new Response();
        response.setValor(((valor - 491.67) * 5/9));
        response.setMessage("(([VALOR] - 491.67) * 5/9)");
        return response;
    }

    @Override
    public Response Fahrenheit(double valor) {
        Response response = new Response();
        response.setValor((valor - 459.67));
        response.setMessage("Reste 459.67 al valor");
        return response;
    }

    @Override
    public Response Rankine(double valor) {
        Response response = new Response();
        response.setValor(valor);
        response.setMessage(null);
        return response;
    }

    @Override
    public Response Reaumur(double valor) {
        Response response = new Response();
        response.setValor(((valor - 491.67)* 0.44444));
        response.setMessage("(([VALOR] - 491.67)* 0.44444)");
        return response;
    }
}
