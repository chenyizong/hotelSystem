package dataservice;

import po.UserPo;

public interface userdataservice {
	boolean insert(UserPo  upo);
	boolean update(UserPo  upo);
	UserPo find(int id);
}
