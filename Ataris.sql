create database ataris;
use  ataris;
create table Departamento(
	Nombre varchar(20) primary key,
    Descripcion varchar(150) not null );
    
create table Empleado(
	Codigo int primary key ,
    Nombre varchar(20) not null,
    ApellidoPaterno varchar(20) not null,
    ApellidoMaterno varchar(20) not null,
    DNI varchar(8) not null,
    Fecha date not null,
    Salario decimal (7,2) not null check (salario>0),
    Departamento varchar(20),
    Edad varchar(20) not null,
    Direccion varchar(100) not null,
    foreign key (Departamento) references Departamento(Nombre) on delete set null );
   drop table clientes;
CREATE TABLE clientes (
id INT(11) NOT NULL AUTO_INCREMENT,
nomb VARCHAR(60) NOT NULL, 
apeoPat varchar(20) not null,
apeMat varchar(20) not null,
dni varchar(50) not null,
edad varchar(20) not null,
telefono varchar(80) NOT NULL, 
fechaNac date not null,
correo VARCHAR(80) NOT NULL UNIQUE, 
contra varchar(80) not null,
Direccion varchar(100) not null,
tipoPaq varchar(100) not null,
PRIMARY KEY (id));

CREATE TABLE citas (
id INT(11) NOT NULL AUTO_INCREMENT,
fecha DATE NOT NULL, 
hora TIME NOT NULL,
clienteId INT(11) NOT NULL, 
PRIMARY KEY (id), 
KEY clienteId(clienteId), 
CONSTRAINT clienteFK FOREIGN KEY (clienteId)
REFERENCES clientes (id)
);

CREATE TABLE servicios (
id INT(11) NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(60) NOT NULL,
contenido VARCHAR(60) NOT NULL, 
precio DECIMAL(6,2) NOT NULL,
PRIMARY KEY (id)
);
CREATE TABLE citasServicios(
id INT(11) AUTO_INCREMENT,
citaId INT(11) NOT NULL, 
servicioId INT(11) NOT NULL,
PRIMARY KEY (id), 
KEY citaId (citaId),
CONSTRAINT citasFK
FOREIGN KEY (citaId)
REFERENCES citas (id),
KEY servicioId (servicioId),
CONSTRAINT serviciosFK
FOREIGN KEY (servicioId)
REFERENCES servicios (id)
);

insert into Departamento (Nombre, Descripcion) values("Director de Sistemas","Hacer que la línea de trabajo tienda a ser una constante utilizando su planificación para ello.");
insert into Departamento (Nombre, Descripcion) values("Sistemas","Encargado de mantener los sistemas e infraestructuras que dan servicios a los sistemas de información.");
insert into Departamento (Nombre, Descripcion) values("Area Tecnica","Encargado de instalar los equipos, y mantenimientos de ellos.");

INSERT INTO `ataris`.`empleado` (`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `DNI`, `Fecha`, `Salario`, `Departamento`, `Edad`, `Direccion`) VALUES ('Rafael', 'Rodríguez ', 'Rosas', '01R', '2021-04-10', '90000', 'Director de Sistemas', '21', 'Lagunas de Miralta');
INSERT INTO `ataris`.`empleado` (`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `DNI`, `Fecha`, `Salario`, `Departamento`, `Edad`, `Direccion`) VALUES ('Omar', 'Rodríguez', 'Ramírez ', '02O', '2021-04-10', '50000', 'Sistemas', '21', 'Oaxa 105 Norte');
INSERT INTO `ataris`.`empleado` (`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `DNI`, `Fecha`, `Salario`, `Departamento`, `Edad`, `Direccion`) VALUES ('Rogelio', 'Reyes', 'Luevano', '03R', '2021-04-10', '40000', 'Sistemas', '21 ', 'Oaxaca 85 norte');
INSERT INTO `ataris`.`empleado` (`Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `DNI`, `Fecha`, `Salario`, `Departamento`, `Edad`, `Direccion`) VALUES ('Andrés ', 'Reyna ', 'Garza', '04A', '2021-04-10', '20000', 'Area Tecnica', '21', 'Polvorín ');

INSERT INTO `ataris`.`servicios` (`nombre`, `contenido`, `precio`) VALUES ('VIP', 'Internet+Izzi+tv', '1120');
INSERT INTO `ataris`.`servicios` (`nombre`, `contenido`, `precio`) VALUES ('Intermedio', 'Internet+telefonía', '800');
INSERT INTO `ataris`.`servicios` (`nombre`, `contenido`, `precio`) VALUES ('Regular', 'Internet', '505');

INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Roberto', 'Johnsoon', 'Wick', '8333569874', 'robert@gmail.com', '30', 'Matamoros', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Im', 'Nayeon', '.', '8339875637', 'nayeon@gmail.com', '26', 'Gangdong-gu', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Park', 'Jihyo', '.', '8331235487', 'jihyo@gmail.com', '24', 'Guri', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Choe', 'Tzuyu', '.', '8335224734', 'tzuyu@gmail.com', '22', 'Tainan', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Myoui', 'Mina', '.', '8334589237', 'mina@gmail.com', '24', 'San Antonio', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Kim', 'Dahyun', '.', '8337415895', 'dahyun@gmail.com', '23', 'Seongnam', '2021-10-24');
INSERT INTO `ataris`.`clientes` (`nomb`, `apeoPat`, `apeMat`, `telefono`, `email`, `ed_clien`, `Direccion`, `fechainicio`) VALUES ('Lalisa', 'Manobal', '.', '8338517234', 'lalisa@gmail.com', '24', 'Bangkok', '2021-10-24');

select * from clientes;
INSERT INTO citasServicios (citaId, servicioId) VALUES (1,2);

SELECT * FROM citasServicios
LEFT JOIN citas ON citas.id = citasServicios.citaId
LEFT JOIN servicios ON servicios.id = citasServicios.servicioId;

SELECT * FROM clientes where nomb='Rafael';
SELECT * FROM clientes where ed_clien < 21;
SELECT Nombre, ApellidoPaterno, ApellidoMaterno FROM empleado;

select * from clientes;
select * from empleado;
select * from departamento;
select * from servicios;
select * from citas;
select * from citasServicios;



select * from Empleado;
-- PROCEDURE "RegistraDepartamento"
drop procedure if exists insertarDepartamento;
delimiter //
create procedure insertarDepartamento(in nombreDept varchar (20), in descrDept varchar (150), out msg varchar(50))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select Nombre from Departamento where Nombre = nombreDept) then
			set msg = "Departmento ya registrado.";
		else
			insert into Departamento(Nombre, Descripcion) values (nombreDept, descrDept);
            set msg = "Departamento registrado correctamente.";
        end if;
        select msg;
        commit;
    END;
//   
delimiter ;

-- PROCEDURE "RemoverDepartamento"
drop procedure if exists eliminarDepartamento;
delimiter //
create procedure eliminarDepartamento(in nombreDept varchar(20), out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select Nombre from Departamento where Nombre = nombreDept) then
			delete from Departamento where Nombre = nombreDept;
            set msg = "Departamento eliminado";
            else
			set msg = "Departamento no disponible";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;


-- PROCEDURE "RegistraEmpleado"
drop procedure if exists insertaEmpleado;
delimiter //
create procedure insertaEmpleado (in matricula int, in nombreEmp varchar(20), in apellidoP varchar(20), in apellidoM varchar(20),
									in id varchar(8), in fechaIngreso date, in sueldo decimal(7,2), in nombreDept varchar(20),in ed int, in dir varchar(200) ,out msg varchar (80))

    BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
        if exists(select Codigo from Empleado where Codigo = matricula) then
			set msg = "Empleado ya registrado.";
        elseif now() < fechaIngreso then
			set msg = "Fecha Incorrecta";
        else
       			insert into Empleado (Codigo, Nombre, ApellidoPaterno, ApellidoMaterno, DNI, Fecha, Salario, Departamento,Edad,Direccion) 
				   values (matricula, nombreEmp, apellidoP, apellidoM, id, fechaIngreso, sueldo, nombreDept,ed,dir);
			set msg = "Empleado registrado correctamente";
		end if;
        select msg;
        COMMIT;
	END
//
delimiter ;



-- PROCEDURE "RemoverEmpleado"
drop procedure if exists eliminarEmpleado;
delimiter //
create procedure eliminarEmpleado (in matricula int, out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select Codigo from Empleado where Codigo = matricula) then
			delete from Empleado where Codigo = matricula;
            set msg = "Empleado Eliminado";
        else
			set msg = "Empleado no disponible.";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;
