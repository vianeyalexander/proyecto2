public class Gato extends MascotaVirtual {
        public Gato (String nombreEelegido){
                super(nombreEelegido);
        }

        @Override
        public void hacerSonido(){
                System.out.println(nombre+" dice:MIAU");
         }

        public void dibujar(){
                System.out.println(Colores.VERDE);
                System.out.println( "  /\\_/\\ ");
                System.out.println("( o . o )");
                System.out.println(" >  ^  <");
                System.out.println("Colores.RESET");
        }
                        

    
}