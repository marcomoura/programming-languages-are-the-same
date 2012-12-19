using System;

class Client
{
  public static void Main(string[] args)
  {
    try{
      throw new Exception();
    }
    catch(Exception){
      Console.Write("VROOM!");
    }
  }
}
