package modelo.dominio;
public class FormularioCarga{

	 private Byte cv;
	 private float remuneracion;

	// Constructores:
		public FormularioCarga(Byte cv,float remuneracion){
			this.cv = cv
			this.remuneracion = remuneracion
		}

	// Setters y Getters:
		public Byte getCV(){
			return cv;
		}

		public void setCV(Byte cv){
			this.cv = cv;
		}

		public float getRemuneracion(){
			return remuneracion;
		}

		public void setRemuneracion(float remuneracion){
			this.remuneracion = remuneracion;
		}
}