public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 1));
    System.out.println(delEnd("bakaboy", 5));
  }

  public static String firstLastN(String skibidi, int n)
  {
    String part1 = skibidi.substring(0, n);
    String part2 = skibidi.substring(skibidi.length()-1);
    return part1 + part2;
  }

  public static String delEnd(String sigma, int n)
  {
    String mwah = sigma.substring(0, (sigma.length()-n));
    return mwah;
  }

  public static String compareLower(String sigma, String skibidi)
  {

    return sigma;
  }
}
