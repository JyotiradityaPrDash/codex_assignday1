//greatest no. using terenay operator
public class A1p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out;
		int a=69, b=48, c=72, d=86;
		out = a>b? a:b;
		out = (c > d?(c > out? c:out) : (d > out? d: out));
		System.out.println("greatest no. "+out);

	}

}
