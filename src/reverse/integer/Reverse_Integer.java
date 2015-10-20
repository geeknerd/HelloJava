package reverse.integer;

import org.junit.Test;

/**
 * 
 * @author Yi Xia
 * @date Oct 20, 2015
 *
 */
public class Reverse_Integer {
	public long reverse(long x) {
		String s_x = String.valueOf(x);
		String output = "";
		long r_x = 0;
		if(s_x.charAt(0)=='-'){
			output = new StringBuilder(s_x.substring(1)).reverse().toString();
		}else{
			output = new StringBuilder(s_x).reverse().toString();
		}
		r_x = Long.parseLong(output);
		if(s_x.charAt(0)=='-'){
			return -r_x;
		}
		else{
			return r_x;
		}
	}
	
	@Test
	public void testRI(){
		long x = 9646324351L;
		long output = reverse(x);
	}
}
