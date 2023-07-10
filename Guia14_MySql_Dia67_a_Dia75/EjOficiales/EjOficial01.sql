DROP DATABASE IF EXISTS personal;
CREATE DATABASE personal CHARACTER SET utf8mb4;
USE personal;

CREATE TABLE departamentos (
id_depto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre_depto VARCHAR(20) NOT NULL,
  ciudad VARCHAR(15) NULL,
  nombre_jefe_depto CHAR(30) NULL
);


CREATE TABLE empleados (
  id_emp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre CHAR(30) NOT NULL,
  sex_emp CHAR(1) NOT NULL,
  fec_nac DATE NOT NULL,
  fec_incorporacion DATE NOT NULL,
  sal_emp FLOAT NOT NULL,
  comision_emp FLOAT NOT NULL,
  cargo_emp VARCHAR(15) NOT NULL,
  id_depto INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_depto) REFERENCES departamentos(id_depto)
  );


-- Insertar datos en la tabla `departamentos`

INSERT INTO `departamentos` VALUES (1000,'GERENCIA','CIUDAD REAL','Bruno Cebrian');
INSERT INTO `departamentos` VALUES (1500,'PRODUCCIÓN','CIUDAD REAL','Jesica Duran');
INSERT INTO `departamentos` VALUES (2000,'VENTAS','CIUDAD REAL','Alicia Andres');
INSERT INTO `departamentos` VALUES (2100,'VENTAS','BARCELONA','Fabian Soto');
INSERT INTO `departamentos` VALUES (2200,'VENTAS','VALENCIA','Mari Plaza');
INSERT INTO `departamentos` VALUES (2300,'VENTAS','MADRID','Jonatan Acuña');
INSERT INTO `departamentos` VALUES (3000,'INVESTIGACIÓN','CIUDAD REAL','Valentina Sola');
INSERT INTO `departamentos` VALUES (3500,'MERCADEO','CIUDAD REAL','Abraham Diego');
INSERT INTO `departamentos` VALUES (4000,'MANTENIMIENTO','CIUDAD REAL','Raúl Carrero');
INSERT INTO `departamentos` VALUES (4100,'MANTENIMIENTO','BARCELONA','Catalina Valdes');
INSERT INTO `departamentos` VALUES (4200,'MANTENIMIENTO','VALENCIA','Adriana Rocha');
INSERT INTO `departamentos` VALUES (4300,'MANTENIMIENTO','MADRID','German Luna');

-- Insertar datos en la tabla `empleados`

