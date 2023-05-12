package com.yedam.print;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
				int iValue1 = 37;
				int iValue2 = 91;
				System.out.println("iValue1 : " + iValue1 + " iValue2 : " + iValue2);
				
				//2
				System.out.println(iValue1 + iValue2);
				System.out.println(iValue2 - iValue1);
				System.out.println(iValue1 * iValue2);
				System.out.println(iValue2 / iValue1);
				
				//3
				int var1 = 128;
				System.out.printf("%d, %s\n",var1, "int");
				
				String var2 = "B";
				System.out.printf("%s, %s\n",var2, "String");
				
				char var3 = 44032;
				System.out.printf("%s, %s\n",var3, "char");
				
				long var4 = 100000000000L;
				System.out.printf("%d, %s\n",var4, "long");
				
				double var5 = 43.93106;
				System.out.printf("%8.5f, %s\n",var5, "double");
				
				float var6 = 301.3f;
				System.out.printf("%.1f, %s\n",var6, "float");
				
				//4
				byte a = 35;
				byte b = 25;
				int c = 463;
				long d = 1000L;
				
				long result1 = a+c+d;
				System.out.println(result1);
				
				int result2 = a + b + c;
				System.out.println(result2);
				
				double e = 45.31;
				double result3 = c + d + e;
				System.out.println(result3);
				
				//5
				int intValue1 = 24;
				int intValue2 = 3;
				int intValue3 = 8;
				int intValue4 = 10;
				char charValue = 'A';
				String strValue = "번지";
				

				
				System.out.println(charValue + ((intValue1 + intValue2) +
						(intValue3 + strValue)) + (double)intValue4);
				
				
	}

}
