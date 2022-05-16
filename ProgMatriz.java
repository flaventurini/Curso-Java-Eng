//salvar como ProgMatriz.java
import javax.swing.*;

class ProgMatriz
{
  public static void main(String entrada[]) 
  {
    //declaração de variáveis
    int vetor[] = {2, 4, 6, 8, 10};
    int matriz[][] = new int [3][4];
    String msg="vetor = ";

    //vetor = :
    for (int i=0; i<vetor.length; i++) 
    {
      msg = msg + vetor[i] + "  ";
    }
    JOptionPane.showMessageDialog(null, msg);

    msg = "Matriz = \n\n";
    for (int i=0; i<matriz.length; i++)
    {
      for (int j=0; j<matriz.length; j++)
      {
        matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para posição " + i + " e " + j));
        msg = msg + matriz[i][j] + "  ";
      }
      msg = msg + "\n";
    }

    //saída de resultado
    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}
