package tadp.nadaquever

class Persona

class Rey extends Persona

class Perro

object Saludador {
  def saludar(a: Persona) = "Holaaaa"
  def saludar(b: Rey) = "Salve o su majestad"
  def saludar(c: Perro) = "Perriiitoooo"

  
}


object Sobrecarga extends App {
  val a : Persona = new Persona
  val b : Rey = new Rey
  
  val ab : Persona = b
  
  val c : Perro = new Perro
  
  
  Saludador.saludar(a)
  Saludador.saludar(b)
  Saludador.saludar(c)
  Saludador.saludar(ab)
  
}