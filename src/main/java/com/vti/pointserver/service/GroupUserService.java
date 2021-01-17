package com.vti.pointserver.service;

import java.util.List;
import com.vti.pointserver.entity.GroupUser;


public interface GroupUserService {
	List<GroupUser> getUsersOfGroup(int groupId);
	
	void removeUsersFromGroup(List<Integer> userIds, int groupId);
	
	void updateUsersToGroup(List<GroupUser> groupUsers);
	
}
