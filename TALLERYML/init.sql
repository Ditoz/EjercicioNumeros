CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS computadoras (
    id_computadora INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(100) NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    anio INT NOT NULL
);

CREATE TABLE IF NOT EXISTS componentes (
    id_componente INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100) NOT NULL,
    descripcion TEXT
);

CREATE TABLE IF NOT EXISTS computadora_componentes (
    id_computadora INT,
    id_componente INT,
    PRIMARY KEY (id_computadora, id_componente),
    FOREIGN KEY (id_computadora) REFERENCES computadoras(id_computadora),
    FOREIGN KEY (id_componente) REFERENCES componentes(id_componente)
);

CREATE TABLE IF NOT EXISTS historial_usos (
    id_historial INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    id_computadora INT,
    fecha_inicio DATETIME,
    fecha_fin DATETIME,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_computadora) REFERENCES computadoras(id_computadora)
);