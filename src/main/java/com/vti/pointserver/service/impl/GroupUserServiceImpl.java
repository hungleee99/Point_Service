package com.vti.pointserver.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.pointserver.entity.GroupUser;
import com.vti.pointserver.entity.User;
import com.vti.pointserver.repository.GroupUserRepository;
import com.vti.pointserver.repository.UserRepository;
import com.vti.pointserver.service.GroupUserService;

@Service
public class GroupUserServiceImpl implements GroupUserService {
	@Autowired
	private GroupUserRepository groupUserRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsersOfGroup(int groupId) {
		return groupUserRepository.findAllByGroupId(groupId);
	}

	@Override
	public void updateUsersToGroup(List<GroupUser> groupUsers) {
		List<GroupUser> groupUser = new ArrayList<>();
		List<Integer> userIds = new ArrayList<>();
		for (GroupUser userInGroup : groupUsers) {
				userIds.add(userInGroup.getId());
			}
			groupUserRepository.saveAll(groupUser);
	}
}
