public class KennelRunner 
{
   public static void main(String[] args)
   {
       Cat c = new Cat("Kitty");
       Dog d = new Dog("Doggy");
       LoudDog ld = new LoudDog("Loudy");
       Pet[] petArray = {c,d,ld};
       Kennel k = new Kennel(petArray);
       k.allSpeak();
       
   }
}