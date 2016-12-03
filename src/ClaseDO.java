
public class ClaseDO implements Accion{
  protected Accion inst;
  
  public ClaseDO(Accion o) {
	  inst = o;
  }

  @Override
  public void execute(Pluma p) {
    inst.execute(p);
  }

  @Override
  public void addAccion(Accion a) {
    // TODO Auto-generated method stub
    
  }
}
