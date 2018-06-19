use test;

DROP TABLE IF EXISTS book;
CREATE TABLE book(
    id INT(11) NOT null AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    author VARCHAR(100),
    isbn VARCHAR(20),
    printYear INT,
    readAlready boolean,
    PRIMARY KEY(id))
ENGINE = INNODB
DEFAULT CHARACTER SET = utf8;



INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title1', 'description0','author1','isbn1','2011','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title2', 'description1','author2','isbn1','2012','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title3', 'description02','author3','isbn1','2010','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title4', 'description03','author4','isbn1','2015','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title5', 'description04','author5','isbn1','2014','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title6', 'description01','author6','isbn1','2011','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title7', 'description01','author7','isbn1','2015','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title8', 'description10','author8','isbn1','2017','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title9', 'description12','author9','isbn1','2018','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title10', 'description16','author10','isbn1','2018','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title11', 'description10','author11','isbn1','2014','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title12', 'description01','author12','isbn1','2011','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title13', 'description1','author13','isbn1','2012','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title14', 'description10','author14','isbn1','2014','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title15', 'description001','author15','isbn1','2016','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title16', 'description1','author16','isbn1','2017','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title17', 'description01','author17','isbn1','2018','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title18', 'description1','author18','isbn1','2017','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title19', 'description01','author19','isbn1','2012','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title20', 'description1','author20','isbn1','2011','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title21', 'description16','author21','isbn1','2010','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title22', 'description18','author22','isbn1','2013','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title23', 'description1','author23','isbn1','2013','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title24', 'description189','author24','isbn1','2014','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title25', 'description19','author25','isbn1','2015','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title26', 'description178','author26','isbn1','2016','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title27', 'description177','author27','isbn1','2017','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title28', 'description188','author28','isbn1','2018','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title29', 'description10','author29','isbn1','2011','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title30', 'description891','author30','isbn1','2010','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title31', 'description1966','author31','isbn1','2010','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title32', 'description15005','author32','isbn1','2015','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title33', 'description15','author33','isbn1','2016','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title34', 'description1550','author34','isbn1','2016','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title35', 'description1','author35','isbn1','2010','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title36', 'description1568','author36','isbn1','2015','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title37', 'description177789','author37','isbn1','2018','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title38', 'description199981','author38','isbn1','2014','1');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title39', 'description1','author39','isbn1','2011','0');
INSERT INTO book (title,description,author,isbn,printYear,readAlready) VALUES ('title40', 'description1','author40','isbn1','2012','1');