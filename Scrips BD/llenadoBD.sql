INSERT INTO usuario(nombreUsuario ,clave  ) VALUES
 ('admin', 'admin'),
 ('diego', 'diego'),
 ('bryam', 'bryam');
 
 INSERT INTO operacion(expresion_matematica, resultado, fecha,id_usuario ) VALUES 
 ('5+8', '13', '2025-06-15', 1);
 
 
 INSERT INTO formula( nombre, expresion_matematica) VALUES
 ('Fracción', 'x/y'),
 ('Area de Circulo', 'π*r^2'),
 ('Compleja', '((10+5)/3)*2');

SELECT * FROM Usuario;

SELECT * FROM formula;


