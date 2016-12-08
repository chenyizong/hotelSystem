package po;

public class OrderPo {

	private int id;
	
	private int hotelId;
	
	private int userId;
	
	private int status;
	
	private String entryTime;
	
	private String liveTime;
	
	private String orderInfo;
	
	private int price;

	private String hotelname;

	
	public OrderPo(){
		super();
	}

	public OrderPo(int id, int hotelId, int userId, int status,
			String entryTime, String lastTime,String orderInfo,int price, String liveTime, String hotelname) {
		super();
		this.id = id;
		this.hotelId = hotelId;
		this.userId = userId;
		this.status = status;
		this.entryTime = entryTime;
		this.liveTime = liveTime;
		this.orderInfo = orderInfo;
		this.price = price;
		this.hotelname = hotelname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getLiveTime() {
		return liveTime;
	}

	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}
	
	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    public String gethotelname(){
	return hotelname;
    }
	public void sethotelname(String hotelname) {
		// TODO Auto-generated method stub
		this.hotelname = hotelname;
	}
}
