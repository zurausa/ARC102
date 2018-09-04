import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainB {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		List<Integer> resList = new ArrayList<>();
		if(y1>y2){
			resList.add(x2-(y2-y1));
			resList.add(y2+(x2-x1));
			resList.add(x1-(y2-y1));
			resList.add(y1+(x2-x1));
		}else{
			resList.add(x2-(y2-y1));
			resList.add(y2+(x2-x1));
			resList.add(x1-(y2-y1));
			resList.add(y1+(x2-x1));
		}
		for(int i=0;i<4;i++){
			out.print(resList.get(i));
			if(i!=3){
				out.print(" ");
			}else{
				out.println();
			}
		}
		out.flush();
	}
}
