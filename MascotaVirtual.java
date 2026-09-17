public class MascotaVirtual {
   protected String nombre;
   private Integer energia;
   public String color;
   private Integer felicidad;


   public void ladrar (){

   }

   public void jugar(){

   }

   public void setEnergia(){

   }

    private void recuperarEnergia(){
    }
   
   private void ajustarFelicidad(){
   }

  

   

   public MascotaVirtual (String nombreElegido){
      nombre= nombreElegido;
      energia= 50;
      felicidad=70;

      
      System.out.print ("Bienvenido al mundo ");
      System.out.println (nombreElegido);
   }

    public void salta(){
      System.out.println("La mascota esta saltando ");
      energia=energia -5;
      
      System.out.print("El nivel de energia bajo ahora ");
      System.out.println(energia);
    }

    public void comer(){
      System.out.println("La mascota esta comiendo ");
      energia=energia +5 ;

      System.out.print("El nivel de energia aumento ");
      System.out.println (energia);

    }

    public void estadodeanimo(){
      System.out.println("Le da tristeza cuando no come");
      energia=energia -5 ;

      System.out.print("El nivel de energia bajo ");
      System.out.println (energia);
    }

    public void Saludar( MascotaVirtual quienSaludar ){
      System.out.print ("Hola Saludos ");
      System.out.println(quienSaludar.nombre);
      System.out.println("Que hay de nuevo");

    }

    public void setEnergia(Integer energiaElegida){
      if (energiaElegida>100)
        System.out.println("ERROR:La energia debe estar 1-100"); 
        else

          energia=energiaElegida;
      {
        
      }
    }

    public void getEnergia() {
      System.out.print("El nivel de energia de ");
      System.out.print(nombre);
      System.out.print(" es de ");
      System.out.println(energia);
    }

    private void recuperarEnergia (int puntos){
      setEnergia(energia + puntos);
    }

    private boolean necesitaDescanso(){
      return energia<30;

    }

    private void ajustarFelicidad(int puntos){
      felicidad = felicidad + puntos;
      if (felicidad >100) felicidad=100;{
      if (felicidad<0) felicidad=0;{
        
      }
        
      }
    }
     
    public void dormir () {
      if (!necesitaDescanso()) {
        System.out.println(nombre + " no tiene sueño");
        return;
        
      }

      recuperarEnergia(50);
      ajustarFelicidad(5);
      System.out.println(nombre + " durmio y se renovo");

    }

    public void hacerSonido(){
      System.out.println(nombre + " hace un sonido");
    }


    public void mostrarEstado(){
      System.out.println(nombre);
      System.out.println(" Energia :["+ barra (energia)+"]");
      System.out.println(" Felicidad:["+ barra(felicidad)+"]");
    }

    private String barra (int valor){
      String color;
      if(valor>=60)
          color = Colores.VERDE;
      else if (valor>=30)
          color=Colores.AMARILLO;
        else
          color=Colores.ROJO;

      int llenos = valor / 10;
      return color+"\u2588".repeat(llenos)+ "\u2591".
      repeat(10-llenos)+" "+ Colores.RESET+ valor;
    }
   
  public void dibujar(){
    System.out.println("¿?");
    System.out.println("(¿?)<-mascota desconocida");

  }
    


 }