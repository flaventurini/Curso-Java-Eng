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
    String nome = "Flávia Venturini de Castro";
    String curso = "Engenharia de Computação";

    System.out.println("Eu sou a " + nome + ", tenho " + idade + " anos, tenho " + peso + "kg de peso, meu gênero é " + genero + " e faço " + curso); 

    System.exit(0);
  }
}