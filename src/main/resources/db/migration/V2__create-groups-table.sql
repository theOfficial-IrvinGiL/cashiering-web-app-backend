CREATE TABLE groups(
    id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT,

    CONSTRAINT groups_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE groups_sequence
 INCREMENT 1
 MINVALUE 1
 START 1
 CACHE 1;