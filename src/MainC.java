import java.io.PrintWriter;

public class MainC {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K%2==1){
			out.println((long)Math.pow(Math.floor(N/K), 3));
		}else{
			int count0 =0;
			int countHalf =0;
			int half = K/2;
			for(int i=1;i<=N;i++){
				if(i%K==0)count0++;
				else if(i%K==half) countHalf++;
			}
			out.println((long)(Math.pow(count0, 3)+Math.pow(countHalf, 3)));
		}
		out.flush();
	}
}
