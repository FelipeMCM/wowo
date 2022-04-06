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
		
//		System.out.println("Cheque essas 50 palavras e anote a tradução para cada uma\r\n"
//				+ "que você não souber no arquivo 'lista3k.properties'.\r\n"
//				+ "Após isso configure os loops'while'\r\n"
//				+ "e a lista no 'SYSO' logo abaixo, dessa forma o programa\r\n"
//				+ " irá funcionar corretamente de acordo com as instruções adiante\r\n"
//				+ ". Feito isso execute o código e comece a praticar seu inglês.");
//		
//		
//		
//		for(int o = 1140; o < 1190; o++) {
//			System.out.println(palavras.getPalavra().get(o));
//		}
//		
		br.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" A lista das 12 palavras em inglês a serem aprendidas hoje são:\r\n"
				+ "1-Furniture, 2-funding, 3-fund, 4-fully, 5-full, 6-front, 7-fresh,\r\n "
				+ "8-framework, 9-frame, 10-founder, 11-forward, 12-forth.\r\n"
				+ "Escolha um número dentre estes que corresponde a respectiva palavra,\r\n"
				+ "após isso digite a(s) tradução(ões) dessa palavra uma por vez\r\n"
				+ "Atenção se você digitar errado o número da palavra, irá perder uma chance.\r\n"
				+ "Bem como se digitar a tradução errada.");
		
		
		for(int f = 0; f < 12; f++) {
			String traducao = sc.next();
			
			
			
			while(traducao.equalsIgnoreCase("1")) {
				System.out.println("A palavra escolhida é 1-'furniture'");
				
						
				
				
				String takeTranslate1 = producaoLista3K.getProperty("furniture");
				
				
				String[] subStringTranslate1 = takeTranslate1.split(",", 2);
				
				
				
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate1[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate1[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate1[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate1[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				
					
					
				};
			};
					
				

			
			while(traducao.equalsIgnoreCase("4")) {
				System.out.println("A palavra escolhida é 4-'fully', agora digite sua tradução.");
				
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("fully"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("fully"));
					System.out.println("Esta palavra contém apenas esta tradução.");
					break;
				};
				
				
			};
			
			

			while(traducao.equalsIgnoreCase("2")) {
				System.out.println("A palavra escolhida é 2-'funding'");
				
						
				
				
				String takeTranslate2 = producaoLista3K.getProperty("funding");
				
				
				String[] subStringTranslate2 = takeTranslate2.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate2[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate2[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate2[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate2[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			while(traducao.equalsIgnoreCase("3")) {
				System.out.println("A palavra escolhida é 3-'fund'");
				
						
				
				
				String takeTranslate3 = producaoLista3K.getProperty("fund");
				
				
				String[] subStringTranslate3 = takeTranslate3.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate3[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate3[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate3[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate3[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("5")) {
				System.out.println("A palavra escolhida é 5-'full'");
				
						
				
				
				String takeTranslate4 = producaoLista3K.getProperty("full");
				
				
				String[] subStringTranslate4 = takeTranslate4.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate4[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate4[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate4[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate4[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate4[2])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate4[2]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("6")) {
				System.out.println("A palavra escolhida é 6-'front'");
				
						
				
				
				String takeTranslate5 = producaoLista3K.getProperty("front");
				
				
				String[] subStringTranslate5 = takeTranslate5.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate5[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate5[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");		
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate5[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate5[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate5[2])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate5[2]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("7")) {
				System.out.println("A palavra escolhida é 7-'fresh'");
				
						
				
				
				String takeTranslate6 = producaoLista3K.getProperty("fresh");
				
				
				String[] subStringTranslate6 = takeTranslate6.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate6[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate6[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate6[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate6[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("8")) {
				System.out.println("A palavra escolhida é 8-'framework'");
				
				String takeTranslate7 = producaoLista3K.getProperty("framework");
				
				
				String[] subStringTranslate7 = takeTranslate7.split(",", 2);
				for(int i = 0; i < 2; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate7[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate7[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
								
					} else if(traducao.equalsIgnoreCase(subStringTranslate7[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate7[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("9")) {
				System.out.println("A palavra escolhida é 9-'frame'");
				
						
			
				
				String takeTranslate8 = producaoLista3K.getProperty("frame");
				
				
				String[] subStringTranslate8 = takeTranslate8.split(",", 3);
				for(int i = 0; i < 3; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate8[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate8[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate8[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate8[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate8[2])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate8[2]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					};
				};
			};
			
			
			while(traducao.equalsIgnoreCase("10")) {
				System.out.println("A palavra escolhida é 10-'founder', agora digite sua tradução.");
				
				traducao = sc.next();
				
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("founder"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("founder"));
					System.out.println("Esta palavra contém apenas esta tradução.");
				
				
				};
			};
			
			
			while(traducao.equalsIgnoreCase("11")) {
				System.out.println("A palavra escolhida é 11-'forward'");
				
						
				
				
				String takeTranslate9 = producaoLista3K.getProperty("forward");
				
				
				String[] subStringTranslate9 = takeTranslate9.split(",", 4);
				for(int i = 0; i < 4; i++) {
					traducao = sc.next();
					if(traducao.equalsIgnoreCase(subStringTranslate9[0])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate9[0]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate9[1])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate9[1]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} if(traducao.equalsIgnoreCase(subStringTranslate9[2])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate9[2]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
						
					} else if(traducao.equalsIgnoreCase(subStringTranslate9[3])) {
						System.out.println("Parabéns a tradução desta palavra é: " + subStringTranslate9[3]);
						System.out.println("Esta é a " + (i + 1) + "º tradução que você digitou corretamente");
					};
				};
			};
			
			while(traducao.equalsIgnoreCase("12")) {
				System.out.println("A palavra escolhida é 12-'forth', agora digite sua tradução.");
				traducao = sc.next();
			
				if(traducao.equalsIgnoreCase(producaoLista3K.getProperty("forth"))) {
					System.out.println("Parabéns a tradução desta palavra é: " + producaoLista3K.getProperty("forth"));
					System.out.println("Esta palavra contém apenas esta tradução.");
					
					
				};
			};	
			
			
		};
			
		sc.close();
		
		
		

	};
	
	
};
