package StepsDefinitions;

import Pageobjects.LoginPageObjets2;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinitions {
    LoginPageObjets2 loginPageObjets;
    @Dado("que ingreso a la url de la prueba")
    public void que_ingreso_a_la_url_de_la_prueba() {
        loginPageObjets.open();

    }
    @Cuando("ingreso los datos de {string} y el resto de los campos")
    public void ingreso_los_datos_de_y(String tasaInteres) {
        loginPageObjets.Prueba();

    }
    @Entonces("confirmo el {string} que me devuelve el calculo")
    public void confirmo_el_que_me_devuelve_el_calculo(String MensajeEsperado) {
        loginPageObjets.ValidarResultado(MensajeEsperado);

    }
}
