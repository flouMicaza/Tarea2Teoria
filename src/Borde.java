package teoria;

public class Borde implements Condiciones{

  public boolean execute(Pluma p) {
    if(p.direccion.equals("N") && p.posY == 49){
      return true;
    }
    if(p.direccion.equals("S") && p.posY == 0){
      return true;
    }
    if(p.direccion.equals("E") && p.posX == 49){
      return true;
    }
    if(p.direccion.equals("O") && p.posX == 0){
      return true;
    }
    return false;
  }

}
