object Main extends App {

  val estudiantes = List("Ana", "Luis", "Marta", "Pedro", "Sofia")
  val notas = Array(8, 4, 10, 6, 3)

  def aprobado(nota: Int): Boolean = nota >= 5
  def estadoNota(nota: Int): String = if (aprobado(nota)) "APROBADO" else "SUSPENSO"
  def maxNota(a: Int, b: Int): Int = if (a > b) a else b
  def clasificacion(nota: Int): String = {
    if (nota >= 9) {
      "EXCELENTE"
    } else if (nota >= 7) {
      "NOTABLE"
    } else if (nota >= 5){
      "APROBADO"
    }else "SUSPENSO"
  }

  var i = 0
  while (i < estudiantes.length) {
    println(estudiantes(i) +"->"+ notas(i) +"->"+ estadoNota(notas(i)))
    i += 1
  }

  val totalEstudiantes = estudiantes.length
  val aprobadosPrimera = notas.count(aprobado)
  val suspensosPrimera = totalEstudiantes - aprobadosPrimera

  var mejorNotaPrimera = notas(0)
  i = 1
  while (i < notas.length) {
    mejorNotaPrimera = maxNota(mejorNotaPrimera, notas(i))
    i += 1
  }

  println("\n--- Resumen del grupo ---")
  println("Estudiantes: " + totalEstudiantes)
  println("Aprobados: " + aprobadosPrimera)
  println("Suspensos: " + suspensosPrimera)
  println("Mejor nota: " + mejorNotaPrimera)

  i = 0
  while (i < estudiantes.length) {
    println(estudiantes(i) + " -> " + notas(i) + " -> " + clasificacion(notas(i)))
    i += 1
  }

  val notasSegundaEvaluacion = Array(9, 5, 8, 7, 6)
  val aprobadosSegunda = notasSegundaEvaluacion.count(aprobado)

  var mejorNotaSegunda = notasSegundaEvaluacion(0)
  i = 1
  while (i < notasSegundaEvaluacion.length) {
    mejorNotaSegunda = maxNota(mejorNotaSegunda, notasSegundaEvaluacion(i))
    i += 1
  }

  println("Mejor nota de la primera evaluación: " + mejorNotaPrimera)
  println("Mejor nota de la segunda evaluación: " + mejorNotaSegunda)
  println("Número de aprobados de la primera: " + aprobadosPrimera)
  println("Número de aprobados de la segunda: " + aprobadosSegunda)

  print("Evolución del grupo: ")
  if (aprobadosSegunda > aprobadosPrimera) {
    println("Ha mejorado.")
  } else if (aprobadosSegunda < aprobadosPrimera) {
    println("Ha empeorado.")
  } else {
    println("Se ha mantenido igual.")
  }

  val nuevosEstudiantes = "Carlos" :: estudiantes
  println("Lista original: " + estudiantes)
  println("Lista nueva: " + nuevosEstudiantes)
}