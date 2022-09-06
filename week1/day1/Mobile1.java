package week1.day1;

public class Mobile1 
{
	public void makeCall() {
	
		System.out.println("Make a call");
		String MobileModel="One Plus 7";
		float MobileWeight=200.5f;
	}
	 public void sendSMS() {
	 
		 System.out.println("Send SMS");
		 boolean fullycharged=true;
		 int MobileCost=40000;
	 }

	 public static void main(String[] args) {

		 System.out.println("This is my mobile");
		 Mobile1 obj=new Mobile1();
		 obj.sendSMS();
		 obj.makeCall();
		 System.out.println(MobileModel);
		 


}

}

