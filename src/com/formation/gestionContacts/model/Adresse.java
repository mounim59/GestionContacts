package com.formation.gestionContacts.model;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String rue;
	private String codePostal;
	private String ville;
	private String pays;
	
	public Adresse() {
		super();
	}

	public Adresse(int id, String rue, String codePostal, String ville, String pays) {
		super();
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", pays="
				+ pays + "]";
	}
	
	
	
	
}
