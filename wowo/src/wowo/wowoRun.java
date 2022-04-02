package wowo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Scanner;



public class wowoRun {
	public static void main(String[] args) throws IOException {
		
		Properties producaoLista3K = new Properties();
		
		
		producaoLista3K.load(new FileReader("lista3k.properties"));
		
		FileInputStream fis = new FileInputStream("3mpei.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		
		
		
		Palavra palavras = new Palavra();
		LinkedList<String> palavraConjunto = new LinkedList<String>();
		palavras.setPalavra(palavraConjunto);
		
		
		for(int i = 0; i < 3000; i++) {
			String lerLinha = br.readLine();
			palavraConjunto.add(i, lerLinha);
			
			
		};
		
		System.out.println("Cheque essas 50 palavras e anote a tradução para cada uma\r\n"
				+ "que você não souber no arquivo 'lista3k.properties'.\r\n"
				+ "Após isso configure os loops'while'\r\n"
				+ "e a lista no 'SYSO' logo abaixo, dessa forma o programa\r\n"
				+ " irá funcionar corretamente de acordo com as instruções adiante\r\n"
				+ ". Feito isso execute o código e comece a praticar seu inglês.");
		
		
		
		for(int o = 1140; o < 1190; o++) {
			System.out.println(palavras.getPalavra().get(o));
		}
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" A lista das 12 palavras em inglês a serem aprendidas hoje são:\r\n"
				+ "1-Furniture, 2-funding, 3-fund, 4-fully, 5-full, 6-front, 7-fresh,\r\n "
				+ "8-framework, 9-frame, 10-founder, 11-forward, 12-forth.\r\n"
				+ "Escolha um número dentre estes que corresponde a determinada palavra,\r\n"
				+ "após isso digite a tradução dessa palavra\r\n"
				+ "Atenção se você apertar enter sem ter digitado nada, irá perder uma chance.\r\n"
				+ "Bem como se digitar a tradução errada.");
		
		
		for(int f = 0; f < 12; f++) {
			String traducao = sc.next();
			
			
			
			while(traducao.equalsIgnoreCase("1")) {
				System.out.println("A palavra escolhida é 'furniture', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("furniture"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("furniture"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("4")) {
				System.out.println("A palavra escolhida é 'fully', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fully"))) {
				System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("fully"));
				System.out.println("Agora faltam " + (11 - f) + "palavras");
				break;
				
				};
			};
			
			
			while(traducao.equalsIgnoreCase("2")) {
				System.out.println("A palavra escolhida é 'funding', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("funding"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("funding"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			while(traducao.equalsIgnoreCase("3")) {
				System.out.println("A palavra escolhida é 'fund', agora digite sua tradução.");
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fund"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("fund"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("5")) {
				System.out.println("A palavra escolhida é 'full', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("full"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("full"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("6")) {
				System.out.println("A palavra escolhida é 'front', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("front"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("front"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("7")) {
				System.out.println("A palavra escolhida é 'fresh', agora digite sua tradução.");
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fresh"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("fresh"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("8")) {
				System.out.println("A palavra escolhida é 'framework', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("framework"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("framework"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("9")) {
				System.out.println("A palavra escolhida é 'frame', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("frame"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("frame"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("10")) {
				System.out.println("A palavra escolhida é 'founder', agora digite sua tradução.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("founder"))) {
				System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("founder"));
				System.out.println("Agora faltam " + (11 - f) + "palavras");
				break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("11")) {
				System.out.println("A palavra escolhida é 'forward', agora digite sua tradução.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forward"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("forward"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("12")) {
				System.out.println("A palavra escolhida é 'forth', agora digite sua tradução.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forth"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("forth"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};	
			
			if( f == 12) {
				System.out.println("Você completou a memorização de hoje. Cheque quantas acertou!");
			}
			
		};
		
		
		

	};
	
	
}
