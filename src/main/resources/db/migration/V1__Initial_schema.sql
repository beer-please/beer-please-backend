CREATE TABLE IF NOT EXISTS beer(
    id          BIGINT PRIMARY KEY,
    barcode     VARCHAR(13),
    name        VARCHAR(128),
    title       VARCHAR(128),
    description VARCHAR(512)
);

CREATE SEQUENCE beer_id_seq;