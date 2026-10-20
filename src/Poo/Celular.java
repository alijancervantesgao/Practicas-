package Poo;

public class Celular {
	
		String marca, modelo, color;
		int ram, rom;

		public Celular() {
			super();
		}

		public Celular(String marca, String modelo, String color, int ram, int rom) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.ram = ram;
			this.rom = rom;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getRom() {
			return rom;
		}

		public void setRom(int rom) {
			this.rom = rom;
		}

		@Override
		public String toString() {
			return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ram=" + ram + ", rom=" + rom
					+ "]";
		}

		public void llmar() {
			System.out.println("LLAMANDO DESDE MI " + marca + modelo);
		}

	}

