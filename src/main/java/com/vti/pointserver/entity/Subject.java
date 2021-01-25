package com.vti.pointserver.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "`subject`")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Basic(optional = false)
	@Column(name = "`name`", unique = true, nullable = false, length = 30)
	private String subjectName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
	@JsonIgnore
	private Collection<SubjectPoint> userPointCollection;
	
	public Subject() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Collection<SubjectPoint> getUserPointCollection() {
		return userPointCollection;
	}

	public void setUserPointCollection(Collection<SubjectPoint> userPointCollection) {
		this.userPointCollection = userPointCollection;
	}
	
}
