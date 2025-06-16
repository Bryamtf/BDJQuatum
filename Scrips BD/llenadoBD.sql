INSERT INTO usuario(nombreUsuario ,clave  ) VALUES ('admin', 'admin'),
 ('diego', 'diego'),
 ('bryam', 'bryam');
 
 INSERT INTO formula(expresion_matematica , id_usuario  ) VALUES('(2+3)', 1),
('5/9+8', 2),
('sqrt(20)', 3);

SELECT * FROM Usuario;

SELECT * FROM formula;