package teoria;

public class PlumaAbajo implements Condiciones{

  public boolean execute(Pluma p){
    return p.arriba == false;
  }
}
