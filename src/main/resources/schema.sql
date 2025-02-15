-- schema.sql
CREATE TABLE IF NOT EXISTS employees (
    id VARCHAR(60) PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL
);
