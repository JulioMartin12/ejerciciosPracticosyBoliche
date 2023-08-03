import java.util.ArrayList;

public class Boliche {
private  int capacidad;
private  float Recaudación;
private  float entradaComun = 1500;
private  float entradaVip = 2000;
private ArrayList<Persona> publico ;
private  float precioRealEntrada;

    public Boliche() {
        this.publico = new ArrayList<Persona>();
        this.capacidad=500;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public float getRecaudación() {
        return Recaudación;
    }


    public void setRecaudación(float recaudación) {
        Recaudación = recaudación;
    }

    public float getEntradaComun() {
        return entradaComun;
    }

    public float getEntradaVip() {
        return entradaVip;
    }

    public void calcularEntrada(String pase){

    }

    public  void cargarPersona(Persona persona){

        this.getPublico().add(persona);
    }


    public ArrayList<Persona> getPublico() {
        return publico;
    }

    public  int lugaresDisponibles(){
        return (getCapacidad() - getPublico().size());
    }

    public float getPrecioRealEntrada( String entrada, String pase) {

          if(pase.equals("VIP")){
              return 0;
          }else
          {
              if( pase.equals(("Descuento"))){
                  if(entrada.equals("VIP")){
                      return  this.getEntradaVip()/2;
                  }else{
                      return  this.getEntradaComun()/2;
                  }

              }else{
                  if(entrada.equals("VIP")){
                      return  this.getEntradaVip();
                  }else{
                      return  this.getEntradaComun();
                  }
              }
          }

    }
}
