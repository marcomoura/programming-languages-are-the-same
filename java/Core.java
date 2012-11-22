public class Core {
  public void boom() throws Exception{
    throw new Error("VROOM!", new CoreException("Marco's exception"));
  }
}

