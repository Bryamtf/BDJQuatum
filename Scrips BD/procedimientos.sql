#Creacion de Procedimientos para Formula
DELIMITER $$
DROP PROCEDURE IF EXISTS pr_GuardarFormula$$
CREATE PROCEDURE pr_GuardarFormula(
 IN pExpresion_matematica VARCHAR(200), 
 IN pId_usuario INT
)
BEGIN
	INSERT INTO Formula(expresion_matematica, id_usuario)
	VALUES 	(pExpresion_matematica, pId_usuario);
END$$ 

##CALL pr_GuardarFormula('15 + 8 * cos(20)',1)

DELIMITER $$
DROP PROCEDURE IF EXISTS pr_ListarFormulas$$
CREATE PROCEDURE pr_ListarFormulas()
BEGIN
	SELECT 
    f.id_usuario as "usuario",
    f.id_formula as "Fórmula",
    f.expresion_matematica as "Expresión Matemática "
    FROM formula f;
END$$ 


CALL  pr_ListarFormulas();