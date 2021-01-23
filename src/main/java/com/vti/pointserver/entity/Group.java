package com.vti.pointserver.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "`group`")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`", unique = true, nullable = false)
	private int id;
	
	@Column(name = "`name`", nullable = false, length = 30, unique = true)
	private String groupName;
	
	@JoinColumn(name = "manageId", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private User managerId;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
	private Collection<GroupUser> groupUserCollection;
	
	public Group() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public User getManageId() {
		return managerId;
	}

	public void setManageId(User manageId) {
		this.managerId = manageId;
	}

	public Collection<GroupUser> getGroupUserCollection() {
		return groupUserCollection;
	}

	public void setGroupUserCollection(Collection<GroupUser> groupUserCollection) {
		this.groupUserCollection = groupUserCollection;
	}
	
}
