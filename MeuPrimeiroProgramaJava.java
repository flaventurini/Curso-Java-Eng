//salvar como MeuPrimeiroProgramaJava.java

//nome da classe
class MeuPrimeiroProgramaJava
{
  //módulo principal com a entrada pela linha de comando
  public static void main(String entrada[]) 
  {
   //declaração de variáveis
    int inteiro = 29;
    char caracter = 'F';
    double real = 1.62;
    String frase = "Flávia Venturini ";
    boolean VF = true;

    if (VF == true)
    {
      System.out.println("Eu sou a " + frase + "tenho " + inteiro + " anos e tenho " + real + "m de altura."); 
    }

    System.exit(0);
  }
}