public class CreadorObjeto {
public static void main(String [] arg)  {

  MascotaVirtual [] refugio={
    new Perro (" lola"),
    new Gato (" Maggi"),
    new Perro (" olaf"),
    new Pollito (" maco")

  };
  for (MascotaVirtual m : refugio){ 
    m.hacerSonido();
    m.mostrarEstado();
    m.dibujar();
  }


  
}
}









