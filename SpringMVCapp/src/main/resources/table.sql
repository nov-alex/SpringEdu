CREATE ROLE edu_db WITH
	LOGIN
	NOSUPERUSER
	CREATEDB
	NOCREATEROLE
	INHERIT
	NOREPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'edu_db';

CREATE DATABASE edu_db
    WITH
    OWNER = edu_db
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

CREATE TABLE Person
(
    id serial NOT NULL,
    name character varying(30) NOT NULL,
    age smallint NOT NULL,
    email character varying,
    PRIMARY KEY (id)
);

GRANT ALL ON DATABASE edu_db TO edu_db;
GRANT ALL ON TABLE public.person TO edu_db;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO edu_db;