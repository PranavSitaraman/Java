import java.util.ArrayList;

public class U7_L3_Activity_Two
{

    // Write the printStatistics method as described in the assignment
    public static void printStatistics(ArrayList<Integer> nums) {
      // define variables at start
      int sum = 0;
      int mode = 0;
      int modeRec = 0; // records the "world-record" number of times a num repeats
      int num;
      boolean validMode = false; // used to check if the mode is valid
      // loop through nums
      for (int i = 0; i < nums.size(); i++) {
        // universal variable for what number the outer loop is "on"
        num = nums.get(i);
        sum += num;
        // define modeCount to track the current frequency of num, then discard when num is re-initialized
        int modeCount = 0;
        // inner loop to compare num against all integers in nums
        for (int k = 0; k < nums.size(); k++) {
          // adds to loop count if a repeat is found
          if (num == nums.get(k) && (num != mode || modeRec == 0)) {
            modeCount++;
          }
        }
        // determines if current count is higher then "world-record"
        if (modeCount > modeRec) {
          modeRec = modeCount;
          mode = num;
          validMode = true;
          // if the current count equals the "world-record", temporarily set validMode to false until new mode is found or loop finishes
        } else if (modeCount == modeRec) {
          validMode = false;
        }
      }
      System.out.print("Sum: " + sum + "\nAverage: " + ((double) sum/nums.size()) + "\nMode: ");
      if (validMode) {
        System.out.println(mode);
      } else {
        System.out.println("no single mode");
      }
    }
=======
  // Write the printStatistics method as described in the assignment
  public static void printStatistics(ArrayList<Integer> list) {
    int sum = 0;
    double avg = 0;
    int mode = 0;
    
    int mostAppearingNumber = 0;
    int mostAppearingCount = 0;
    int noSingleUnlessGreater = 0;
    
    for (Integer number : list) {
      sum += number;
      int modeCount = 0;
      for (Integer referenceNumber : list){
        if (referenceNumber == number){
          modeCount++;
        }
      }
      if (modeCount > mostAppearingCount){
        mostAppearingCount = modeCount;
        mostAppearingNumber = number;
      }else if (modeCount == mostAppearingCount && number != mostAppearingNumber){
        noSingleUnlessGreater = modeCount;
      }
    } 
    avg = sum / (double) list.size();
    
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);
    if (mostAppearingCount <= 1){
      System.out.println("Mode: no single mode");
    }else {
      if (mostAppearingCount > noSingleUnlessGreater){
        System.out.println("Mode: " + mostAppearingNumber);
      }else {
        System.out.println("Mode: no single mode");
      }
    }
  }

}
