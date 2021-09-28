INSERT INTO user(id, nome, email, cpf)
VALUES (1, 'Vitor Daniel', 'vitordaniel106@hotmail', '18748598712');

INSERT INTO user(id, nome, email, cpf)
VALUES (2, 'Roberto Chagas', 'roberto12@outlook.com', '14789123675');

INSERT INTO user(id, nome, email, cpf)
VALUES (3, 'Aline Freita', 'aline45@outlook.com', '16597784526');


INSERT INTO curso(id, nome, categoria, valor, id_creator)
VALUES (1, 'Curso de Python', 'Programação', 50.0, 1);

INSERT INTO curso(id, nome, categoria, valor, id_creator)
VALUES (2, 'Curso de JAVA', 'Programação', 70.0, 1);

INSERT INTO curso(id, nome, categoria, valor, id_creator)
VALUES (3, 'Curso de Empreededorismo', 'Empreendedorismo', 70.0, 3);

INSERT INTO compra(id, data, valor, comprador, vendedor, curso)
VALUES (2, '28/09/2021', 50.0, 3, 1, 1);

INSERT INTO venda(id, data, valor, comprador, vendedor, curso)
VALUES (2, '28/09/2021', 50.0, 3, 1, 1);

