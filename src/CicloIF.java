

public class CicloIF implements Accion{

  protected ClaseIF i;
  protected ClaseThen t;
  protected ClaseElse e;

  public CicloIF(ClaseIF i, ClaseThen t){
    this.i = i;
    this.t = t;
  }
  
  public CicloIF(ClaseIF i,ClaseThen t,ClaseElse e){
    this.i = i;
    this.t = t;
    this.e = e;
  }

  @Override
  public void execute(Pluma p) {
    if(i.execute(p)){
      t.execute(p);
    }
    else{
      e.execute(p);
    }
  }
  
  
	
}
