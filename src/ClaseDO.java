package teoria;

import java.util.ArrayList;

public class ClaseDO implements Accion{
  protected ArrayList<Accion> inst = new ArrayList<Accion>();
  
  public void addIns(Accion o) {
	  inst.add(o);
  }

  @Override
  public void execute(Pluma p) {
    for(Accion a: inst){
      a.execute(p);
    }
  }
  
  
}
