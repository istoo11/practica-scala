# Mini proyecto 3.1 — Torneo de Twenty-One

## Entorno

-Visual Studio Code
-Metals
-Scala 2.12.21
-JDK 17
-sbt

## Descripción

Aplicación sencilla de Blackjack en Scala que permite gestionar varios jugadores y sus puntuaciones, comprobar si sus manos son válidas o han hecho bust, y obtener la mejor puntuación de cada ronda y del conjunto de partidas.

## Estructura

Descripción de los archivos principales.

## Funciones utilizadas

- bust
- estadoMano
- mejorMano
- manosValidas
- mejorPuntuacionValida

## Ejecución

```bash
sbt compile
sbt run

```text
Alex -> 18 -> VALIDA
Chen -> 24 -> BUST
Marta -> 21 -> VALIDA
Sindhu -> 20 -> VALIDA
Luis -> 26 -> BUST
--- Resumen de la ronda ---
Numero total de jugadores: 5
Manos validas: 3
Bust: 2
Mejor puntuacion valida: 21
--- Resumen de la ronda 2 ---
Numero total de jugadores: 5
Manos validas: 4
Bust: 1
Mejor puntuacion valida: 21
--- Resumen de las partidas ---
Mejor puntuacion de la ronda 1: 21
Mejor puntuacion de la ronda 2: 21
Mejor puntuacion de todas las rondas: 21
Las dos rondas tuvieron la misma mejor puntuacion: true
```
