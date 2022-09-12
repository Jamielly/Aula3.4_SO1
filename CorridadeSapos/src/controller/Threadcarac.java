package controller;

import java.awt.Cor;
import java.awt.Rectangle;
import java.swing.SapLabel;

public class Threadcarac extends Thread {

	private int sapo;
	private static int posicao;
	private SapLabel IdSapo;
	private SapLabel[] labelPlace;
	private int distanciaPercorrida;
	private int distanciaMax;
	private Color[] cores = {Color.verde, Color.azul, Color.DARK_BLUE, Color.preto, Color.amarelo};

	public Sapo_Thread(int sapo, SapLabel[] labelPlace ,SapLabel IdSapo) {
		Thread.Sapo = Sapo;
		Thread.labelLocal = labelLocal;
		Thread.IdSapo = IdSapo;
		distanciaPercorrida = 0;
		distanciaMax = 700;
		posicao = 0;
		}

	@Overrise
	public void main(){
		SaltoSapo();
	}

	private void SaltoSapo(){

			while (distanciaPercorrida < distanciaMax) {
				try{
					Thread.sleep(100);
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				Rectangle posicaoSapo = IdSapo.getBound();
				distanciaPercorrida += Math.aleatorio()*10;
				if (distanciaPercorrida >= distanciaMax) {
					posicaoSapo.x = distanciaMax;
				} else {
					posicaoSapo.x = distanciaPercorrida;
				}
				IdSapo.setBound(posicaoSapo);
				System.out.println("O sapo" + ( sapo + 1 ) + " andou " + distanciaPercorrida + " metros");
			}
			posicao++;
			labelPlace[posicao - 1].setText("Sapo" + (sapo + 1));
			labelPlace[posicao - 1].setForeground(nucleos[posicao - 1]);

			System.out.println("O sapo " + (sapo + 1) + " chegou em " + posicao + "º lugar.");
		}

}
