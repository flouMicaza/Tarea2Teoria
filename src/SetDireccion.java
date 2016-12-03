

public class SetDireccion implements Accion{
  protected Accion a;
  protected String dir;

  public SetDireccion(String d){
    dir = d;
  }
  
  public void addAccion(Accion a){
    this.a = a;
  }
	
  @Override
  public void execute(Pluma p) {
    p.direccion = "E";
  }

}
