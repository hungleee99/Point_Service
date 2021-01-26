package com.vti.pointserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.pointserver.entity.Group;
import com.vti.pointserver.repository.GroupRepository;
import com.vti.pointserver.repository.UserRepository;
import com.vti.pointserver.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	private GroupRepository groupRepository;
	
	@Override
	public List<Group> getAll() {
		return groupRepository.findAll();
	}

	@Override
	public List<Group> findByManagerId(int id) {
		return groupRepository.findByManagerId(id);
	}

	@Override
	public Group createGroup(Group group) {
		return groupRepository.save(group);
	}

	@Override
	public Group updateGroup(Group group) {
	    // get Group by id
	    Group groupCurrent = getGroupById(group.getId());
	    group.setGroupName(groupCurrent.getGroupName());
	    group.setManageId(groupCurrent.getManageId());
	    return groupRepository.save(groupCurrent);	
	    }

	@Override
	public void deleteGroup(int id) {
		groupRepository.deleteById(id);
	}

	@Override
	public Group getGroupById(int id) {
		return groupRepository.getOne(id);
	}

	@Override
	public boolean checkGroupExists(String groupName) {
		return groupRepository.existsByGroupName(groupName);
	}

}
