CREATE TABLE hall (
  id SERIAL PRIMARY KEY
  hall_Number INTEGER,
  place_id INTEGER REFERENCES place(id)
);