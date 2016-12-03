
public class Avanzar implements Accion{
  protected Object a;

@Override
  public void execute(Pluma p) {
    if(p.direccion.equals("N")){
      p.posY++;
    }
    if(p.direccion.equals("S")){
        p.posY--;
      }
    if(p.direccion.equals("E")){
        p.posX++;
      }
    if(p.direccion.equals("O")){
        p.posX--;
      }
  }
  
  public void addAccion(Accion a){
    this.a = a;
  }

}
