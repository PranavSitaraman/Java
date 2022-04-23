public class Fundraiser{
  public double goal;
  public double donateAmount = 0.0;
  public int donations = 0;
  
  public Fundraiser(double g) {
    goal = g;
  }
  
  public void addDonation(double add) {
    donateAmount += add;
    donations++;
  }
  
  public double averageDonation() {
    if(donations == 0)
    return 0.0;
    return donateAmount / donations;
  }
  
  public double distanceToTarget() {
    if(donateAmount >= goal)
    return 0.0;
    else
    return goal - donateAmount;
  }

  /*public static void main(String[] args) {
  Fundraiser f = new Fundraiser(5000.00);
  System.out.println(f.averageDonation());
  f.distanceToTarget();	
  f.addDonation(750.00);
  System.out.println(f.averageDonation());
  System.out.println(f.distanceToTarget());
  f.addDonation(1125.00);
  f.addDonation(400.00);	
  f.addDonation(1620.00);
  System.out.println(f.averageDonation());
  System.out.println(f.distanceToTarget());
  f.addDonation(124.75);
  f.addDonation(1030.60);
  System.out.println(f.averageDonation());
  System.out.println(f.distanceToTarget()); 
  }*/
}
