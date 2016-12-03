package teoria;

public class ColorCasilla implements Condiciones{
  protected String color;
  
  public ColorCasilla(String c){
    this.color = c;
  }
  
  public boolean execute(Pluma p) {
    return p.tablero.tablero[p.posX][p.posY] == color;
  }

}
