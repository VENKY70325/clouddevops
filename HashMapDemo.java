import java.util.*;
class HashMapDemo
{
  public static void main(String args[])
  {
    HashMap<String,Long>hm=new HashMap<String,Long>();
    String name,Str;
    Long phone;
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      System.out.println("1.enter phone entries");
      System.out.println("2.Loop in the book");
      System.out.println("3.display names");
      System.out.println("4.exit");
      System.out.println("enter ur choice");
      int choice=sc.nextInt();
      switch(choice)
      { 
        case 1:
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter phno");
        Str=sc.next();
        phone=new Long(Str);
        hm.put(name,phone);
        break;

        case 2:
        System.out.println("enter name");
        name=sc.next();
        phone=hm.get(name);
        System.out.println("key is"+phone);
        break;
    
        case 3:
        Set<String>set=new HashSet<String>();
        set=hm.keySet();
        System.out.println("keys are"+set);
        break;
        
        case 4:
        return;
      }
    }
  }
}