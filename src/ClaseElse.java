
public class ClaseElse implements Accion{
  protected Accion instrucciones;

  public void addIns(Accion o){
    instrucciones = o;
  }

  @Override
  public void execute(Pluma p) {
    instrucciones.execute(p);
  }
}
