import sun.security.util.Length;

public class MainClass{

	public static void main(String[] args) {
//		Calculator cal = () -> System.out.println(" switch on ");
//		cal.swithOn();
//		Calculator cal=(input)-> System.out.println(" sum method on ");
//		cal.sum(10);
		
		
		Calculator cal=( s1, s2) ->{
			// TODO Auto-generated method stub
//					if(s1.length()>s2.length()) {
//					return	" s2 length is < than s1";
//					}else {
//						return " s2 length is > than s1";
//					}	
			String s=(s1.length()>s2.length())?" s2 length is < than s1":" s2 length is > than s1";
					
					return s;
		};
		System.out.println(cal.returnString("neeraj","Jha"));
					
					
	}



	
}