call insertarDepartamento("SISTEMAS","Departamento de IT",@msg);
call insertarDepartamento("IA","Departamento de IA",@msg);
call insertarDepartamento("Admon","Departamento de Admin",@msg);

call insertaEmpleado(9,"Rafael","Rosas","Rodriguez","05R","2021-04-11",180.8,"Sistemas",21,"Polanco",@msg);
call insertaEmpleado(18,"Andrea","Ramirez","Salazar","08A","2021-05-11",120.90,"Leyes",21,"Polanco",@msg);
select * from Departamento;
select * from Empleado;
-- PROCEDURE "BuscarEmpleado"
drop procedure if exists buscaEmpleado;
delimiter //
create procedure buscaEmpleado(in nombreEmpleado varchar(20), in apellidoPat varchar (20), in apellidoMat varchar (20), out idEmp int, out nombreEmp varchar(20), out apellidoP varchar(20),
								  out apellidoM varchar(20),out dniEmp varchar(8), out fechaIngreso date, out sueldo decimal(7,2), out dept varchar(20),out ed varchar(20),out dir varchar(100), out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
     		if exists (select Nombre, ApellidoPaterno, ApellidoMaterno from Empleado where
				   Nombre = nombreEmpleado AND ApellidoPaterno = apellidoPat AND ApellidoMaterno = apellidoMat) then
                   select Codigo, Nombre, ApellidoPaterno, ApellidoMaterno, DNI, Fecha, Salario, Departamento, Edad, Direccion into 
				   idEmp,nombreEmp, apellidoP, apellidoM, dniEMP, fechaIngreso, sueldo, dept, ed, dir from Empleado
                   where  Nombre = nombreEmpleado AND ApellidoPaterno = apellidoPat AND ApellidoMaterno = apellidoMat;
                   set msg = concat("Código del empleado: ",  idEmp," Nombre: ", nombreEmp, "Apellidos: ", apellidoP," ",apellidoM,
							 "DNI: ",dniEMP, " Fecha de Ingreso: ", CAST(fechaIngreso as CHAR), " Salario: ", sueldo," Departamento: ",dept,"Edad",ed,"Direccion",dir); 
        else
			set msg = "Empleado no disponible";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;
call buscaEmpleado("Andrea","Ramirez","Salazar",@idEmp,@nombreEmp, @apellidoP,@apellidoM,@dniEmp,@fecha,@sueldo,@dept,@ed,@dir,@msg);
select * from Empleado;

-- PROCEDURE "RegistraClientes"
drop procedure if exists insertaClientes;
delimiter //
create procedure insertaClientes (in matricula int, in nombreClien varchar(20), in apellidoP varchar(20), in apellidoM varchar(20),
									in dn varchar(8),in ed varchar(20),in tel varchar(80), in feNac date, in email varchar(80),in pass varchar(50), in dir varchar(200) ,in paq varchar(100),out msg varchar (80)) 
   BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
        if exists(select id from clientes where id = matricula) then
			set msg = "Cliente ya registrado.";
     else
        		insert into clientes (id, nomb, apeoPat, apeMat, dni,edad,telefono,fechaNac, correo, contra,Direccion,tipoPaq) 
				   values (matricula, nombreClien, apellidoP, apellidoM, dn,ed,tel,feNac,email,pass,dir,paq);
			       set msg = "Cliente registrado correctamente";
		end if;
        select msg;
        COMMIT;
	END
//
delimiter ;
select * from Clientes;
call insertaClientes(2,"Rafael","Ramirez","Rosas","09R",31,"8334689572","1990-04-11","ra@gmail.com","RaRa09","Polanco","VIP",@msg);

-- PROCEDURE "RemoverClientes"
drop procedure if exists eliminarClientes;
delimiter //
create procedure eliminarClientes (in matricula int, out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select id from clientes where id = matricula) then
			delete from clientes where id = matricula;
            set msg = "Cliente Eliminado";
        else
			set msg = "Cliente no disponible.";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;
call eliminarClientes(2,@msg);
select * from clientes;

  -- PROCEDURE "BuscaClientes"
drop procedure if exists buscaClientes;
delimiter //
create procedure buscaClientes(in nomCli varchar(20), in apPat varchar (20), in apMat varchar (20), out idCli int, out nombreCli varchar(20), out apellidoP varchar(20),
								  out apellidoM varchar(20),out dniCli varchar(8),out ed varchar(20), out tel varchar(100),out feNac date, out co varchar(100), out con varchar(100),out dir varchar(100),out paq varchar(100), out msg varchar(250))
    BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
    
        start transaction;  
        
     		if exists (select nomb, apeoPat, apeMat from clientes where
				   nomb = nombreCli AND apeoPat = apPat AND apeMat = apMat) then
                   select id, nomb, apeoPat, apeMat, dni, edad, telefono, fechaNac, correo, contra, Direccion,tipoPaq into 
				   idCli,nombreCli, apellidoP, apellidoM, dniCli,ed,tel,feNac, co, con, dir, paq from clientes
                   where  nomb = nombreCli AND apeoPat = apPat AND apeMat = apMat;
                   set msg = concat("Código del cliente: ",  idCli," Nombre: ", nombreCli, "Apellido Paterno: ", apellidoP,"Apellido Materno: ",apellidoM,
							 " DNI: ",dniCli," Edad: ", ed ," Telefono: ", tel ," Fecha de Nacimiento: ", CAST(feNac as CHAR), " Correo: ", co," Contraseña: ",con," Direccion",dir," Tipo de Paquete:",paq); 
	    else
			set msg = "Cliente Disponible";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;

call buscaClientes("Rafael","Rodriguez","Rosas",@idCli,@nombreCli, @apellidoP,@apellidoM,@dniCli,@ed,@tel,@feNac,@co,@con,@dir,@paq,@msg);
select * from clientes;


-- PROCEDURE "RegistraCita"
drop procedure if exists insertarCita;
delimiter //
create procedure insertarCita(in idCita varchar (20), in fecha date,in hora time, in clieId int , out msg varchar(50))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select id from citas where id = idCita) then
			set msg = "Cita ya registrada.";
		else
        
			insert into citas(id,fecha,hora,clienteId) values (idCita,fecha,hora,clieId);
            set msg = "Cita registrada correctamente.";
        end if;
        select msg;
        commit;
    END;
