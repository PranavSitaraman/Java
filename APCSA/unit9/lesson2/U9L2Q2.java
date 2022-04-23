public class DoubleCone extends Cone{

  private String flavor="";
  public DoubleCone(String f, boolean w)
  {
super(f,w);
flavor=f;
  }
  
  public DoubleCone(String f1, String f2, boolean w){
    super(f1,w);
    flavor=f2;
  }
  
  
  public void setFlavor(String f1, String f2)
  {
  
    super.setFlavor(f1);
    flavor=f2;
  
  }
   public void setFlavor(String f1)
   {
      super.setFlavor(f1);
       flavor=f1;
   }
  
  
  public String toString()
  {
  
    return "double "+super.toString()+" and "+flavor;
   
  }
}
