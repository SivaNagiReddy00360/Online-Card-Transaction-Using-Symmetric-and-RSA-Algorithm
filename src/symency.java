
public class symency
{

  static int decimalToBinary (int N)
  {

    // To store the binary number
    int B_Number = 0;
    int cnt = 0;
    while (N != 0)
      {
	int rem = N % 2;
	double c = Math.pow (10, cnt);
	  B_Number += rem * c;
	  N /= 2;

	// Count used to store exponent value
	  cnt++;
      }

    return B_Number;
  }

  public static int getDecimal (int binary)
  {
    int decimal = 0;
    int n = 0;
    while (true)
      {
	if (binary == 0)
	  {
	    break;
	  }
	else
	  {
	    int temp = binary % 10;
	    decimal += temp * Math.pow (2, n);
	    binary = binary / 10;
	    n++;
	  }
      }
    return decimal;
  }
  static String addZeros(String str, int n)
	{
		for (int i = 0; i < n; i++)
		{
			str = "0" + str;
		}
		return str;
	}
	
	static String getXOR(String a, String b)
	{
	
		int aLen = a.length();
		int bLen = b.length();
	
		if (aLen > bLen)
		{
			b = addZeros(b, aLen - bLen);
		}
		else if (bLen > aLen)
		{
			a = addZeros(a, bLen - aLen);
		}
	
		int len =  Math.max(aLen, bLen);;
		String res = "";
		
		for (int i = 0; i < len; i++)
		{
			if (a.charAt(i) == b.charAt(i))
				res += "0";
			else
				res += "1";
		}
		return res;
	}


 /*public static void main (String[]args)
  {
    int cvv = 12345;
    int ck = 554;
    
    int bincvv = decimalToBinary (cvv);
    System.out.println ("binary accno :" + bincvv);
    int binck = decimalToBinary (ck);
    System.out.println ("binary ck :" +binck);
    String strcvv = Integer.toString(bincvv);
    String strck = Integer.toString(binck);
    String xorvalue = getXOR (strcvv, strck);
    System.out.println ("xor value :" +xorvalue);
    
    int ciphercvv = getDecimal (Integer.parseInt(xorvalue));
    System.out.println ("binary cipher :" +ciphercvv);





  }*/

}
