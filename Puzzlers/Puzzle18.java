public class Puzzle18 {

	public static void main(String[] args) {
	
		byte[] bytes = new byte[256];
	
		for(int i = 0; i < 256; i++){
			bytes[i] = (byte)i;
			// System.out.println(bytes[i]);
		}
		
		String str = new String(bytes);
		System.out.println(str);
		System.out.println(str.length());
		
		// for(int i = 0, n = str.length(); i < n; i++)
		// 	System.out.print((int)str.charAt(i) + " ");
	}
}