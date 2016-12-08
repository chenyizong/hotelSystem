package presentation.controller;


import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.ReserveHotel;
import presentation.ReserveHotelController;
import service.userservice;
import service.userserviceimpl;

public class ReserveHotelControllerimpl  implements ReserveHotelController{
	private userservice userser;
	private ReserveHotel view;
	private controller con;
	
	
	public ReserveHotelControllerimpl(){
		userser = new userserviceimpl(1);
	}
	@Override
	public int getcredit() {
		// TODO Auto-generated method stub
		return userser.getcredit();
	}
	@Override
	public void setview(ReserveHotel view) {
		// TODO Auto-generated method stub
		this.view=view;
	}
	@Override
	public void setcon(controller controller) {
		// TODO Auto-generated method stub
		this.con=controller;
	}
	@Override
	public void change() {
		// TODO Auto-generated method stub
		
		con.search();
	}
	


}
