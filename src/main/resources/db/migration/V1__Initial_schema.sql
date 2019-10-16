CREATE SEQUENCE beer_id_seq;

CREATE TABLE IF NOT EXISTS beer(
    id                BIGINT DEFAULT beer_id_seq.nextval PRIMARY KEY,
    barcode           VARCHAR(13),
    name              VARCHAR(128) NOT NULL,
    title             VARCHAR(128),
    description       VARCHAR(512),
    alcohol_by_volume REAL,
    bitterness        INT
);

CREATE INDEX ix_beer_barcode ON beer(barcode);