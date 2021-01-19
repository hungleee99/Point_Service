package com.vti.pointserver.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "group_user")
public class GroupUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	@JsonIgnore
	private User userId;

	@JoinColumn(name = "groupId", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	@JsonIgnore
	private Group groupId;

	public GroupUser() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Group getGroupId() {
		return groupId;
	}

	public void setGroupId(Group groupId) {
		this.groupId = groupId;
	}

}
