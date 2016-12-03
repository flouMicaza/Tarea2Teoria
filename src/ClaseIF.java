

public class ClaseIF implements Condiciones{
  protected Condiciones condiciones;
  
  public ClaseIF(Condiciones o){
    condiciones = o;
  }

  @Override
  public boolean execute(Pluma p) {
    return condiciones.execute(p);
  }
}
