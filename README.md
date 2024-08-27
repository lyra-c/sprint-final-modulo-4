# Evaluación Final Spring Módulo 4 Fundamentos de Programación Java
## Sistema de Información para Empresa de Asesorías en Prevención de Riesgos
# Integrantes:
     Nicolás Gajardo
     Jorge Lira
     Beatriz Maldonado
     Diego Rivera



## Índice

- [1. CONTEXTO](#1-CONTEXTO)
- [2. PROBLEMA](#2-PROBLEMA)
- [3. SOLUCIÓN](#3-SOLUCIÓN)
- [4. ESTRUCTURA DEL PROYECTO](#4-ESTRUCTURA_DEL_PROYECTO)
- [5. REQUISITOS DEL SISTEMA](#5-REQUISITOS_DEL_SISTEMA)
- [6. USO](#6-USO)

## 1. CONTEXTO

En la última década, han aumentado los índices de accidentabilidad, especialmente en las
empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las
leyes y normativas que obligan a las empresas a tomar todas las medidas necesarias para
protegerla vida y salud de los trabajadores. Para dar cumplimiento a la normativa y mantener
ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría
profesional, lo cual representa un costo elevado y fomenta la disminución o la no
implementación de medidas necesarias para la seguridad. Muchas de las empresas que han
optado por no invertir en asesoría preventiva, se ven expuestas a aplicación de multas de las
entidades fiscalizadoras, gastos por días perdidos en accidentabilidad, bajas en la producción,
alzas en el pago de cotizaciones (al organismo administrador del seguro de accidentes del
trabajo, ley 16.744), entre otros. Además, hay que considerar posibles demandas y pagos de
indemnizaciones a los trabajadores y familiares afectados por accidentes del trabajo.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos
laborales y necesita una solución tecnológica que ayude a administrar los procesos que se
deben ejecutar en cada una de las empresas que son clientes de la compañía. Este servicio
finalmente pretende ofrecer una solución completa en prevención de riesgos para las
empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para
dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la
productividad, contribuyendo a un ahorro económico

## 2. PROBLEMA

La empresa no posee un sistema de información que le permita administrar toda la cantidad de
información que se genera, ni controlar las actividades y el recurso humano.
Existen problemas con la planificación de las visitas, generalmente los profesionales están en
terreno por lo que no están disponibles para informarles sus actividades futuras.No existe registro 
del profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el
cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la
ejecución de la capacitación, lo que trae consigo multas para la empresa. No se tiene un control
de los clientes que pagan y los que no, lo que hace que muchas actividades de los
profesionales corran por cuenta de la empresa, generando desbalances financieros. Las
actividades se registran en carpetas lo que dificulta el seguimiento de las asesorías y el resumen
de resultados por empresa. Además, generalmente no se cumplen ciertas actividades de
control de implementación de soluciones y a veces no se ha cumplido con la dirección del
trabajo, lo que genera multas para los clientes, bajando la calidad del servicio. Los
profesionales que han atendido la empresa esporádicamente han variado, no existiendo un
registro de la totalidad de actividades preventivas realizadas y no se tiene certeza de los
avances.

## 3. SOLUCION

Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y
que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes. El sistema debe permitir la planificación de actividades y el control
de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales
y los clientes para la respuesta temprana ante incidentes de seguridad. Además, se requiere que
el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el
rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las
actividades que cada uno involucra para el cumplimiento de los contratos. Es imprescindible,
mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la
posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que
muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.

## 4. ESTRUCTURA DEL PROYECTO

**Gestión de Clientes:** Registro y validación de clientes, incluyendo atributos como RUT, nombres, apellidos, teléfono, AFP, sistema de salud, dirección, comuna, y edad.


**Gestión de Profesionales:** Administración de la información de los profesionales que prestan servicios en la empresa, con validación de datos como nombres, apellidos, título y fecha de ingreso.


**Gestión de Administrativos:** Registro de personal administrativo, con validación de atributos como área de trabajo y experiencia previa.


**Gestión de Capacitaciones:** Creación y gestión de capacitaciones para los clientes, con información como la fecha, la duración y el lugar de la capacitación.


**Validaciones de Entrada de Datos:** Implementación de validaciones específicas para cada atributo, asegurando que la información ingresada cumpla con los requisitos establecidos.


**Manejo de Errores:** Gestión de excepciones y mensajes de error claros para guiar al usuario en caso de entradas incorrectas. 






## 5. REQUISITOS DEL SISTEMA
### Java 8 o superior
### IDE compatible con Java (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## 6. uso
**Menú principal:** Al ejecutar la aplicación, se mostrará un menú con opciones para registrar clientes, profesionales, administrativos, y capacitaciones.


**Ingreso de datos:** Sigue las instrucciones en la consola para ingresar la información requerida.


**Validación:** El sistema validará cada dato ingresado y te indicará si hay errores que deben corregirse.

