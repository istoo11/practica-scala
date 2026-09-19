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
