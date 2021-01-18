package com.vti.pointserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject_point")
public class Point implements Serializable{	
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name= "subjectId")
		private int subjectId;
		
		@Column(name="userId")
		private int userId;
		
		@Column(name=" `chuyen_can`", nullable = false)
		private byte  chuyen_can;
		
		@Column(name=" `kiemtra_1`", nullable = false)
		private byte  kiemtra_1;
	
		@Column(name=" `hocky`", nullable = false)
		private byte  hocky;
		
		@Column(name=" `trungbinh`", nullable = false)
		private byte  trungbinh;

		public void setSubjectId(int subjectId) {
			this.subjectId = subjectId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public void setChuyen_can(byte chuyen_can) {
			this.chuyen_can = chuyen_can;
		}

		public void setKiemtra_1(byte kiemtra_1) {
			this.kiemtra_1 = kiemtra_1;
		}

		public void setHocky(byte hocky) {
			this.hocky = hocky;
		}

		public void setTrungbinh(byte trungbinh) {
			this.trungbinh = trungbinh;
		}
}
