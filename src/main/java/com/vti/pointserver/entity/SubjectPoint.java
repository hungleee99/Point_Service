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

@Entity
@Table(name = "subject_point")
public class SubjectPoint implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@JoinColumn(name = "subjectId", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Subject subjectId;

	@JoinColumn(name = "userId", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private User userId;

	@Column(name = "`chuyen_can`", nullable = false)
	private Short chuyenCan;

	@Column(name = "`kiem_tra1`", nullable = false)
	private Short kiemTra1;

	@Column(name = "`kiem_tra2`", nullable = false)
	private Short kiemTra2;

	@Column(name = "`hocky`", nullable = false)
	private Short hocKy;

	@Column(name = "`trungbinh`", nullable = false)
	private Float trungBinh;

	public SubjectPoint() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Subject getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Subject subjectId) {
		this.subjectId = subjectId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Short getChuyenCan() {
		return chuyenCan;
	}

	public void setChuyenCan(Short chuyenCan) {
		this.chuyenCan = chuyenCan;
	}

	public Short getKiemTra1() {
		return kiemTra1;
	}

	public void setKiemTra1(Short kiemTra1) {
		this.kiemTra1 = kiemTra1;
	}

	public Short getKiemTra2() {
		return kiemTra2;
	}

	public void setKiemTra2(Short kiemTra2) {
		this.kiemTra2 = kiemTra2;
	}

	public Short getHocKy() {
		return hocKy;
	}

	public void setHocKy(Short hocKy) {
		this.hocKy = hocKy;
	}

	public Float getTrungBinh() {
		return trungBinh;
	}

	public void setTrungBinh(float trungBinh) {
		this.trungBinh = (float) (this.chuyenCan + this.hocKy + this.kiemTra1 + this.kiemTra2) / 4;
	}

}
