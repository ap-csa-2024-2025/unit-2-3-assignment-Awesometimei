public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 1));
    System.out.println(delEnd("bakaboy", 5));
    System.out.println(compareLower("bakaboy", "DANNY"));
    System.out.println(lengthFirst("What is up guys. It's Danny"));
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

  public static int compareLower(String sigma, String skibidi)
  {
    sigma = sigma.toLowerCase();
    skibidi = skibidi.toLowerCase();
    int no = skibidi.compareTo(sigma);
    return no;
  }

  public static int lengthFirst(String sentence)
  {
    int length = sentence.indexOf(" ");
    return length; 
  }

}
