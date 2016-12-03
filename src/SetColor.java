

public class SetColor implements Accion{
  protected String color;
  protected Accion a;
  
  public SetColor(String c){
    color = c;
  }
  
  public void addAccion(Accion a){
    this.a = a;
  }
  
  @Override
  public void execute(Pluma p) {
    p.color = color;
  }

}
