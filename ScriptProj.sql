/*CREATE DATABASE "RPDMS"
    WITH 
    OWNER = rpdadm
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;*/
	
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

