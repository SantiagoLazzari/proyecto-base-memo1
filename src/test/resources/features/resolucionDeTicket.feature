# language: es
Característica: Creacion de cuenta    

	Escenario: Creacion de ticket sin asigancion
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando pasan "4" dias
		Entonces el estado del ticket es "pendiente"

	Escenario: Creacion de ticket y expiracion de avanzada pero no de basico
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "avanzada"
		Cuando pasan "4" dias
		Entonces el estado del ticket es "limite excedido"


	Escenario: Creacion de ticket y expiracion de basico
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando pasan "7" dias
		Entonces el estado del ticket es "limite excedido"
		
	Escenario: Creacion de ticket y expiracion de avanzada pero no de basico
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "avanzada"
		Cuando pasan "2" dias
		Entonces el estado del ticket es "pendiente"
		
	Escenario: Creacion de ticket y asignacion
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Entonces el estado del ticket es "en progreso"


	Escenario: Creacion de ticket asignacion y expiracion de basico
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "7" dias
		Entonces el estado del ticket es "limite excedido"


	Escenario: Creacion de ticket asignacion y completitud
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "5" dias
		Cuando el operador marca el ticket como completado
		Entonces el estado del ticket es "completado"

	Escenario: Creacion de ticket asignacion y completitud hasta luego de haber pasado el limite de dias
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "5" dias
		Cuando el operador marca el ticket como completado
		Cuando pasan "10" dias
		Entonces el estado del ticket es "completado"


	Escenario: Creacion de ticket asignacion y cancelacion
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "5" dias
		Cuando el operador marca el ticket como cancelado
		Entonces el estado del ticket es "cancelado"
		
	Escenario: Creacion de ticket asignacion y cancelacion hasta luego de haber pasado el limite de dias
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "5" dias
		Cuando el operador marca el ticket como cancelado
		Cuando pasan "10" dias
		Entonces el estado del ticket es "cancelado"


	Escenario: Creacion de ticket asignacion y excedido el limite y completitud
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "10" dias
		Cuando el operador marca el ticket como completado
		Entonces el estado del ticket es "limite excedido"

	Escenario: Creacion de ticket asignacion y excedido el limite y cancelacion
		Dado que el paquete de resolucion de incidentes tiene limite de "6" para la categoria basica, "3" para la categoria avanzada y "1" para la categoria urgente 
		Cuando creo un ticket en la categoria "basica"
		Cuando le asigno el ticket a "Pepe"
		Cuando pasan "10" dias
		Cuando el operador marca el ticket como cancelado
		Entonces el estado del ticket es "limite excedido"

		