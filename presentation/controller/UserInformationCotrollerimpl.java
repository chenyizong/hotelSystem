package presentation.controller;
import javax.swing.JLabel;
import javax.swing.JTextField;

import presentation.UserInformation;
import presentation.UserInformationCotroller;
import service.*;
public class UserInformationCotrollerimpl  implements UserInformationCotroller{
	private userservice userser;
	private UserInformation view;
	
public UserInformationCotrollerimpl(){
	userser = new userserviceimpl(1);
}
	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setview(UserInformation view) {
		// TODO Auto-generated method stub
		this.view = view;
	}

	@Override
	public void registerprocessButton() {
		// TODO Auto-generated method stub
		
	}
	public int getcredit(){
		return userser.getcredit();
		
	}





}
