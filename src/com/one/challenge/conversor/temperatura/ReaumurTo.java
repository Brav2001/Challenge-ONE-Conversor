package com.one.challenge.conversor.temperatura;

/**
 * @author Brayan_Acosta_Vivas
 */
import com.one.challenge.conversor.utilities.Response;

public class ReaumurTo implements TemperaturaInterface {

    @Override
    public Response Kelvin(double valor) {
        Response response = new Response();
        response.setValor((valor/0.8 + 273.15));
        response.setMessage("([VALOR]/0.8 + 273.15)");
        return response;
    }

    @Override
    public Response Celsius(double valor) {
        Response response = new Response();
        response.setValor((valor/0.8));
        response.setMessage("Divida el valor entre 0.8");
        return response;
    }

    @Override
    public Response Fahrenheit(double valor) {
        Response response = new Response();
        response.setValor((valor * 2.2500+ 32.00));
        response.setMessage("([VALOR] * 2.2500+ 32.00)");
        return response;
    }

    @Override
    public Response Rankine(double valor) {
        Response response = new Response();
        response.setValor((valor * 2.2500+ 491.67));
        response.setMessage("([VALOR] * 2.2500+ 491.67)");
        return response;
    }

    @Override
    public Response Reaumur(double valor) {
        Response response = new Response();
        response.setValor(valor);
        response.setMessage(null);
        return response;
    }
}
