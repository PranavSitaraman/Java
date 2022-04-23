public class TemperatureMonth{

    private double[][] temperatures;
  
    public TemperatureMonth(double[][] t){
      temperatures = t;
    }
  
    public double getMaxTemp(){
      double maxTemp = temperatures[0][0];
      
      for(int i = 0; i < temperatures.length; i++){
        for(int j = 0; j < temperatures[i].length; j++){
          if(maxTemp <= temperatures[i][j]){
            maxTemp = temperatures[i][j];
          }
        }
      }
      return maxTemp;
    }
  
    public double getMinTemp(){
      double minTemp = temperatures[0][0];
      
      for(int i = 0; i < temperatures.length; i++){
        for(int j = 0; j < temperatures[i].length; j++){
          if(minTemp > temperatures[i][j]){
            minTemp = temperatures[i][j];
          }
        }
      }
      return minTemp;
    }
  
    public double getMonthlyAverage(){
      double totalSum = 0;
      for(int i = 0; i < temperatures.length; i++){
        for(int j = 0; j < temperatures[i].length; j++){
          totalSum += temperatures[i][j];
        }
      }
      return totalSum/(temperatures.length * temperatures[0].length);
    }
  
    public double[] getWeeklyAverages(){
      double[] averages = new double[temperatures.length];
      for(int i = 0; i < temperatures.length; i++){
        double average = 0;
        for(int j = 0; j < temperatures[i].length; j++){
          average += temperatures[i][j];
        }
        averages[i] = (average/temperatures[i].length);
      }
      return averages;
    }
  
  }
  