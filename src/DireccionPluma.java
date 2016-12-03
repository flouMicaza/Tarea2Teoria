package teoria;

public class DireccionPluma implements Condiciones{
  public String dir;
  
  public DireccionPluma(String d){
    dir = d;
  }
  
  public boolean execute(Pluma p){
    return p.direccion == this.dir;
  }
}
