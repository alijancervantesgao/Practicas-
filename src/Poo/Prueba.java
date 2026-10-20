package Poo;

public class Prueba {

	public static void main(String[] args) {
		
			
				Celular poco = new Celular();
				poco.setMarca("XAOMI");
				poco.setModelo("POCO X6 PRO ");
				poco.setColor("negro");
				poco.setRam(8);
				poco.setRom(512);
				System.out.println(poco.toString());
				Celular iphone1 = new Celular("Apple", "Iphone 16", "Blanco", 8, 512);
				Celular iphone2 = new Celular("Apple", "Iphone 17 pro max", "Blanco", 8, 512);
				System.out.println(iphone1.toString());
				System.out.println(iphone2.toString());
				poco.llmar();
				iphone1.llmar();
				iphone2.llmar();

			
		
	}

}
