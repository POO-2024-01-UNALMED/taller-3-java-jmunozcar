package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		if (estado == true) {
			if (1 <= canal && canal <= 120) {
				this.canal = canal;
			}
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if (estado == true && 0 <= volumen && 7 >= volumen) {
			this.volumen = volumen;
		}
		
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado == true) {
			if (canal < 120) {
				canal++;
			}
		}
	}
	
	public void canalDown() {
		if (estado == true) {
			if (canal > 1) {
				canal--;
			}
		}
	}
	
	public void volumenUp() {
		if (estado == true) {
			if (volumen < 7) {
				volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (estado == true) {
			if (volumen > 0) {
				volumen--;
			}
		}
	}
}
