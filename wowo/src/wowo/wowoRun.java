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
		
		System.out.println("Cheque essas 50 palavras e anote a tradu��o para cada uma\r\n"
				+ "que voc� n�o souber no arquivo 'lista3k.properties'.\r\n"
				+ "Ap�s isso configure os loops'while'\r\n"
				+ "e a lista no 'SYSO' logo abaixo, dessa forma o programa\r\n"
				+ " ir� funcionar corretamente de acordo com as instru��es adiante\r\n"
				+ ". Feito isso execute o c�digo e comece a praticar seu ingl�s.");
		
		
		
		for(int o = 1140; o < 1190; o++) {
			System.out.println(palavras.getPalavra().get(o));
		}
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" A lista das 12 palavras em ingl�s a serem aprendidas hoje s�o:\r\n"
				+ "1-Furniture, 2-funding, 3-fund, 4-fully, 5-full, 6-front, 7-fresh,\r\n "
				+ "8-framework, 9-frame, 10-founder, 11-forward, 12-forth.\r\n"
				+ "Escolha um n�mero dentre estes que corresponde a determinada palavra,\r\n"
				+ "ap�s isso digite a tradu��o dessa palavra\r\n"
				+ "Aten��o se voc� apertar enter sem ter digitado nada, ir� perder uma chance.\r\n"
				+ "Bem como se digitar a tradu��o errada.");
		
		
		for(int f = 0; f < 12; f++) {
			String traducao = sc.next();
			
			
			
			while(traducao.equalsIgnoreCase("1")) {
				System.out.println("A palavra escolhida � 'furniture', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("furniture"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("furniture"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("4")) {
				System.out.println("A palavra escolhida � 'fully', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fully"))) {
				System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("fully"));
				System.out.println("Agora faltam " + (11 - f) + "palavras");
				break;
				
				};
			};
			
			
			while(traducao.equalsIgnoreCase("2")) {
				System.out.println("A palavra escolhida � 'funding', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("funding"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("funding"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			while(traducao.equalsIgnoreCase("3")) {
				System.out.println("A palavra escolhida � 'fund', agora digite sua tradu��o.");
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fund"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("fund"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("5")) {
				System.out.println("A palavra escolhida � 'full', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("full"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("full"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("6")) {
				System.out.println("A palavra escolhida � 'front', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("front"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("front"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("7")) {
				System.out.println("A palavra escolhida � 'fresh', agora digite sua tradu��o.");
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fresh"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("fresh"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("8")) {
				System.out.println("A palavra escolhida � 'framework', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("framework"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("framework"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("9")) {
				System.out.println("A palavra escolhida � 'frame', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("frame"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("frame"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("10")) {
				System.out.println("A palavra escolhida � 'founder', agora digite sua tradu��o.");
				traducao = sc.next();
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("founder"))) {
				System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("founder"));
				System.out.println("Agora faltam " + (11 - f) + "palavras");
				break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("11")) {
				System.out.println("A palavra escolhida � 'forward', agora digite sua tradu��o.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forward"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("forward"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};
			
			
			while(traducao.equalsIgnoreCase("12")) {
				System.out.println("A palavra escolhida � 'forth', agora digite sua tradu��o.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forth"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("forth"));
					System.out.println("Agora faltam " + (11 - f) + "palavras");
					break;
				};
			};	
			
			if( f == 12) {
				System.out.println("Voc� completou a memoriza��o de hoje. Cheque quantas acertou!");
			}
			
		};
		
		
		

	};
	
	
}
