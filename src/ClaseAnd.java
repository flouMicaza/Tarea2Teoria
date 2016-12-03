package teoria;

public class ClaseAnd implements Condiciones{
  protected Condiciones cond1;
  protected Condiciones cond2;
  
  public ClaseAnd(Condiciones a1, Condiciones a2){
    cond1 = a1;
    cond2 = a2;
  }
  
  public boolean execute(Pluma p){
    return cond1.execute(p) && cond2.execute(p);
  }
}
