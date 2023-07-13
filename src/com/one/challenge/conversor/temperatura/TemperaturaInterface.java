package com.one.challenge.conversor.temperatura;
/**
 * @author Brayan_Acosta_Vivas
 */

import com.one.challenge.conversor.utilities.Response;

public interface TemperaturaInterface {
    Response Kelvin (double valor);
    Response Celsius (double valor);
    Response Fahrenheit (double valor);
    Response Rankine (double valor);
    Response Reaumur (double valor);
}
