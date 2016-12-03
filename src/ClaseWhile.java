package teoria;

public class ClaseWhile implements Condiciones{
  protected Condiciones cond;
  
  public void addCond(Condiciones o){
    cond = o;
  }

  @Override
  public boolean execute(Pluma p) {
    return cond.execute(p);
  }
  
  
}
