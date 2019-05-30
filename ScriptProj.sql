CREATE DATABASE "RPDMS"
    WITH 
    OWNER = rpdadm
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
	
CREATE SEQUENCE policial_ID
INCREMENT 1
MINVALUE 10000
MAXVALUE 10999
NO CYCLE;

CREATE TABLE Policial ( 
	policialID INT NOT NULL DEFAULT NEXTVAL ('policial_ID'),
  	cpf VARCHAR(15) NOT NULL,
	nome VARCHAR(50) NOT NULL,
	dataNasc VARCHAR(12) NOT NULL,
	raca VARCHAR(10) NOT NULL,
	genero CHAR,
	tipoSanguineo VARCHAR(3),
	estadoCivil VARCHAR(10),
	endereco VARCHAR(50),
	salario REAL NOT NULL,
	condicao VARCHAR(15) NOT NULL,
	divisao VARCHAR(12) NOT NULL,
	patente VARCHAR(20) NOT NULL,
	formacao VARCHAR(60) NOT NULL,
	especialidade VARCHAR(30),
	PRIMARY KEY (policialID),
	UNIQUE (policialID)
);
  
CREATE SEQUENCE civil_ID
INCREMENT 1
MINVALUE 2000000
MAXVALUE 2099999
NO CYCLE;

CREATE TABLE Civil (
	civilID INT NOT NULL DEFAULT NEXTVAL ('civil_ID'),
  	cpf VARCHAR(15) NOT NULL,
	nome VARCHAR(50) NOT NULL,
	dataNasc VARCHAR(12) NOT NULL,
	raca VARCHAR(10) NOT NULL,
	genero CHAR,
	tipoSanguineo VARCHAR(3),
	estadoCivil VARCHAR(10),
	endereco VARCHAR(50),
	condicao VARCHAR(15) NOT NULL,
	antecedentes BOOLEAN,
	PRIMARY KEY (civilID),
	UNIQUE (civilID)
);

CREATE TABLE Suspeito (
  suspeitoID INT NOT NULL,
  crime VARCHAR(30),
  cela VARCHAR(20),
  PRIMARY KEY (suspeitoID),
  FOREIGN KEY (suspeitoID) REFERENCES Civil(civilID),
  UNIQUE (suspeitoID)
);

CREATE TABLE Prioridade (
	numPrioridade INT NOT NULL,
	descricao VARCHAR(10),
	PRIMARY KEY (numPrioridade)
);

CREATE SEQUENCE veiculo_ID
INCREMENT 1
MINVALUE 50000
MAXVALUE 50999
NO CYCLE;

CREATE TABLE Veiculo (
	veiculoID INT NOT NULL DEFAULT NEXTVAL ('veiculo_ID'),
	placa VARCHAR(7) NOT NULL,
	modelo VARCHAR(50) NOT NULL,
	ano INT,
	prioridade INT NOT NULL,
	condicao VARCHAR(10) NOT NULL,
	PRIMARY KEY (veiculoID),
	FOREIGN KEY (prioridade) REFERENCES Prioridade(numPrioridade),
	UNIQUE (veiculoID)
);

CREATE SEQUENCE cod_Caso
INCREMENT 1
MINVALUE 4000000
MAXVALUE 4099999
NO CYCLE;

CREATE TABLE Caso (
	codCaso INT NOT NULL DEFAULT NEXTVAL ('cod_Caso'),
	condicao VARCHAR(10),
	PRIMARY KEY (codCaso)
);

CREATE SEQUENCE cod_Ocorrencia
INCREMENT 1
MINVALUE 300000
MAXVALUE 309999
NO CYCLE;

CREATE TABLE Ocorrencia (
	codOcorrencia INT NOT NULL DEFAULT NEXTVAL ('cod_Ocorrencia'),
	descricao VARCHAR(100) NOT NULL,
	codigoPolicial INT NOT NULL,
	codigoSuspeito INT,
	codigoCivil INT,
	prioridade INT,
	codigoCaso INT,
	PRIMARY KEY (codOcorrencia),
	FOREIGN KEY (codigoPolicial) REFERENCES Policial(policialID),
	FOREIGN KEY (codigoSuspeito) REFERENCES Suspeito(suspeitoID),
	FOREIGN KEY (codigoCivil) REFERENCES Civil(civilID),
	FOREIGN KEY (prioridade) REFERENCES Prioridade(numPrioridade),
	FOREIGN KEY (codigoCaso) REFERENCES Caso(codCaso),
	UNIQUE (codOcorrencia)
);




