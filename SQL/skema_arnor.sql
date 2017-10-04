CREATE DATABASE icelandic4beginners;

CREATE TABLE Users (
	ID		int		NOT NULL,	
	Username	varchar(255)	NOT NULL UNIQUE,
	PW		varchar(255)	NOT NULL,
	Email		varchar(255)	NOT NULL UNIQUE,
	Score		int(4)		DEFAULT 0,
	PRIMARY KEY (ID)
);

CREATE TABLE Exercise (
	ID		INT		NOT NULL,
	Name		varchar(50)	NOT NULL UNIQUE,
	Lvl		INT(2)		DEFAULT 1,
	PRIMARY KEY (ID)
);

CREATE TABLE Questions (
	ID		int		NOT NULL,	
	Question	varchar(255)	NOT NULL UNIQUE,
	Exercise	int,
	Answer		int		NOT NULL,
	PRIMARY KEY (ID),
	FOREIGN KEY (Exercise)	REFERENCES Exercises(ID),
	FOREIGN KEY (Answer)	REFERENCES Answers(ID)
);

CREATE TABLE Answers (
	ID		int		NOT NULL,	
	Answer		varchar(50)	NOT NULL UNIQUE,
	PRIMARY KEY (ID)
);

CREATE TABLE Possible_Answer (
	Question	int		NOT NULL,
	Answer		int		NOT NULL,
	FOREIGN KEY (Question)	REFERENCES Questions(ID),
	FOREIGN KEY (Answer) 	REFERENCES Answers(ID)
);
