package it.polito.tdp.extflightdelays.model;

public class Accoppiamenti {

	private String state1;
	private String state2;
	private double peso;
	
	public Accoppiamenti(String state1, String state2, double peso) {
		this.state1 = state1;
		this.state2 = state2;
		this.peso = peso;
	}

	public String getState1() {
		return state1;
	}

	public String getState2() {
		return state2;
	}

	public double getPeso() {
		return peso;
	}
}
