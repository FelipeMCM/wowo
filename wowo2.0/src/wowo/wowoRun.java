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
		
//		System.out.println("Cheque essas 50 palavras e anote a tradu��o para cada uma\r\n"
//				+ "que voc� n�o souber no arquivo 'lista3k.properties'.\r\n"
//				+ "Ap�s isso configure os loops'while'\r\n"
//				+ "e a lista no 'SYSO' logo abaixo, dessa forma o programa\r\n"
//				+ " ir� funcionar corretamente de acordo com as instru��es adiante\r\n"
//				+ ". Feito isso execute o c�digo e comece a praticar seu ingl�s.");
//		
//		
//		
//		for(int o = 1140; o < 1190; o++) {
//			System.out.println(palavras.getPalavra().get(o));
//		}
//		
		br.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" A lista das 12 palavras em ingl�s a serem aprendidas hoje s�o:\r\n"
				+ "1-Furniture, 2-funding, 3-fund, 4-fully, 5-full, 6-front, 7-fresh,\r\n "
				+ "8-framework, 9-frame, 10-founder, 11-forward, 12-forth.\r\n"
				+ "Escolha um n�mero dentre estes que corresponde a respectiva palavra,\r\n"
				+ "ap�s isso digite a(s) tradu��o(�es) dessa palavra uma por vez\r\n"
				+ "Aten��o se voc� digitar errado o n�mero da palavra, ir� perder uma chance.\r\n"
				+ "Bem como se digitar a tradu��o errada.");
		
		
		for(int f = 0; f < 12; f++) {
			String traducao = sc.next();
			
			
			
			while(traducao.equalsIgnoreCase("1")) {
				System.out.println("A palavra escolhida � 1-'furniture'");
				
						
				
				
				String takeTranslate1 = producaoLista3K.getProperty("furniture");
				
				
				String[] subStringTranslate1 = takeTranslate1.split(",", 2);
				
				
				
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate1[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate1[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate1[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate1[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				
					
					
				};
			};
					
				

			
			while(traducao.equalsIgnoreCase("4")) {
				System.out.println("A palavra escolhida � 4-'fully', agora digite sua tradu��o.");
				
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fully"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("fully"));
					System.out.println("Esta palavra cont�m apenas esta tradu��o.");
					break;
				};
				
				
			};
			
			

			while(traducao.equalsIgnoreCase("2")) {
				System.out.println("A palavra escolhida � 2-'funding'");
				
						
				
				
				String takeTranslate2 = producaoLista3K.getProperty("funding");
				
				
				String[] subStringTranslate2 = takeTranslate2.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate2[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate2[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate2[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate2[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			while(traducao.equalsIgnoreCase("3")) {
				System.out.println("A palavra escolhida � 3-'fund'");
				
						
				
				
				String takeTranslate3 = producaoLista3K.getProperty("fund");
				
				
				String[] subStringTranslate3 = takeTranslate3.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate3[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate3[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate3[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate3[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("5")) {
				System.out.println("A palavra escolhida � 5-'full'");
				
						
				
				
				String takeTranslate4 = producaoLista3K.getProperty("full");
				
				
				String[] subStringTranslate4 = takeTranslate4.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate4[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate4[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate4[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate4[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate4[2])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate4[2]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("6")) {
				System.out.println("A palavra escolhida � 6-'front'");
				
						
				
				
				String takeTranslate5 = producaoLista3K.getProperty("front");
				
				
				String[] subStringTranslate5 = takeTranslate5.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate5[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate5[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate5[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate5[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate5[2])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate5[2]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("7")) {
				System.out.println("A palavra escolhida � 7-'fresh'");
				
						
				
				
				String takeTranslate6 = producaoLista3K.getProperty("fresh");
				
				
				String[] subStringTranslate6 = takeTranslate6.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate6[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate6[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate6[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate6[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("8")) {
				System.out.println("A palavra escolhida � 8-'framework'");
				
				String takeTranslate7 = producaoLista3K.getProperty("framework");
				
				
				String[] subStringTranslate7 = takeTranslate7.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate7[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate7[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
								
					} else if(traducao.equalsIgnoreCase(subStringTranslate7[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate7[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("9")) {
				System.out.println("A palavra escolhida � 9-'frame'");
				
						
			
				
				String takeTranslate8 = producaoLista3K.getProperty("frame");
				
				
				String[] subStringTranslate8 = takeTranslate8.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate8[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate8[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate8[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate8[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate8[2])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate8[2]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("10")) {
				System.out.println("A palavra escolhida � 10-'founder', agora digite sua tradu��o.");
				
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("founder"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("founder"));
					System.out.println("Esta palavra cont�m apenas esta tradu��o.");
				
				
				};
			};
			
			
			while(traducao.equalsIgnoreCase("11")) {
				System.out.println("A palavra escolhida � 11-'forward'");
				
						
				
				
				String takeTranslate9 = producaoLista3K.getProperty("forward");
				
				
				String[] subStringTranslate9 = takeTranslate9.split(",", 4);
				for(int i = 0; i < 4; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate9[0])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate9[0]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate9[1])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate9[1]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate9[2])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate9[2]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate9[3])) {
						System.out.println("Parab�ns a tradu��o desta palavra �: " + subStringTranslate9[3]);
						System.out.println("Esta � a " + (i + 1) + "� tradu��o que voc� digitou corretamente");
					};
				};
			};
			
			while(traducao.equalsIgnoreCase("12")) {
				System.out.println("A palavra escolhida � 12-'forth', agora digite sua tradu��o.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forth"))) {
					System.out.println("Parab�ns a tradu��o desta palavra �: " + producaoLista3K.getProperty("forth"));
					System.out.println("Esta palavra cont�m apenas esta tradu��o.");
					
					
				};
			};	
			
			
		};
			
		sc.close();
		
		
		

	};
	
	
};
