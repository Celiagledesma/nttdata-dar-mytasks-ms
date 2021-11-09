DROP TABLE IF EXISTS Tasks;

CREATE TABLE Tasks (
id INT AUTO_INCREMENT PRIMARY KEY,
status VARCHAR(256) NOT NULL,
description VARCHAR(256) NOT NULL
);



INSERT INTO Tasks (id, status, description) VALUES
(1,'In progress', 'Backend , microservicios con Spring boot'),
(2,'Pending', 'Repositorio proyecto'),
(3,'Finished', 'Devops, desplegar imagen de la aplicacion desde dockerhub en AKS');