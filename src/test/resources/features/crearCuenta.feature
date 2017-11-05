# language: es
Característica: Creacion de cuenta

  Escenario: Creacion de caja de ahorro
    Dado que me creo una cuenta con el cbu "123123"
    Cuando cuando consulto el saldo de "123123"
    Entonces el saldo final de "123123" es de "0" pesos   
    
