package projet.calculatrices.integer;

public class Operations {
	private double resultat;
	private String operation;
	public Operations(double resultat, String operation) {
		super();
		this.resultat = resultat;
		this.operation = operation;
	}
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String toString() {
		//return "Personne:"+nom+prenom+email+dateDeNaissance+",";
		return "Res:" +resultat+ ", Operation:" + operation;
	}
	}
