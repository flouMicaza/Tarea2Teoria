
public class ClaseElse implements Accion{
  protected Accion instrucciones;

  public ClaseElse(Accion o){
    instrucciones = o;
  }

  @Override
  public void execute(Pluma p) {
    instrucciones.execute(p);
  }

  @Override
  public void addAccion(Accion a) {
    //sdas
  }
}
