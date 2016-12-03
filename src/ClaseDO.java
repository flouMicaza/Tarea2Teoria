
public class ClaseDO implements Accion{
  protected Accion inst;
  
  public ClaseDO(Accion o) {
	  inst = o;
  }

  @Override
  public void execute(Pluma p) {
    inst.execute(p);
  }
  
  
}
