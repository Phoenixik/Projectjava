use Library
 
create table pricetable(
Tid int IDENTITY(1,1),
Tourprice int PRIMARY KEY
)
create table tourtable(
Tiid int IDENTITY(1,1),
Tourtlo varchar(50) PRIMARY KEY,
Tourprice int FOREIGN KEY REFERENCES pricetable(Tourprice)
)

create table mynewtour( 
Tourid int IDENTITY(1,1) PRIMARY KEY, 
Tourfn varchar(20),
Tourln varchar(20),
Tournumber varchar(11),
Tourmail varchar(50),
Tourprice int,
Touroccu varchar(50),
Tourtlo varchar(50) FOREIGN KEY REFERENCES tourtable(Tourtlo),
Tourdays varchar(50),
Tourbind varchar(50),
Tourbed varchar(50),
Tourbgr varchar(10)
)

create table validate(
loginid int IDENTITY(1,1) PRIMARY KEY,
adminname varchar(20),
adminpass varchar(20),
username varchar(20),
userpass varchar(20)
)

INSERT into validate (adminname, adminpass, username, userpass) values
('admin', 'admin', 'user', 'user')
INSERT into validate (adminname, adminpass, username, userpass) values
('myadmin', 'adminpass', 'user', 'user')