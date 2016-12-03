package teoria;

public class BajarPluma implements Accion{	
  protected Accion a;

@Override
  public void execute(Pluma p) {
    p.arriba = false;
  }
  
  public void addAccion(Accion a){
    this.a = a;
  }
}
