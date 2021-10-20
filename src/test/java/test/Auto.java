package test;
public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos()
	{
		int num_de_Asientos = 0;
		for (int i = 0 ; i < asientos.length; i++)
		{
			if (asientos[i] != null)
			{
				num_de_Asientos++;
			}

		}
		return num_de_Asientos;
	}

  String verificarIntegridad() {
        String verificar= "Las piezas no son originales";
        String autoVa= "Auto original";
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null && asientos[i].registro != this.registro ) {
                return  verificar;
            }
        }
        if (this.registro != motor.registro) {
            return verificar;
        } else {
            return autoVa;
        }

    }


}
}
