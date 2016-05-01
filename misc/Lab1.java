import java.net.*;

class InetAddressTest{
	public static void main(String as[]) throws UnknownHostException{
		InetAddress a = InetAddress.getLocalHost();
		System.out.println(a);
		
		a = InetAddress.getByName("www.facebook.com");
		System.out.println(a);

		InetAddress ad[] = InetAddress.getAllByName("www.google.com");
		for(int i=0; i<ad.length; i++)
			System.out.println(ad[i]);
	}
}
