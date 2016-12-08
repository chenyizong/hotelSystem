package vo;

import java.util.Vector;
import po.OrderPo;
import po.UserPo;
/**
 * orderNo		订单编号
 * orderInfo 	订单详情
 * entryTime	用户入住时间
 * liveTime		用户退房时间
 * price	           订单价值
 * hotelname    酒店名称
 */
public class OrderVo extends Vector<String>{
	public OrderVo(OrderPo orderPo){
		this.add(String.valueOf(orderPo.getId()));
		this.add(orderPo.getOrderInfo());
		String hotelname = orderPo.gethotelname();
		String entryTime = orderPo.getEntryTime();
		this.add(entryTime);
		this.add(orderPo.getLiveTime());
		this.add(String.valueOf(orderPo.getPrice()));
	}
	
	
	public OrderVo(int orderNo,String orderInfo, String hotelname, String entryTime,
			String liveTime,int price) {
		this.add(String.valueOf(orderNo));
		this.add(orderInfo);
		this.add(hotelname);
		this.add(entryTime);
		this.add(liveTime);
		this.add(String.valueOf(price));
	}
	


	public int getOrderNo(){
		return Integer.valueOf(this.get(0));
	}
	
	public String getOrderInfo(){
		return this.get(1);
	}
	
	public String gethotelname(){
		return this.get(2);
	}
	
	public String getEntryTime(){
		return this.get(3);
	}
	
	public String getLiveTime(){
		return this.get(4);
	}

	public int getPrice(){
		return Integer.valueOf(this.get(5));
	}
}
