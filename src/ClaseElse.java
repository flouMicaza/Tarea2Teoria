package teoria;

import java.util.ArrayList;

public class ClaseElse implements Accion{
  protected ArrayList<Accion> instrucciones = new ArrayList<Accion>();

  public void addIns(Accion o){
    instrucciones.add(o);
  }

  @Override
  public void execute(Pluma p) {
    for(Accion a: instrucciones){
      a.execute(p);
    }
  }
}
