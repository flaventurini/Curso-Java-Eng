//salvar como Ex01.java

//nome da classe
class Ex01
{
  //módulo principal com a entrada pela linha de comando
  public static void main(String entrada[]) 
  {
   //declaração de variáveis
    int idade = 29;
    double peso = 65.5;
    char genero = 'F';
    String nome = "Flávia Venturini ";
    String curso = "Engenharia de Computação";

    System.out.println("Eu sou a " + nome + "tenho " + idade + " anos e tenho " + peso + "kg de peso e faço " + curso); 

    System.exit(0);
  }
}