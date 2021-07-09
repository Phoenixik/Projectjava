use Library

create table mynewtour( 

Tourid int IDENTITY(0001,1) PRIMARY KEY, 
Tourfn varchar(20),
Tourln varchar(20),
Tournumber BIGINT,
Tourmail varchar(50),
Tourprice int,
Touroccu varchar(50),
Tourtlo varchar(50) FOREIGN KEY REFERENCES tourtable(Tourtlo),
Tourdays varchar(50),
Tourbind varchar(50),
Tourbed varchar(50),
Tourbgr varchar(10),
Refno int, 

)

create table tourtable(

Tid int IDENTITY(1,0001),
Tourtlo varchar(50) PRIMARY KEY
)
create table mynewtour( 

Tourid int IDENTITY(0001,1) PRIMARY KEY, 
Tourfn varchar(20),
Tourln varchar(20),
Tournumber BIGINT,
Tourmail varchar(50),
Tourprice int,
Touroccu varchar(50),
Tourtlo varchar(50) FOREIGN KEY REFERENCES tourtable(Tourtlo),
Tourdays varchar(50),
Tourbind varchar(50),
Tourbed varchar(50),
Tourbgr varchar(10),
Refno int, 

)