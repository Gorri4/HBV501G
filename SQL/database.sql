DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Exercise;
DROP TABLE IF EXISTS MultipleChoiceQuestions;

CREATE TABLE Users (
	ID int NOT NULL PRIMARY KEY,
	Username	varchar(255)	NOT NULL UNIQUE,
	PW		varchar(255)	NOT NULL,
	Email		varchar(255)	NOT NULL UNIQUE,
	Score		int(4)		DEFAULT 0
);

CREATE TABLE Exercise (
	ID integer PRIMARY KEY AUTOINCREMENT,
	Name		varchar(50)	NOT NULL UNIQUE,
	Lvl		INT(2)		DEFAULT 1
);

CREATE TABLE MultipleChoiceQuestions (
	ID integer PRIMARY KEY AUTOINCREMENT,
	Exercise	int,
	Question	varchar(255)	NOT NULL,
	Choice1		varchar(255) NOT NULL,
	Choice2		varchar(255) NOT NULL,
	Choice3		varchar(255) NOT NULL,
	Choice4		varchar(255) NOT NULL,
	Answer int	NOT NULL

);


INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Appelsína",	"Pera",		"Epli",		"Ananas",	3);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Pera",		"Appelsína",	"Vínber",	"Epli",		2);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Kona",		"Vatn",		"Strákur",	"Maður",		4);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Kona",		"Vatn",		"Strákur",	"Maður",		3);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Maður",	"Kona",		"Strákur",	"Vatn",			2);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Borð",		"Stóll",	"Sófi",		"Rúmföt",		1);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1,	"Borð",		"Rúmföt",	"Stóll",	"Fiskur",		3);

INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Mér finnst gaman að ______ í sjónum",	"synda",	"æla",		"baka",		"lesa",		1);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Ég ______ á sjónvarpið",		"hoppa",	"borða",	"horfi",	"æli",		3);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Karlinn ______ á tölvunni",		"hleypur",	"kveikir",	"rífur",	"syngur",	2);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Barnið ______ mömmu sína",		"leiðir",	"les",		"syngur",	"syndir",	1);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Rithöfundurinn ______ bók",		"bakar",	"hleypur",	"kveikir",	"skrifar",	4);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Mamma ______ köku",			"bakar",	"rífur",	"hleypur",	"syngur",	1);
INSERT INTO MultipleChoiceQuestions VALUES (NULL, 1, 	"Hlauparinn ______ 4 km",		"leiðir",	"syngur",	"hleypur",	"kveikir",	3);


