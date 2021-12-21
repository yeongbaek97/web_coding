create table pj_member(
m_id varchar2(20 char) primary key,
m_pw varchar2(30 char) not null,
m_name varchar2(20 char) not null,
m_addr varchar2(100 char) not null,
m_photo varchar2(200 char) not null
)

drop table pj_member cascade constraint purge;

insert into pj_member values('mz', '1004', '1', '1', '1');

select * from pj_member;


create table pj_sns(
s_no number(5) primary key,
s_owner varchar2(20 char) not null,
s_txt varchar2(300 char) not null,
s_date date not null
)

create sequence pj_sns_seq;

insert into pj_sns values(pj_sns_seq.nextval, 'mz', 'text~~', sysdate);
select * from pj_sns;


create table pj_sns_reply(
	r_no number(5) primary key, 		
	r_s_no number(5) not null,		
	r_owner varchar2(10 char) not null,
	r_txt varchar2(100 char) not null,
	r_when date not null,
	constraint s_r
		foreign key(r_s_no)
		references pj_sns(s_no)
		on delete cascade
);
create sequence pj_sns_reply_seq;

---------------------------------------------------
create table pj_dataroom(
	d_no number(5) primary key, 			
	d_owner varchar2(10 char) not null,
	d_title varchar2(25 char) not null, 
	d_file varchar2(200 char) not null,
	d_category char(6 char) not null
);

create sequence pj_dataroom_seq;
select * from pj_dataroom;


-------------------------------------------------
create table pj_gallery(
	g_no number(5) primary key, 			
	g_owner varchar2(10 char) not null,
	g_title varchar2(25 char) not null, 
	g_file varchar2(200 char) not null
);
create sequence pj_gallery_seq;


-------------------------------------------------

create table pj_community(
	c_no number(5) primary key,
	c_from varchar2(10 char) not null,
	c_to varchar2(10 char) not null,
	c_txt varchar2(200 char) not null,
	c_when date not null
);
create sequence pj_community_seq;




