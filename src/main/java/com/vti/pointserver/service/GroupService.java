package com.vti.pointserver.service;

import java.util.List;

import com.vti.pointserver.entity.Group;

public interface GroupService {
	List<Group> getAll();
	
	List<Group> findByManagerId(int id);
	
	Group createGroup(Group group);
	
	Group updateGroup(Group group);
	
	void deleteGroup(int id);
	
	Group getGroupById(int id);
	
	boolean checkGroupExists(String groupName);
}
