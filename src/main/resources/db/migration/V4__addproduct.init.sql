CREATE TABLE IF NOT EXISTS product(
    id SERIAL,
    description VARCHAR (30) NOT NULL,
    brand VARCHAR(30) NOT NULL,
    stock INT NOT NULL,
    PRIMARY KEY (id)
    );
