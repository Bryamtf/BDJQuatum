#Creacion de Procedimientos para Operacion
DELIMITER $$
DROP PROCEDURE IF EXISTS pr_GuardarOperacion$$
CREATE PROCEDURE pr_GuardarOperacion(
 IN pExpresion_matematica VARCHAR(200), 
 IN pResultado VARCHAR(200), 
 IN pFecha DATE,
 IN pId_usuario INT
)
BEGIN
	INSERT INTO Operacion(expresion_matematica, resultado, fecha,id_usuario  )
	VALUES 	(pExpresion_matematica, pResultado,pFecha,pId_usuario );
END$$ 

#CALL pr_GuardarOperacion( '10+6', '16', '2025-06-15', 2);

SELECT *FROM Operacion;

DELIMITER $$
DROP PROCEDURE IF EXISTS pr_ListarOperacion$$
CREATE PROCEDURE pr_ListarOperacion()
BEGIN
	SELECT 
    o.id_operacion,
    o.expresion_matematica   as "Expresión Matemática",
    o.resultado as "Resultado",
    o.fecha as "Fecha"
    FROM operacion o;
END$$ 


CALL  pr_ListarOperacion();


# PROCEDIMIENTOS DE FORMULA
DELIMITER $$
DROP PROCEDURE IF EXISTS pr_guardarformula$$
CREATE PROCEDURE pr_guardarformula(
 IN pNombre VARCHAR(200), 
 IN pExpresion_matematica VARCHAR(200)
)
BEGIN
	INSERT INTO Formula(nombre, expresion_matematica)
	VALUES 	(pNombre, pExpresion_matematica);
END$$ 

CALL pr_guardarformula('pruebita', 'expresion');

#LISTAR FORMULA
DELIMITER $$
DROP PROCEDURE IF EXISTS pr_listarFormulas$$
CREATE PROCEDURE pr_listarFormulas()
BEGIN 
	SELECT 
    F.id_formula,
    F.nombre As "Nombre",
    F.expresion_matematica AS "Expresión Matemática"
    FROM Formula F;
END$$

CALL pr_listarFormulas();


DELIMITER $$
DROP PROCEDURE IF EXISTS pr_buscarFormula$$
CREATE PROCEDURE pr_buscarFormula(
IN pId_formula INT
)
BEGIN 
	SELECT 
    F.id_formula,
    F.nombre As "Nombre",
    F.expresion_matematica AS "Expresión Matemática"
    FROM Formula F
    WHERE id_formula = pId_formula;
END$$

CALL pr_buscarFormula(1);
