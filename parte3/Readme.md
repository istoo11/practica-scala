# Mini proyecto 3.1 — Torneo de Twenty-One

## Entorno

- Visual Studio Code
- Metals
- Scala 2.12.21
- JDK 17
- sbt

## Descripción

Aplicación sencilla de Blackjack en Scala que permite gestionar varios jugadores y sus puntuaciones, comprobar si sus manos son válidas o han hecho bust, y obtener la mejor puntuación de cada ronda y del conjunto de partidas.

## Estructura

```text
torneo-twenty-one/
├── build.sbt
├── project/
└── src/
    └── main/
        └── scala/
            └── mainWhile.scala
            └── mainForeach.scala
```

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

# Mini proyecto 3.2 — Gestión de Notas de Estudiantes

## Entorno

- IntelliJ IDEA
- Scala 2.12.21
- JDK 17
- sbt

## Descripción

Aplicación sencilla en Scala que permite gestionar las calificaciones de varios estudiantes a lo largo de dos evaluaciones, comprobar si han aprobado o suspendido, clasificar sus notas por rangos detallados, y analizar la evolución general del grupo de una evaluación a otra.

## Estructura

```text
analizador-notas/
├── build.sbt
├── project/
└── src/
    └── main/
        └── scala/
            └── Main.scala
```

## Funciones utilizadas

- aprobado
- estadoNota
- maxNota
- clasificacion

## Ejecución

```bash
sbt compile
sbt run

Ana->8->APROBADO
Luis->4->SUSPENSO
Marta->10->APROBADO
Pedro->6->APROBADO
Sofia->3->SUSPENSO

--- Resumen del grupo ---
Estudiantes: 5
Aprobados: 3
Suspensos: 2
Mejor nota: 10
Ana -> 8 -> NOTABLE
Luis -> 4 -> SUSPENSO
Marta -> 10 -> EXCELENTE
Pedro -> 6 -> APROBADO
Sofia -> 3 -> SUSPENSO
Mejor nota de la primera evaluación: 10
Mejor nota de la segunda evaluación: 9
Número de aprobados de la primera: 3
Número de aprobados de la segunda: 5
Evolución del grupo: Ha mejorado.
Lista original: List(Ana, Luis, Marta, Pedro, Sofia)
Lista nueva: List(Carlos, Ana, Luis, Marta, Pedro, Sofia)
```
