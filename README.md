<img src="https://github.com/AdrianCB27/Agencia_de_Viajes/blob/master/AI%20Image%20Folder/Logo/travel-agency-logo.png" alt="Logo de la Agencia de Viajes" width="250px" height="250px">

# Práctica Grupal Tema 2 - Agencia de Viajes

Este repositorio contiene el código fuente de una aplicación diseñada para una agencia de viajes que permite repartir el coste de un viaje grupal entre los miembros del grupo.

## Preparación

Este proyecto es el resultado del trabajo en equipo, organizado y distribuido entre 5 desarrolladores. Cada miembro del equipo ha clonado este repositorio para contribuir al desarrollo de la aplicación.

## Requisitos de la Aplicación

- **Número máximo de viajeros**: 5.
- **Funcionalidades**:
  1. Introducir gastos de los viajeros.
  2. Calcular reparto de gastos.
  3. Mostrar el reparto entre los viajeros.
  4. Salir.
- **Flujo de control**: No se puede proceder al paso 2 sin completar el paso 1, ni al paso 3 sin haber completado los pasos 1 y 2.
- **Entrada de datos**: Introducir `-1` para un viajero indica que no debe ser incluido en el reparto.

## Cómo Ejecutar

Requisitos previos: JRE instalado.

Para ejecutar la aplicación desde el terminal:

```bash
javac Main.java
java Main
```

## Instrucciones de Uso

### Introducir gastos de los viajeros

Selecciona esta opción para ingresar los gastos de cada viajero. Si un viajero no existe o no ha incurrido en gastos, introduce `-1` para ese viajero.

### Calcular reparto de gastos

Después de introducir los gastos, utiliza esta opción para calcular el reparto equitativo de los costos entre los viajeros. No podrás realizar esta acción si no has completado la introducción de gastos.

### Mostrar el reparto entre los viajeros

Tras calcular el reparto de gastos, esta opción mostrará cuánto debe pagar o recibir cada viajero para equilibrar el total de gastos entre todos.

### Salir

Cierra la aplicación.

## Contribuciones

Para contribuir al proyecto, por favor haga un fork (copia personal) del repositorio y haga un pull request con sus cambios.

## Aportaciones de los Desarrolladores

Las contribuciones de cada desarrollador están documentadas en el historial de commits del repositorio en GitHub.