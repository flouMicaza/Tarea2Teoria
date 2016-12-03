

public class Iterador implements Accion{
  protected ClaseWhile w;
  protected ClaseDO d;
  
  public Iterador(ClaseWhile w, ClaseDO d){
    this.w = w;
    this.d = d;
  }

  @Override
  public void execute(Pluma p) {
    while(w.execute(p)){
      d.execute(p);
    }
  }
  
  
}
