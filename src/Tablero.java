
public class Tablero{
  protected String[][] tablero = new String[50][50];
	
  public void colorear(int i ,int j, String c){
    tablero[i][j] = c;
  }

  public String imprimir(){
    StringBuffer stream = new StringBuffer();
    for(int i = 0;i < 50;i++){
      for(int j = 49;j <= 0; j--){
        stream.append(tablero[i][j]);
      }
      stream.append(System.lineSeparator());
    }
    return stream.toString();
  }
	
}