/* CRUD - Insert */


INSERT INTO Policial VALUES ('10330','141128441-12','Marvin Branagh','24/09/1963','Afro-Descendente','M','A','Casado','Rua Southern 12 Downtown','2500','ativo','R.P.D.','tenente','Academia de Policia de Raccoon City','Estrategísta');
INSERT INTO Policial VALUES ('10340','142233440-11','Chris Redfield','14/06/1970','Caucasiano','M','A','Solteiro','Rua Lightning 12 Downtown','2100','ativo','S.T.A.R.S.','oficial','Academia de Policia de Raccoon City','Liderança');
INSERT INTO Policial VALUES ('10350','143174443-10','Leon S. Kennedy','20/10/1977','Caucasiano','M','B','Solteiro',NULL,'2000','ativo','R.P.D.','oficial','Academia de Policia de Raccoon City','Experiência em armas e artes marciais');

INSERT INTO Civil VALUES ('2001123','132125441-10','Robert Kendo','13/05/1966','Caucasiano','M','O','Casado','Rua Northwest 46 Downtown','empregado','0');
INSERT INTO Civil VALUES ('2001124','133126442-11','Ben Bertolucci','22/02/1971','Caucasiano',M','AB','Solteiro','Rua ChainHill 76 Downtown','empregado','0');
INSERT INTO Civil VALUES ('2001125','134128444-14','Seu Madruga','15/06/1954','Caucasiano','M','B','Solteiro','Rua Gentalha 72 Vila','desempregado','0');
INSERT INTO Civil VALUES ('2001132','136132443-12','Billy Coen','12/07/1979','Caucasiano','M','A','Solteiro',NULL,'empregado','0');

INSERT INTO Suspeito VALUES ('2001132','assassinatos em série',NULL);

INSERT INTO Veiculo VALUES ('50020','GF2223','Ford Crown Victoria','1995','2','disponivel');
INSERT INTO Veiculo VALUES ('50021','SA8844','Chevrolet Step Van','1986','1','disponivel');
INSERT INTO Veiculo VALUES ('50022','HJ9771','Chevrolet Caprice','1985','3','disponivel');

INSERT INTO Ocorrencia VALUES ('304034','Suspeito de assassinato em série visto nos arredores das montanhas Arklay, supostamente caucasiano','10340','2001132','2001124','Alta','4001002');

INSERT INTO Caso VALUES ('4001002','pendente');



/* CRUD - Select */



SELECT * FROM Policial;
SELECT * FROM Policial WHERE divisao = 'R.P.D.';

SELECT nome FROM Civil;
SELECT * FROM Civil WHERE condicao = 'desempregado';

SELECT crime FROM Suspeito;

SELECT veiculoID FROM Veiculo;
SELECT * FROM Veiculo WHERE ano >= 1990;

SELECT codOcorrencia FROM Ocorrencia;

SELECT condicao FROM Caso;



/* CRUD - Update */



UPDATE Policial SET condicao = 'dispensado' WHERE policialID = '10340';

UPDATE Civil SET condicao = 'desempregado' WHERE civilID = '2001124';

UPDATE Civil SET antecedentes = '1' WHERE civilID = '2001132';

UPDATE Suspeito SET cela = '01' WHERE suspeitoID = '2001132';

UPDATE Veiculo SET condicao = 'em uso' WHERE placa = 'GF2223';

UPDATE Ocorrencia SET 
descricao = 'Suspeito de assassinato em série visto nos arredores das montanhas Arklay, caucasiano, cabelos pretos, regata branca e calças camufladas'
WHERE codOcorrencia = '304034';

UPDATE Caso SET condicao = 'arquivado' WHERE codCaso = '4001002';



/* CRUD - Delete */



DELETE FROM Policial WHERE policialID = '10340';

DELETE FROM Civil WHERE civilID = '2001125';

DELETE FROM Suspeito;

DELETE FROM Veiculo WHERE placa = 'HJ9771';

DELETE FROM Caso;

DELETE FROM Ocorrencia;
