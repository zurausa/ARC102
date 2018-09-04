import java.io.PrintWriter;


public class MainA {
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int K = sc.nextInt();
		if(K%2==1){
			int L = (K+1)/2;
			out.println(L*(L-1));
		}else{
			int L = K/2;
			out.println(L*L);
		}
		out.flush();
	}
}

