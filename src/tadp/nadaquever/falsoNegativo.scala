object Familia {


 class Padre {
   def pedirPlata(a: Int): Int = ???
 }
 
 class Tio {
   def pedirPlata2(a: Int): Int = ???
 }


 class Hijo extends Padre {
   def pedirPlata(a: Any): String = ???
 }

 val pepe: Padre = new Hijo

// val sarlompaMagica = pepe.asInstanceOf[Tio].pedirPlata(2)

 val pepe2 = (new Tio).asInstanceOf[Padre]
 pepe2.pedirPlata(3)

}


