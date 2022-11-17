CREATE TABLE IF NOT EXISTS invoice(
    id SERIAL,
    attendee_id INT NOT NULL,
    code VARCHAR (100) NOT NULL,
    create_at DATE NOT NULL,
    total DECIMAL (8,2),
    PRIMARY KEY (id),
    UNIQUE (code),
    FOREIGN KEY(attendee_id) REFERENCES attendee (id)
    );