public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
  
  /**
   * returns the number of times a passed int is found in the matrix
   * 
   * @pre matrix is created
   * @post count is returned
   * @param check - the int used to check for count
   * @return count - the count of how many times check was found in the matrix
   */
  
  public int getCount(int check)
  {
      int count = 0;
      for (int row = 0; row < matrix.length; row++)
      {
          for (int col = 0; col < matrix[0].length; col++)
          {
              if (check == matrix[row][col])
              {
                  count++;
              }
          }
      }
      return count;
  }
  
  /**
   * returns largest int in the matrix
   * 
   * @pre matrix is created
   * @post largest is returned
   * @return largest - the largest int in the array
   */
  public int getLargest()
  {
      int largest = 0;
      for (int row = 0; row < matrix.length; row++)
      {
          for (int col = 0; col < matrix[0].length; col++)
          {
              if (largest < matrix[row][col])
              {
                  largest = matrix[row][col];
              }
          }
      }
      return largest;
  }
  
  /**
   * returns the total of all ints in a specified column
   * 
   * @pre matrix is created
   * @post largest is returned
   * @param col - the column for the ints
   * @return total - total of all the ints
   */
  public int getColTotal(int col)
  {
      int total = 0;
      for (int row = 0; row < matrix.length; row++)
      {
          total += matrix[row][col];
      }
      return total;
  }
}