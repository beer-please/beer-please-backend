CREATE TABLE IF NOT EXISTS beer(
    id                BIGINT PRIMARY KEY,
    barcode           VARCHAR(13),
    name              VARCHAR(128),
    title             VARCHAR(128),
    description       VARCHAR(512),
    alcohol_by_volume REAL,
    bitterness        INT
);

CREATE SEQUENCE beer_id_seq;