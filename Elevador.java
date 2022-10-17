/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.work;

import java.util.ArrayList;

/**
 *
 * @author henrique
 */
public class Elevador {
	private int andarAtual;
	private int andarDesejado;
	public ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	private final static double PESO_MAX = 80.0;// kg
    private Porta porta;
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public ArrayList<Pessoa> getPessoa() {
		if (pesoTotal() <= PESO_MAX) {
			System.err.print("Peso maximo atingido");
			return null;
		}
		return pessoa;
	}

	public void setPessoa(ArrayList<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	private double pesoTotal() {
		double pesoTotal = 0.0;

		for (Pessoa p : getPessoa()) {
			pesoTotal += p.getPeso();

		}

		return pesoTotal;
	}

	public int getAndarDesejado() {
		return andarDesejado;
	}

	public void setAndarDesejado(int andarDesejado) {
		this.andarDesejado = andarDesejado;
	}

	public Porta getPorta() {
		return porta;
	}

	public void setPorta(Porta porta) {
		this.porta = porta;
	}
	

}