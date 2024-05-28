package practice;
/*     ******** Computer memory units*********
      bit = binary digit
      1 Nibble = 4 bits
      1 Byte = 8 bits
      1 Kilo byte (KB) = 1024 bytes
      1 Mega byte (MB) =1024 kilo bytes
      1 Giga byte (GB) =1024 mega bytes
      1 Tera byte (TB) =1024 giga bytes
      1 Peta byte (PB) =1024 tera byte
 */
public class DataTypesSize {
	
		
	public static void main(String[] args) {
		
		System.out.println(Byte.BYTES); //1 bytes
		System.out.println(Byte.MAX_VALUE);// 127
		System.out.println(Byte.MIN_VALUE);// -128
		
		System.out.println(Short.SIZE/8);// 2 bytes
		System.out.println(Short.BYTES);// 2 bytes
		System.out.println(Short.MIN_VALUE); //-32768
		System.out.println(Short.MAX_VALUE); //32767
		
		System.out.println(Long.BYTES);// 8 bytes
		System.out.println(Long.MIN_VALUE);// -9223372036854775808
		System.out.println(Long.MAX_VALUE);// 9223372036854775807
		
		System.out.println(Integer.BYTES); // 4 bytes
		System.out.println(Integer.MAX_VALUE);// 2147483647
		System.out.println(Integer.MIN_VALUE);// -2147483648
		
		System.out.println(Float.BYTES); // 4 bytes
		System.out.println(Float.MAX_VALUE);// 3.4028235E38
		System.out.println(Float.MIN_VALUE);// 1.4E-45
		
		
		System.out.println(Double.BYTES);// 8 bytes
		System.out.println(Double.MIN_VALUE);// 4.9E-324
		System.out.println(Double.MAX_VALUE);// 1.7976931348623157E308
		
		System.out.println(Character.BYTES); // 2 bytes
		
		System.out.println(Boolean.FALSE); // false
		System.out.println(Boolean.TRUE); // true
		
		

	}

}
