package gap;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";
		String str1="india";
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str = str +" hello ";
		System.out.println(str);
		System.out.println(str.hashCode());
		str= str +" hai";
		System.out.println(str);
		System.out.println(str.hashCode());

	}

}
