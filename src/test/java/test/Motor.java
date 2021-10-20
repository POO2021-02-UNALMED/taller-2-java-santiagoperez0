package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;

	void cambiarRegistro(int n)
	{
		this.registro = n;
	}

  void asignarTipo(String tipoM) {
  		if (tipoMotor.equals("gasolina")||tipoMotor.equals("electrico")) {
  			this.tipo = tipoM;
  		}
  	}

}
