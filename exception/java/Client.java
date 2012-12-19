public class Client {
  public static void main(String args[])
  {
    try{
      throw new Error("VROOM!");
     }catch(Error ex){
       ex.printStackTrace();
       System.out.println(ex.getMessage());
     }finally{
       System.out.println("finish");
     }
  }
}
