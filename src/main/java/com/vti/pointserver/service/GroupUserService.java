package com.vti.pointserver.service;

import java.util.List;
<<<<<<< HEAD
import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;


=======

import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;

@Service
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
public interface GroupUserService {
	List<User> getUsersOfGroup(int groupId);
	
	void updateUsersToGroup(List<GroupUser> groupUsers);
	
}
