import java.io.*;
import java.util.*;
import java.lang.*;

public class ex104{
	public static void main(String[] args) throws IOException{

		HashMap<String,Integer> map = new HashMap<>(); 

		File f = new File("numbers.txt");
		Scanner ler = new Scanner(f);
		while(ler.hasNextLine()){
			String linha = ler.nextLine();
			String[] pal = linha.strip().split(" ");
			int num = Integer.parseInt(pal[0]);
			map.put(pal[2],num);
		}

		for(int i = 0; i < args.length; i++){
			 System.out.printf("%d ",map.get(args[i]));
		}
	}
}