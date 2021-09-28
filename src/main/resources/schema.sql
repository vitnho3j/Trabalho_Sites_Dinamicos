CREATE TABLE user(

    id        INT          NOT NULL primary key,
    nome      VARCHAR(45)  NOT NULL,
    cpf       VARCHAR(11)  NOT NULL UNIQUE,
    email     VARCHAR(45)  NOT NULL UNIQUE

);

CREATE TABLE curso(

     id        INT         NOT NULL primary key,
     nome      VARCHAR(45)  NOT NULL,
     categoria VARCHAR(45)  NOT NULL,
     valor     Float,
     id_creator INT  NOT NULL

);

CREATE TABLE compra(

      id            INT    NOT NULL primary key,
      data          VARCHAR(10)   NOT NULL,
      valor         Float  NOT NULL,
      comprador  INT    NOT NULL,
      vendedor   INT    NOT NULL,
      curso         INT    NOT NULL

);

CREATE TABLE venda(

       id            INT    NOT NULL  primary key,
       curso         INT    NOT NULL,
       comprador  INT    NOT NULL,
       vendedor   INT    NOT NULL,
       data          VARCHAR(10)   NOT NULL,
       valor         Float  NOT NULL

);
