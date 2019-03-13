public class PetRunner
{
    public static void main(String args[])
    {
      Pet loudDog = new LoudDog("Rex");
      System.out.println(loudDog.speak());
    }
}