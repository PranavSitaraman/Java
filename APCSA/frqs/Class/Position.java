public class Position {
  
  public double vertical;
  public double horizontal;
  public double totalDistance;
  
  public Position(double x, double y) {
    horizontal = x;
    vertical = y;
  }
  
  public void move (double dist, String dir) {
    if(dir.equals("N")) {
      vertical += Math.abs(dist);
      totalDistance += Math.abs(dist);
    }
    
    else if(dir.equals("S")) {
      vertical -= Math.abs(dist);
      totalDistance += Math.abs(dist);
    }
    
    else if(dir.equals("W")) {
      horizontal -= Math.abs(dist);
      totalDistance += Math.abs(dist);
    }
    
    else if(dir.equals("E")) {
      horizontal += Math.abs(dist);
      totalDistance += Math.abs(dist);
    }
  }

  public String toString() {
    return "(" + horizontal + ", " + vertical + ")";
  }
  
  public double totalDistance() {
    return totalDistance;
  }


/*public static void main(String[] args) {
  Position p = new Position(1.5, -5.0);
  System.out.println(p.toString());
  System.out.println(p.totalDistance());
  p.move(3.5, "E");
  p.move(1.0, "S");
  System.out.println(p.toString());
  System.out.println(p.totalDistance());
  p.move(8.2, "N");	
  p.move(3.7, "W");	
  p.move(0.6, "W");
  System.out.println(p.toString());
  System.out.println(p.totalDistance());
  
} */

}
