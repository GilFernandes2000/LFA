import java.util.*;
import java.io.*;
import java.lang.*;

public class ex106 {
	public static void main(String[] args) throws IOException {

		HashMap<String, String> map = new HashMap<>();

		File f = new File("dic2.txt");
		Scanner ler = new Scanner(f);
		while (ler.hasNextLine()) {
			String linha = ler.nextLine();
			String[] pal = linha.split(" ");
			String p = "";
			for (int i = 1; i < pal.length; i++) {
				if (pal[i] != " ") {
					if (i == pal.length - 1) {
						p = p + pal[i];
					} else {
						p = p + pal[i] + " ";
					}
				}
			}
			p = p.trim();
			map.put(pal[0], p);
		}

		Set<String> keys = map.keySet();
		for (int i = 0; i < args.length; i++) {
			if (keys.contains(args[i])) {
				args[i] = map.get(args[i]);
			}
		}

		String fim = "";
		for (int i = 0; i < args.length; i++) {
			fim = fim + args[i] + " ";
		}

		System.out.print(fim);
		ler.close();
	}
}
