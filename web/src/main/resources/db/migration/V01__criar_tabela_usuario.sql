CREATE TABLE usuario(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    matricula VARCHAR(20),
    nascimento VARCHAR(20),
    bolsa VARCHAR(20),
    idOrientador BIGINT(20),
    senha VARCHAR(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;