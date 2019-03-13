import java.util.*;

public class Kennel 
{
  private ArrayList<Pet> petList;
  
  //postcondition:  for each Pet in the kennel, its name followed
  //                followed by the result of a call to its speak method
  //                has been printed, one line per Pet
  public Kennel(Pet[] petArray)
  {
      petList = new ArrayList<Pet>();
      
      for (int i=0; i < petArray.length;i++)
      {
          petList.add(petArray[i]);
      }
          
      
  }
  public void allSpeak()
  {
      for (Pet p:petList)
         System.out.println(p.getName()+" "+p.speak());
  }
}