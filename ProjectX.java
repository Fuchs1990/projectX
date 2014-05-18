package de.facharbeit.projectX;

public class ProjectX {

	private int zahl1;
	private boolean bool;

	public int getZahl() {
		return zahl1;
	}

	public void setZahl(int zahl1) {
		this.zahl1 = zahl1;
	}
	
	public void setBool(boolean bool){
		this.bool = bool;
	}

	public int multiplizieren(int zahl2) {
		if(bool){
		return zahl1 * zahl2;
		}
		return zahl1;
	}
}
