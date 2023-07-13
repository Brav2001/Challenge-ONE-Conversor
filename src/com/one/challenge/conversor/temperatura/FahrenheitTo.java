package com.one.challenge.conversor.temperatura;

/**
 * @author Brayan_Acosta_Vivas
 */
import com.one.challenge.conversor.utilities.Response;

public class FahrenheitTo implements TemperaturaInterface {

    @Override
    public Response Kelvin(double valor) {
        Response response = new Response();
        response.setValor(((valor  - 32) * 5/9 + 273.15));
        response.setMessage("(([VALOR]  - 32) * 5/9 + 273.15)");
        return response;
    }

    @Override
    public Response Celsius(double valor) {
        Response response = new Response();
        response.setValor(((valor - 32) * 5/9));
        response.setMessage("(([VALOR] - 32) * 5/9)");
        return response;
    }

    @Override
    public Response Fahrenheit(double valor) {
        Response response = new Response();
        response.setValor(valor);
        response.setMessage(null);
        return response;
    }

    @Override
    public Response Rankine(double valor) {
        Response response = new Response();
        response.setValor((valor + 459.67));
        response.setMessage("Sume 459.67 al valor ");
        return response;
    }

    @Override
    public Response Reaumur(double valor) {
        Response response = new Response();
        response.setValor(((valor - 32) * 0.44444));
        response.setMessage("(([VALOR] - 32) * 0.44444)");
        return response;
    }
}
