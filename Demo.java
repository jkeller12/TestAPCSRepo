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
public static void main(String[] args)
{
  if (args.length != 0)
  {
  printLoop(Integer.parseInt(args[0]));
  }
  else{
    printLoop(5);
  }
}
}
