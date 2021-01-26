package com.vti.pointserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;

@Service
public interface GroupUserService {
	List<User> getUsersOfGroup(int groupId);
	
	void updateUsersToGroup(List<GroupUser> groupUsers);
	
}
