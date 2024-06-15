package Pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://https/www.grupobancolombia.com/")
public class LoginPageObjets2 extends PageObject {
    //Todos los selectores fueron inventados, no me abre la url del flujo a automatizar
    @FindBy(id = "Negocios")
    public WebElementFacade BtnNegocios;

    @FindBy(id = "Herramientas")
    public WebElementFacade BtnHerramientas;

    @FindBy(xpath  = "//*[contains(text(),'“Gestionar las finanzas de mi negocio”')]")
    public WebElementFacade BtnGestionarFinanzas;

    @FindBy(xpath = "//*[contains(text(),'“Convertidor de tasas de interés”')]")
    public WebElementFacade OpcionConvTasaInteres;

    @FindBy(xpath = "//*[contains(text(),'“De tasa nominal a tasa efectiva”')]")
    public WebElementFacade BtnCalcular;

    @FindBy(id = "tasaInteres")
    public WebElementFacade TxtTasaInteres;

    @FindBy(id = "periodicidadDeseada")
    public WebElementFacade ComboPeriodisidad;

    @FindBy(id = "capitalizacion")
    public WebElementFacade Combocapitalizacion;

    @FindBy(xpath  = "//*[contains(text(),'es el resultado de acuerdo con los párametros que ingresaste.')]")
    public WebElementFacade TextoResultado;

    public void Prueba (){

        BtnNegocios.click();
        // Espera hasta que BtnHerramientas sea clickable
        WebDriverWait wait = new WebDriverWait(driver, 30); // Espera hasta 30 segundos
        wait.until(ExpectedConditions.elementToBeClickable(BtnHerramientas));
        BtnHerramientas.click();
        // Espera hasta que BtnGestionarFinanzas sea clickable
        WebDriverWait wait = new WebDriverWait(driver, 30); // Espera hasta 30 segundos
        wait.until(ExpectedConditions.elementToBeClickable(BtnGestionarFinanzas));
        BtnGestionarFinanzas.click();
        // Espera hasta que OpcionConvTasaInteres sea clickable
        WebDriverWait wait = new WebDriverWait(driver, 30); // Espera hasta 30 segundos
        wait.until(ExpectedConditions.elementToBeClickable(OpcionConvTasaInteres));
        OpcionConvTasaInteres.click();
        // Espera hasta que BtnCalcular sea clickable
        WebDriverWait wait = new WebDriverWait(driver, 30); // Espera hasta 30 segundos
        wait.until(ExpectedConditions.elementToBeClickable(BtnCalcular));
        BtnCalcular.click();
        TxtTasaInteres.click();
        TxtTasaInteres.sendKeys(10);
        ComboPeriodisidad.click();
        Select selectPeriodisidad = new Select(ComboPeriodisidad);
        selectPeriodisidad.selectByIndex(0); // Seleccionar el primer elemento
        Combocapitalizacion.click();
        Select selectCapitalizacion = new Select(Combocapitalizacion);
        selectCapitalizacion.selectByIndex(0); // Seleccionar el primer elemento
    }
    public void ValidarResultado(String MensajeEsperado){
        String MensajeEsperado "es el resultado de acuerdo con los párametros que ingresaste.";
        String MensajeObtenido = (TextoResultado).getText();
        Assert.assertEquals(MensajeObtenido,MensajeEsperado);

    }

}
