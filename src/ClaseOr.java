
public class ClaseOr implements Condiciones{
  protected Condiciones cond1;
  protected Condiciones cond2;
  
  public ClaseOr(Condiciones c1, Condiciones c2){
    cond1 = c1;
    cond2 = c2;
  }

  @Override
  public boolean execute(Pluma p) {
    return cond1.execute(p) || cond2.execute(p);
  }

}
