import java.util.concurrent.ThreadLocalRandom;
public class Demo{

public static void printLoop(int n )
{
  for (int i = 1; i <= n; i++){
    for(int j = 0; j < n-i+1; j++){
      System.out.print(i);
    }
    System.out.println();
  }
}

public static String arrToString(int[] arr)
{ String str = "{" ;
  for (int i = 0; i < arr.length; i++)
  {
    str += Integer.toString(arr[i]);
    if (i < arr.length -1)
    {
      str += ", ";
    }
  }
  str += "}";
  //System.out.println(str);
  return str;
}

public static String arrayDeepToString(int[][] arr)
{
  String str = "{";
  for (int i = 0 ; i < arr.length; i++)
  {
    str += arrToString(arr[i]);
    if (i < arr.length -1)
    {
      str += ", ";
    }
  }
  str += "}";
  return str;
}

public static int[][] create2DArray(int rows, int cols, int maxValue)
{
  //Will create and return an arry of the size specified.
  // Wil fills the array with values from 0 to maxValue
  int[][]Array2D = new int[rows][cols];

  for (int i = 0; i < Array2D.length; i++)
  {
    for (int j = 0 ; j < cols; j++)
    { int Value = ThreadLocalRandom.current().nextInt(0, maxValue + 1);
      Array2D[i][j] = (int) Value;

    }
  }
  return Array2D;
}



public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue)
{
  // Will create a random number of columns in each row from 0 to cols inclusive
  // Will also randomize the values inside of the array
  int[][]Array2DRandomized = new int[rows][];

  for (int i = 0; i < Array2DRandomized.length; i++)
  { int ColValue = ThreadLocalRandom.current().nextInt(0, cols + 1);
    Array2DRandomized[i] = new int[ColValue];
    for (int j = 0 ; j < Array2DRandomized[i].length; j++)
    {
      int ElementValue = ThreadLocalRandom.current().nextInt(0, maxValue + 1);
      Array2DRandomized[i][j] = ElementValue;
    }
  }
  return Array2DRandomized;
}



public static void main(String[] args)
{
  if (args.length != 0)
  {
  printLoop(Integer.parseInt(args[0]));
  }
  else{
    printLoop(5);
  }

  //int[]a = {1, 2};
  //int[]b = {1, 2, 3};
  //int[][]C = {a, b};
  //System.out.println(arrayDeepToString(C));


   /*for(int i : )
  {
    System.out.println(i);
  }*/
  //int A = 4;
  //int B = 5;
  //int D = 6;
  //System.out.println(arrayDeepToString(create2DArrayRandomized(A, B, D)));
}
}
