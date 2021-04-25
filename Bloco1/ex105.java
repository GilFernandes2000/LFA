import java.io.*;
import java.util.*;
import java.lang.*;

public class ex105{
	public static void main(String[] args) throws IOException{

		HashMap<String,Integer> map = new HashMap<>(); 
		List<Integer> list = new ArrayList<Integer>();

		File f = new File("numbers.txt");
		Scanner ler = new Scanner(f);
		while(ler.hasNextLine()){
			String linha = ler.nextLine();
			String[] pal = linha.strip().split(" ");
			int num = Integer.parseInt(pal[0]);
			map.put(pal[2],num);
		}

		for(int i = 0; i < args.length; i++){
			 int x = map.get(args[i]);
			 list.add(x);
		}
		int n1 = list.get(0);
		int resultado = 0;
		int agregado = n1;
		for(int i = 1; i < list.size(); i++){
			int n2 = list.get(i);
			if(n2 > n1){
				agregado = agregado*n2;
				n1 = n2;
			}
			else{
				if(agregado == 0){
					agregado = n2;
				}
				resultado = resultado + agregado;  //nao faço ideia do problema aqui
				agregado = 0;
				n1 = n2;
			}
		}
		System.out.println(resultado);
	}
}