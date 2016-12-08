package main;

import javax.swing.JFrame;

import presentation.ReserveHotel;
import presentation.UserInformation;
import presentation.controller.ReserveHotelControllerimpl;
import presentation.controller.UserInformationCotrollerimpl;

public class main {
	public static void main(String args[]){

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		UserInformation gui = new UserInformation(new UserInformationCotrollerimpl());	
//		ReserveHotel gui = new ReserveHotel(new ReserveHotelControllerimpl());
		frame.getContentPane().add(gui);
		frame.setVisible(true);
		
	}
}
