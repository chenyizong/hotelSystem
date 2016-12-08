package presentation.controller;

import java.util.List;

import presentation.UserSearchOrder;
import presentation.UserSearchOrderCotroller;
import service.userservice;
import service.userserviceimpl;
import vo.OrderVo;


public class UserSearchOrderCotrollerimpl implements UserSearchOrderCotroller{
	private userservice userso;
	private UserSearchOrder view;
	private int userId;

public UserSearchOrderCotrollerimpl(){
	userso = new userserviceimpl(userId);
	
}
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	public void setview(UserSearchOrder view) {
		// TODO Auto-generated method stub
		this.view = view;
	}
	public int getUserID() {
		// TODO Auto-generated method stub
		return 123;
	}
	public List<OrderVo> getAllOrders(int userId){
		// TODO Auto-generated method stub
		return userso.getAllOrders(userId);
	}
	public List<OrderVo> getUnfinishedOrders(int userId){
		// TODO Auto-generated method stub
		return userso.getUnfinishedOrders(userId);
	}
	public List<OrderVo> getFinishedOrders(int userId){
		// TODO Auto-generated method stub
		return userso.getFinishedOrders(userId);
	}
	public List<OrderVo> getAbnormalOrders(int userId){
		// TODO Auto-generated method stub
		return userso.getAbnormalOrders(userId);
	}
	public List<OrderVo> getCancelOrders(int userId){
		// TODO Auto-generated method stub
		return userso.getCancelOrders(userId);
	}
	



}
