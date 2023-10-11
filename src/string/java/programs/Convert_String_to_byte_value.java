package string.java.programs;

public class Convert_String_to_byte_value {

	public static void main(String[] args) {
		String str="asdfghjkjhgf";
		byte[] b =str.getBytes();
		for(byte b1:b) System.out.print(b1+",");
		String str2="2";
		byte b2=Byte.valueOf(str2);
		System.out.println("\n"+b2);
		byte b3=Byte.parseByte(str2);
		System.out.println(b3);
		

	}

}
