
package com.one.challenge.conversor.temperatura;
/**
 * @author Brayan_Acosta_Vivas
 */

import com.one.challenge.conversor.utilities.Response;

public class CelsiusTo implements TemperaturaInterface {

    @Override
    public Response Kelvin(double valor) {
        Response response = new Response();
        response.setValor((valor + 273.15));
        response.setMessage("Sume 273.15 al valor");
        return response;
    }

    @Override
    public Response Celsius(double valor) {
        Response response = new Response();
        response.setValor(valor);
        response.setMessage(null);
        return response;
    }

    @Override
    public Response Fahrenheit(double valor) {
        Response response = new Response();
        response.setValor(((valor * 9/5) + 32));
        response.setMessage("(([VALOR] * 9/5) + 32)");
        return response;
    }

    @Override
    public Response Rankine(double valor) {
        Response response = new Response();
        response.setValor((valor * 9/5 + 491.67));
        response.setMessage("([VALOR] * 9/5 + 491.67)");
        return response;
    }

    @Override
    public Response Reaumur(double valor) {
        Response response = new Response();
        response.setValor((4 * valor / 5));
        response.setMessage("(4 * [VALOR] / 5)");
        return response;
    }
}
