public class Client {
  public static void main(String args[]){
    Core core = new Core();

    try{
         core.boom();
       }catch(Error|Exception ex){
         ex.printStackTrace();
         System.out.println(ex.getStackTrace());
         System.out.println(ex.getCause());
         System.out.println(ex.getMessage());
       }finally{
         System.out.println("finish");
       }
  }
}
