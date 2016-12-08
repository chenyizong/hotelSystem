package service;

import java.util.List;

import vo.OrderVo;

public interface userservice {
	
public int getcredit();
/**
 * @param userId
 * @return	获取用户所有订单列表
 */
public   List<OrderVo> getAllOrders(int userId);
/**
 * @param userId
 * @return	获取用户未执行订单列表
 */
public List<OrderVo> getUnfinishedOrders(int userId);

/**
 * @param userId
 * @return	获取用户已执行订单列表
 */
public List<OrderVo> getFinishedOrders(int userId);

/**
 * @param userId
 * @return	获取用户异常订单列表
 */
public List<OrderVo> getAbnormalOrders(int userId);
/**
 * @param userId
 * @return	获取用户已撤销订单列表
 */
public List<OrderVo> getCancelOrders(int userId);

/**
 * @param orderId
 * @return	获取订单用户编号
 */
public int getOrderUser(int orderId);

/**
 * @param orderId
 * @return	获取订单价值
 */
public int getOrderPrice(int orderId);

}
