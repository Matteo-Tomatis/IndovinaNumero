package it.polito.tdp.IndovinaNumero.model;

public class Gioco {
	
	private final int TMax=8;
	private final int NMax=100;
	private int NTentativiFatti;
	private int numeroSegreto;
	
	public Gioco() {
		NTentativiFatti = 0;
		this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
		
	}
	
	public int getNTentativiFatti() {
		return NTentativiFatti;
	}
	
	public void setNTentativiFatti(int nTentativiFatti) {
		NTentativiFatti = nTentativiFatti;
	}
	
	public int getNumeroSegreto() {
		return numeroSegreto;
	}
	
	public void setNumeroSegreto(int numeroSegreto) {
		this.numeroSegreto = numeroSegreto;
	}
	
	public int getTMax() {
		return TMax;
	}
	
	public int getNMax() {
		return NMax;
	}
	
	public int faiTentativo(int tentativo) {
		//incrementare numero tentativi fatti
    	this.NTentativiFatti++;
    	
    	/**
    	 * giocare
    	 * 0: hai vinto
    	 * 1: num max tentativi raggiunto, hai perso
    	 * 2: num troppo alto
    	 * 3: num troppo basso
    	 */
    	if (tentativo == this.numeroSegreto) {
    		return 0;
    	}
    	
    	if (this.NTentativiFatti == this.TMax) {
    		return 1;
    	}
    	
    	if(tentativo>this.numeroSegreto) {
    		return 2;
    	}else  {
    		return 3;
    	}
	}
	
	

}
