public class U7_L5_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  public static void sortAndPrint(String[] array) {
    for ( int j=0; j < array.length-1; j++ )
    {
      int min = j;
      for ( int k=j+1; k < array.length; k++ )
        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  
      
      String temp = array[j];
      array[j] = array[min];
      array[min] = temp;
    }
  
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
