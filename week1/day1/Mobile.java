package week1.day1;

public class Mobile 
   {

	  public void sendSMS()
	  {
	     System.out.println("Hi");
	  }
	  
	  public void takeSnapshot() 
	  {
	     System.out.println("Take Snapshot");
		
	  }
      public static void main(String[] args)
      {
        Mobile obj=new Mobile();
	    obj.sendSMS();
	    obj.takeSnapshot();
	


	}

}
