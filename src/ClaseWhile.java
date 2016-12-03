

public class ClaseWhile implements Condiciones{
  protected Condiciones cond;
  
  public ClaseWhile(Condiciones o){
    cond = o;
  }

  @Override
  public boolean execute(Pluma p) {
    return cond.execute(p);
  }
  
  
}