//   
delimiter ;
select * from clientes;
call insertarCita("01","2021/11/19","8:00",1,@msg);
call insertarCita("02","2021/11/20","9:00",2,@msg);
select * from citas;
-- PROCEDURE "RemoverCita"
drop procedure if exists eliminarCita;
delimiter //
create procedure eliminarCita(in idCita varchar(20), out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
		if exists(select id from citas where id = idCita) then
			delete from citas where id = idCita;
            set msg = "Cita eliminada";
            else
			set msg = "Cita no disponible";
		end if;
        select msg;
        commit;
    END;
//
delimiter ;

select * from clientes;
call eliminarCita("2",@msg);
select * from citas;

-- PROCEDURE "BuscarEmpleadoId"
drop procedure if exists buscarCodigoCita;
delimiter //
create procedure buscarCodigoCita(in idEmp int, out codigoEmp int, out nombreEmp varchar(20), out apellidoP varchar (20), out apellidoM varchar (20),
								  out dniEmp varchar(8), out fechaIngreso date, out sueldo decimal(7,2), out dept varchar(20), out msg varchar(60))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SHOW ERRORS LIMIT 1;
            ROLLBACK;
        END;
        DECLARE EXIT HANDLER FOR SQLWARNING
        BEGIN
			SHOW WARNINGS LIMIT 1;
            ROLLBACK;
		END;
        start transaction;
        if exists(select Codigo from Empleado where Codigo = idEmp) then
			select Codigo, Nombre, ApellidoPaterno, ApellidoMaterno, DNI, Fecha, Salario, Departamento into 
				   codigoEmp, nombreEmp, apellidoP, apellidoM, dniEMP, fechaIngreso, sueldo, dept from Empleado where Codigo = idEmp;-- , 
			set msg = concat("Código del empleado: ",  codigoEmp," Nombre: ", nombreEmp, "Apellidos: ", apellidoP," ",apellidoM,
							 "DNI: ",dniEMP, " Fecha de Ingreso: ", CAST(fechaIngreso as CHAR), " Salario: ", sueldo," Departamento: ",dept); 
        else
			set msg = "Cita no disponible";
        end if;
        select msg;
        commit;
        
        
	END;
//
delimiter ;
call buscarCodigoCita(0018,@codigoEmp,@nombreEmp, @apellidoP,@apellidoM,@dniEmp,@fecha,@sueldo,@dept,@msg);


