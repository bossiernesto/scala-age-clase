package tadp.nadaquever

object familia {
 trait Molesto {
   def pedirPlata(a: Int): Int = 25
   def yoMismo(): Molesto = this
 }
 
 
 trait NoTanMolesto {
 
 }

 class Niño

 class Tio {
   def pedirPlata(a: Int): Int = 2
   def darPlata(m: Molesto): Int = 40
 }

 class Hija extends Niño with Molesto with NoTanMolesto {
 }

 class Hijo extends Molesto {
   def bleh(): Int = 2
 }

 val pepe: Molesto = new Hijo                     //> pepe  : tadp.nadaquever.familia.Molesto = tadp.nadaquever.familia$Hijo@4e515
                                                  //| 669
 val pepita = new Hija                            //> pepita  : tadp.nadaquever.familia.Hija = tadp.nadaquever.familia$Hija@3d2475
                                                  //| 3a
                    
 pepe.pedirPlata(2)                               //> res0: Int = 25
 pepita.pedirPlata(30)                            //> res1: Int = 25
 val pepo = new Tio                               //> pepo  : tadp.nadaquever.familia.Tio = tadp.nadaquever.familia$Tio@59a6e353

 pepo.darPlata(pepita)                            //> res2: Int = 40
 pepita.yoMismo()                                 //> res3: tadp.nadaquever.familia.Molesto = tadp.nadaquever.familia$Hija@3d24753
                                                  //| a
//ss
 
}