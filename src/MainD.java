import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainD {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int L = sc.nextInt();
		int r=0;
		List<Pair> resList = new ArrayList<>();
		for(int i=19;i>0;i--){
			if(Math.pow(2, i)<=L){
				r = i;
				break;
			}
		}
		int N = r+1;
		for(int i=1;i<N;i++){
			resList.add(new Pair(i,i+1,0));
			resList.add(new Pair(i, i+1, (int)Math.pow(2, i-1)));
		}
		for(int i=r;i>0;i--){
			int tmp = (int) Math.pow(2, i-1);
			if((L-tmp)>=Math.pow(2, r)){
				resList.add(new Pair(i, N, L-tmp));
				L -= tmp;
			}
		}
		out.println(N+" "+resList.size());
		for(Pair tmp: resList){
			out.println(tmp.u+" "+tmp.v+" "+tmp.w);
		}
		out.flush();
	}
}

class Pair{
	final int u;
	final int v;
	final int w;
	public Pair(int u, int v, int w){
		this.u=u;
		this.v=v;
		this.w=w;
	}
}
