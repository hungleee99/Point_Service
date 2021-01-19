package com.vti.pointserver.service;

import java.util.List;
import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;


public interface GroupUserService {
	List<User> getUsersOfGroup(int groupId);
	
	void updateUsersToGroup(List<GroupUser> groupUsers);
	
}
