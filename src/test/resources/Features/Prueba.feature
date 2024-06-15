#language: es
@Regresionlogin
Característica: Yo como usuario quiero calcular la tasa nominal efectiva
  @Loguearme
  Esquema del escenario: Acceder a la url de la prueba
    Dado que ingreso a la url de la prueba
    Cuando ingreso los datos de "<tasaInteres>" y el resto de los campos
    Entonces confirmo el "<mensaje>" que me devuelve el calculo
    Ejemplos:
      |usuario|password|mensaje|
  ##@externaldata@src/test/resources/Datadriven/Ejercicio.xlsx@ejercicio
|traductor|hola|hello|

