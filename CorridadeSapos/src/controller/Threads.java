package controller;

 import  java.awt.Cor;
 import  java.awt.event.Ação;
 import  java.awt.event.Sapo;
 import  java.swing.SapLabel;

public class Threads implements Thread_Sapo{

	private  SapLabel[] IdSapo, labelPlace;
	private  Sapo_Threads[] Sapo_Threads;

	 	public  Threads(SapLabel[] IdSapo, SapLabel[] labelPlace) {
	 		Thread.IdSapo = IdSapo;
		 	Thread.IdLocal = IdLocal;
			Sapo_Threads = new Sapo_Threads[IdSapo.comprimento];
		}

	 @Overrise
	 	public  void  actionPerformed(Sapo e) {
	 		for (int i = 0 ;i < Sapo_Threads.length; i++) {
			labelLocal[i].setText(i + 1 + "º lugar" );
			labelLocal[i].setForeground(cor.vermelho);
    		labelSapo[i].setBounds(0 ,(i + 1) * 60 ,56 ,16);
    		Sapo_Threads[i] = new  Sapo_Threads(i, labelPlace, IdSapo[i]);
			Sapo_Threads[i].init();
 		}
	 		}
}
