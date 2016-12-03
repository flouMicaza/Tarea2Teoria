

public class ClaseThen implements Accion{
  protected Accion instrucciones;

  public ClaseThen(Accion o){
    instrucciones = o;
  }

  @Override
  public void execute(Pluma p) {
    instrucciones.execute(p);
  }
}
