-- Table: public."BOOK_TAGS "

DROP TABLE public."BOOK_TAGS ";

CREATE TABLE public."BOOK_TAGS "
(
    isbn_13 character varying(13) COLLATE pg_catalog."default" NOT NULL,
    tag_name character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT "BOOK_TAGS _pkey" PRIMARY KEY (isbn_13),
    CONSTRAINT "BOOK_TAGS _isbn_13_fkey" FOREIGN KEY (isbn_13)
        REFERENCES public.books (isbn_13) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public."BOOK_TAGS "
    OWNER to postgres;