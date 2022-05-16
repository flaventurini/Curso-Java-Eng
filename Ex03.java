//salvar como Ex03.java
import javax.swing.*;

class Ex03 
{
  public static void main(String entrada[]) 
  {
    //declaração de variáveis
    int n1, n2, p=0;
    char op=0;
    String msg="", msgEntr="Digite 1 para produto\nDigite 2 para produtória\n";

    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    //processamento
    switch(op)
    {
      case '1':
      {
        if (n1>0 && n2>0)
        {
          p = n1 * n2;
          msg = msg + "Produto de " + n1 + " por " + n2 + " = " + p + "\n\n";
        }
        break;
      }
      case '2':
      {
        for(int i=1; i<=n2; i=i+1)
        {
          p = p * n1;
        }
        msg = msg + "Produtória de " + n1 + " , " + n2 + " vezes é: " + p + "\n\n";
        break;
      }
      default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
    }

    //saída de resultado
    if (op >= '1' && op <= '2')
    {
      JOptionPane.showMessageDialog(null, msg);
    }
    
    System.exit(0);
  }
}
