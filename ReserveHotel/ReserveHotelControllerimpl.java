package ReserveHotel;


import service.userservice;
import service.userserviceimpl;

public class ReserveHotelControllerimpl  implements ReserveHotelController{
	private userservice userser;
	private ReserveHotel view;
	public ReserveHotelControllerimpl(){
		userser = new userserviceimpl(1);
	}
	@Override
	public int getcredit() {
		// TODO Auto-generated method stub
		return userser.getcredit();
	}
	
	public void setview(ReserveHotel view) {
		// TODO Auto-generated method stub
		this.view = view;
	}
}
