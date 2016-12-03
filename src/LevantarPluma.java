package teoria;

public class LevantarPluma implements Accion{
  protected Accion a;

@Override
  public void execute(Pluma p) {
    p.arriba = true;
  }
  
  public void addAccion(Accion a){
    this.a = a;
  }

}
