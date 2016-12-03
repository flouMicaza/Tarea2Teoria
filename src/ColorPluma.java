

public class ColorPluma implements Condiciones{
  protected String color;
  
  public ColorPluma(String c) {
    color = c;
  }

  public boolean execute(Pluma p) {
    return this.color == p.color;
  }

}
