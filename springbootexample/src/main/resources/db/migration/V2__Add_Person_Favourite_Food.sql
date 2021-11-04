CREATE TABLE person_favourite_food(
    id BIGSERIAL PRIMARY KEY,
    person_id BIGINT NOT NULL REFERENCES person(id),
    favourite_food TEXT NOT NULL
);