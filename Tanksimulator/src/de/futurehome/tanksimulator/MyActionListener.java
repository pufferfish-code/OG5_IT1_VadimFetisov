package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);
		
		if (obj == f.btnEinfuellen) {
			 double fuellstand = f.myTank.getFuellstand();
			 int fuellstand1 = (int)f.myTank.getFuellstand();
			 
			 fuellstand = fuellstand + 5;
			 fuellstand1 = 200 / 100 * (int)fuellstand;
			 
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblFuelPro.setText(""+Double.toString(fuellstand1));
			 
			 
		}
		
		if (obj == f.btnVerbrauchen) {
			 double fuellstand = f.myTank.getFuellstand();
			 double fuellstand1 = f.myTank.getFuellstand();
			 
			 fuellstand = fuellstand - 2;
			 fuellstand1 = 200 / 100 * fuellstand;
			 
			 f.myTank.setFuellstand(fuellstand);

			 f.lblFuellstand.setText(""+fuellstand);
			 f.lblFuelPro.setText(""+Double.toString(fuellstand1)+"%");
		}
		
		if (obj == f.btnZuruck) {
			double fuellstand = f.myTank.getFuellstand();
			fuellstand = 0;
			f.myTank.setFuellstand(fuellstand);

			f.lblFuellstand.setText(""+fuellstand);
		}
		
		

	}
}