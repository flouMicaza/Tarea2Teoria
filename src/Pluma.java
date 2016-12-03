package teoria;

public class Pluma{
  
  protected String color = "B";
  protected int posX = 0;
  protected int posY = 0;
  protected String direccion = "E";
  protected boolean arriba = true;
  public Tablero tablero = new Tablero();
  
  public Pluma(Tablero t){
    this.tablero = t;
  }
  
  public void colorear(){
    tablero.colorear(posX, posY, color);
  }
  
}
