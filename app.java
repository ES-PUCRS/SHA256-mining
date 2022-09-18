import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.util.Arrays;

public class app {

	public static void main(String args[]) {
		MessageDigest digest = null;
		String clearName = args[0];
		String result = "";
		int counter = 0;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (Exception e) {}

		while(true) {
			byte[] encodedhash = digest.digest((clearName + String.valueOf(counter)).getBytes(StandardCharsets.UTF_8));
			result = bytesToHex(encodedhash);
			if(result.startsWith("0000000")) {
				char numb = result.charAt(7);
				if(Character.isDigit(numb) && ((int)numb >= 48 && (int) numb <= 51)) {
					System.out.println(result.toUpperCase());
					System.out.println(clearName + String.valueOf(counter));
					break;
				}
			}

			counter++;
		}
	}

	private static String bytesToHex(byte[] hash) {
	    StringBuilder hexString = new StringBuilder(2 * hash.length);
	    for (int i = 0; i < hash.length; i++) {
	        String hex = Integer.toHexString(0xff & hash[i]);
	        if(hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}

}

