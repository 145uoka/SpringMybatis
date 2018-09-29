-- Table: eventbase.sample_tbl

DROP TABLE eventbase.sample_tbl;

CREATE TABLE eventbase.sample_tbl
(
  sample_id serial NOT NULL,
  sample_name character varying(255),
  sample_date date,
  sample_num integer,
  sample_div character(1) NOT NULL,
  delete_flag boolean NOT NULL DEFAULT false,
  version_no integer NOT NULL DEFAULT 0,
  register_datetime timestamp(3) without time zone NOT NULL,
  update_datetime timestamp(3) without time zone,
  CONSTRAINT sample_tbl_pkey PRIMARY KEY (sample_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE eventbase.sample_tbl
  OWNER TO postgres;

commit;