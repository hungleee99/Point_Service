-- create database
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;

-- create table: User
DROP TABLE IF EXISTS 	`User`;
CREATE TABLE IF NOT EXISTS `User` ( 	
	id 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`username`	 	CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`username`) >= 6 AND LENGTH(`username`) <= 50),
	`email` 		CHAR(50) NOT NULL UNIQUE CHECK (LENGTH(`email`) >= 6 AND LENGTH(`email`) <= 50),
	`password` 		VARCHAR(800) NOT NULL,
	`firstName` 	NVARCHAR(50) NOT NULL,
	`lastName` 		NVARCHAR(50) NOT NULL,
<<<<<<< HEAD
=======
    `address` 		varchar(50) not null,
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
	`role` 			ENUM('Admin','Student','Manager') NOT NULL DEFAULT 'Student'
);
-- Create table Registration_User_Token
DROP TABLE IF EXISTS 	`Registration_User_Token`;
CREATE TABLE IF NOT EXISTS `Registration_User_Token` ( 	
	id 				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`token`	 		CHAR(36) NOT NULL UNIQUE,
	`user_id` 		SMALLINT UNSIGNED NOT NULL,
	`expiryDate` 	DATETIME NOT NULL
);

-- Create table Reset_Password_Token
DROP TABLE IF EXISTS 	`Reset_Password_Token`;
CREATE TABLE IF NOT EXISTS `Reset_Password_Token` ( 	
	id 				INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`token`	 		CHAR(36) NOT NULL UNIQUE,
	`user_id` 		SMALLINT UNSIGNED NOT NULL,
	`expiryDate` 	DATETIME NOT NULL
);

create table `Group`(
	groupId TINYINT unsigned auto_increment primary key,
    `name` varchar(30) not null,
    manageId int,
    FOREIGN KEY (groupId) REFERENCES `User` (id) ON DELETE CASCADE
    );
    
create table Group_user(
    groupId TINYINT unsigned,
    userId TINYINT unsigned,
	PRIMARY KEY(groupId,userId),
   FOREIGN KEY (groupId) REFERENCES `Group` (groupId),
   FOREIGN KEY (userId) REFERENCES `User` (id)
);

create table `subject`(
	subjectId TINYINT unsigned auto_increment primary key,
<<<<<<< HEAD
    `name` varchar(30)
=======
    `name` varchar(30),
    `exam_day` date not null
>>>>>>> 631892d166cd0f6160c2a1b300e1b2a69955ed77
);


create table subject_point(
	subjectId TINYINT unsigned,
    userId TINYINT unsigned,
    `chuyen_can`tinyint not null,
    `kiemtra_1` tinyint not null,
    `kiemtra_2` tinyint not null,
    `hocky` tinyint not null,
    `trungbinh` tinyint not null,
    foreign key(subjectId) references `subject`(subjectId),
    foreign key(userId) references `User`(id)
);
/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data User

-- password: 123456
INSERT INTO User (`username`,			`email`,						`password`,			`firstName`,	`lastName`, 	`role`)
VALUE			('hanh.havan@vti',		'hanhhanoi1999@gmail.com',		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Hà',			'Văn Hanh',			'Manager'), 
				('thanhhung12@vti',		'hung122112@gmail.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn ',		'Thanh Hưng',		'Manager'), 
				('can.tuananh@vti',		'cananh.tuan12@vti.com',		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Cấn',			'Tuấn Anh',			'Manager'), 
				('toananh123@vti',		'toananh123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Anh Toàn',			'Manager'), 
				('duynn123@vti',		'duynguyen123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Duy',				'Manager'), 
				('manhhung123@vti',		'manhhung123@vti.com',			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Mạnh Hùng',		'Manager'),
 				('maianhvti123',		'maianhng@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Mai Anh',			'Student'),
				('tuanvti12344',		'tuan1234@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Văn Tuấn',			'Student'),
				('ngthuy123',			'thuyhanoi@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Thị Thủy',			'Student'),
				('quanganhvti',			'quanganh@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Quang Anh',		'Manager'),
				('hoanghungvti',	    'hunghoang@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',   'Vũ',			'Hoàng Hưng',		'Student'),
				('quocanhvti',			'quocanh12@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Quốc Anh',			'Admin'	),
				('vananhvti',			'vananhb1@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Vân Anh',			'Student'),
				('nguyentrinhvti',		'trinh123@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Thị Trinh',		'Manager'),
				('tuanhungvti',			'tuanhung@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Vũ',			'Tuấn Hưng',		'Student'),
				('xuanmaivti',			'xuanmai12@gmail.com', 			'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Nguyễn',		'Xuân Mai',			'Student'),
				('quanghungvti',		'hungnguyen@gmail.com', 		'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',	'Phạm',			'Quang Hưng',		'Student');