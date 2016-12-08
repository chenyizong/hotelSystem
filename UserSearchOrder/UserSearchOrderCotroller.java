package UserSearchOrder;

import java.util.Collection;
import java.util.List;

import vo.OrderVo;

public interface UserSearchOrderCotroller {
 void cancel();
 void setview(UserSearchOrder view);
 int getUserID();
 List<OrderVo> getAllOrders(int userId);
 List<OrderVo> getUnfinishedOrders(int userId);
 List<OrderVo> getFinishedOrders(int userId);
 List<OrderVo> getAbnormalOrders(int userId);
 List<OrderVo> getCancelOrders(int userId);
}
