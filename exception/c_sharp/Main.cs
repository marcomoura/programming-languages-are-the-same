class Client
{
  public static void Main(string[] args)
  {
    try{
      throw new System.Exception("VROOM!");
    }
    catch(System.Exception ex){
      System.Console.WriteLine(ex.ToString());
      System.Console.WriteLine(ex.Message);
    }finally{
      System.Console.WriteLine("finish");
    }
  }
}
