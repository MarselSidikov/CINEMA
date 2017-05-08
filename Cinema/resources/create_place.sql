CREATE TABLE place (
  id SERIAL PRIMARY KEY,
  place_number INTEGER,
  hall_id INTEGER REFERENCES hall(id),
);