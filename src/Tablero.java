package teoria;

public class Tablero{
  protected String[][] tablero = new String[50][50];
	
  public void colorear(int i ,int j, String c){
    tablero[i][j] = c;
  }
	
	
}
