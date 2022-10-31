//BERNARDO MARCO BORGARO
//ITAM
import java.util.*;

public class Institucion {
	
	//atributos
	private String name;
	private String adress;
	private int nAlbercas;
	private Rectangulo[] Coleccion;
	
	//Constructores
	public Institucion(String nombre, String direc, int nAl, Rectangulo[] colec) {
		this.name= nombre;
		this.adress= direc;
		this.nAlbercas= nAl;
		this.Coleccion= colec;
	}

	
	//Gets Sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getnAlbercas() {
		return nAlbercas;
	}

	public void setnAlbercas(int nAlbercas) {
		this.nAlbercas = nAlbercas;
	}

	public Rectangulo[] getColeccion() {
		return Coleccion;
	}

	public void setColeccion(Rectangulo[] coleccion) {
		Coleccion = coleccion;
	}

	//fun min
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Razon Social: \t"+ name);
		sb.append("\nDireccion: \t"+ adress);
		sb.append("\nNum de Albercas: \t"+ nAlbercas);
		sb.append("\nAlbercas: \t"+ Arrays.toString(Coleccion));
		return sb.toString();
	}
	
	public boolean equals(Institucion otro) {
		return(otro.name==this.name);
	}
	
	public int compareTo(Institucion otro) {
		return(Integer.compare(this.nAlbercas, otro.nAlbercas));
	}
	
	//fun class
	public double cnTecho(double base, double altura) {
		double costo= 0;
		int i=0;
		int j=nAlbercas+1;
		while(i<=(nAlbercas-1)) {
			if ((base== Coleccion[i].getBase() && Coleccion[i].getAltura()==altura)||(base== Coleccion[i].getAltura()&& altura== Coleccion[i].getBase())){
				j=i;
			}
			i++;
		}
		if (j<= nAlbercas) {
			if((base==Coleccion[j].getBase() && altura==Coleccion[j].getAltura())||(base==Coleccion[j].getAltura() && altura==Coleccion[j].getBase())) {
				costo=(base*altura)*1000;
			}
		}
		return costo;
	}
	
	public double cnTechoNum(int num) {
		double con=0;
		if (num<= nAlbercas-1) {
			con=(Coleccion[num].getAltura()*Coleccion[num].getBase()*1000);
		}
		
		return con;
	}
//	
//	La 
//	institución se caracteriza por su nombre, domicilio, total de albercas, y tamaño de las 
//	albercas (todas son de forma rectangular). 

}