INSERT INTO `empleados` VALUES (222,'José Giraldo','M','1985-01-20','2000-11-01',1200000,400000,'Asesor',3500);
INSERT INTO `empleados` VALUES (333,'Pedro Blanco','M','1987-10-28','2000-10-01',800000,3000000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (444,'Jesús Alfonso','M','1988-03-14','2000-10-01',800000,3500000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (555,'Julián Mora','M','1989-07-03','2000-10-01',800000,3100000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (666,'Manuel Millán','M','1990-12-08','2004-06-01',800000,3700000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (777,'Marcos Cortez','M','1986-06-23','2000-04-16',2550000,500000,'Mecánico',4000);
INSERT INTO `empleados` VALUES (782,'Antonio Gil','M','1980-01-23','2010-04-16',850000,1500000,'Técnico',1500);
INSERT INTO `empleados` VALUES (219,'Melissa Roa','F','1960-06-19','2001-03-16',2250000,2500000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (111,'Irene Díaz','F','1979-09-28','2004-06-01',1050000,200000,'Mecánico',4200);
INSERT INTO `empleados` VALUES (383,'Luis Pérez','M','1956-02-25','2000-01-01',5050000,0,'Director',1500);
INSERT INTO `empleados` VALUES (060,'Darío Casas','M','1960-04-05','1992-11-01',4500000,500000,'Investigador',3000);
INSERT INTO `empleados` VALUES (802,'William Daza','M','1982-10-09','1999-12-16',2250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (221,'Carla López','F','1975-05-11','2005-07-16',4500000,500000,'Jefe Mercadeo',3500);
INSERT INTO `empleados` VALUES (331,'Carlos Rozo','M','1975-05-11','2001-09-16',750000,500000,'Vigilante',3500);
INSERT INTO `empleados` VALUES (099,'Diana Solarte','F','1957-11-19','1990-05-16',1250000,500000,'Secretaria',1000);
INSERT INTO `empleados` VALUES (144,'Rosa Angulo','F','1957-03-15','1998-08-16',3250000,3500000,'Jefe Ventas',2000);
INSERT INTO `empleados` VALUES (269,'María Rojas','F','1959-01-15','1990-05-16',6250000,1500000,'Gerente',1000);
INSERT INTO `empleados` VALUES (343,'Elisa Rojas','F','1979-09-28','2004-06-01',3000000,1000000,'Jefe Mecánicos',4000);
INSERT INTO `empleados` VALUES (334,'Marisol Pulido','F','1979-10-01','1990-05-16',3250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (335,'Ana Moreno','F','1992-01-05','2004-06-01',1200000,400000,'Secretaria',3000);
INSERT INTO `empleados` VALUES (336,'Carolina Ríos','F','1992-02-15','2000-10-01',1250000,500000,'Secretaria',1500);
INSERT INTO `empleados` VALUES (337,'Edith Muñoz','F','1992-03-31','2000-10-01',800000,3600000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (338,'Abel Gómez','M','1939-12-24','2000-10-01',1050000,200000,'Mecánico',4300);
INSERT INTO `empleados` VALUES (689,'Mario Llano','M','1945-08-30','1990-05-16',2250000,2500000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (785,'Joaquín Rosas','M','1947-07-07','1990-05-16',2250000,2500000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (898,'Iván Duarte','M','1955-08-12','1998-05-16',1050000,200000,'Mecánico',4100);

-- Punto 1
SELECT * FROM empleados;
-- Punto 2
SELECT * FROM departamentos;
-- Punto 3
SELECT nombre_depto FROM departamentos;
-- Punto 4
SELECT nombre, sal_emp FROM empleados;
-- punto 5
SELECT comision_emp FROM empleados;
-- punto 6
SELECT cargo_emp FROM empleados WHERE cargo_emp = 'Secretaria';
-- punto 7
SELECT nombre FROM empleados WHERE cargo_emp = 'Vendedor' ORDER BY nombre ASC;
-- punto 8
SELECT nombre, cargo_emp, sal_emp FROM empleados ORDER BY sal_emp ASC;
-- punto 9
SELECT nombre_jefe_depto FROM departamentos WHERE ciudad = 'CIUDAD REAL';
-- punto 10
SELECT nombre AS Nombre, cargo_emp AS Cargo FROM empleados;
-- punto 11
SELECT sal_emp, comision_emp FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;
-- punto 12
SELECT nombre, sal_emp + comision_emp + 500 AS TOTAL FROM empleados WHERE id_depto = 3000 ORDER BY nombre ASC;
-- punto 13
SELECT * FROM empleados WHERE nombre LIKE 'j%';
-- punto 14
SELECT nombre, sal_emp, comision_emp, sal_emp + comision_emp AS TOTAL FROM empleados WHERE comision_emp > 1000;
-- punto 15
SELECT nombre, sal_emp, comision_emp, sal_emp + comision_emp AS TOTAL FROM empleados WHERE comision_emp = 0;
-- punto 16
SELECT * FROM empleados WHERE comision_emp > sal_emp;
-- punto 17
SELECT * FROM empleados WHERE comision_emp <= (0.3 * sal_emp);
-- punto 18
SELECT * FROM empleados WHERE nombre NOT LIKE '%MA%';
-- punto 19
SELECT * FROM departamentos WHERE nombre_depto IN ('VENTAS', 'INVESTIGACIÓN', 'MANTENIMIENTO');
-- punto 20
SELECT * FROM departamentos WHERE nombre_depto NOT IN ('VENTAS', 'INVESTIGACIÓN', 'MANTENIMIENTO');
-- punto 21
SELECT MAX(sal_emp ) FROM empleados;
-- punto 22
SELECT MAX(nombre) FROM empleados;
-- punto 23
SELECT MAX(sal_emp) AS salario_maximo, MIN(sal_emp) AS salario_minimo, MAX(sal_emp) - MIN(sal_emp) AS diferencia_salarios FROM empleados;
-- punto 24
SELECT MAX(sal_emp) AS salario_maximo, MIN(sal_emp) AS salario_minimo, AVG(sal_emp) AS salario_promedio FROM empleados;
-- punto 25
SELECT id_depto, COUNT(*) AS num_empleados FROM empleados GROUP BY id_depto HAVING COUNT(*) > 3;
-- punto 26
SELECT d.nombre_depto FROM departamentos d LEFT JOIN empleados e ON d.id_depto = e.id_depto WHERE e.id_emp IS NULL;
-- punto 27
SELECT e.nombre, e.sal_emp, d.nombre_depto FROM empleados e JOIN departamentos d ON e.id_depto = d.id_depto WHERE e.sal_emp >= (SELECT AVG(sal_emp) FROM empleados) ORDER BY d.nombre_depto;