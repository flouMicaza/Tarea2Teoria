package teoria;

public class ClaseNot implements Condiciones{
  protected Condiciones cond;
  
  public ClaseNot(Condiciones o){
    cond = o;
  }
  
  public boolean execute(Pluma p){
    return !cond.execute(p);
  }
}
