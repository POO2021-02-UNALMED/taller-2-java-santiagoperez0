papackage test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	int cantidadAsientos(){
		int c = 0;
		for	(int i=0; i<asientos.length;i++) {
			if(asientos[i]!=null)
			c++;
		}
		return c;
	}
	String verificarIntegridad() {
		String v= "Las piezas no son originales";
		String aV= "Auto original";
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null && asientos[i].registro != this.registro ) {
				return  v;
			}
			}
		if (this.registro != motor.registro) {
			return v;
		} else {
			return aV;
		}

	}


}
