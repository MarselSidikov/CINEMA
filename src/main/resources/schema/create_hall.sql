CREATE TABLE hall (
  id SERIAL PRIMARY KEY
  hallNumber INTEGER,
  place_id INTEGER REFERENCES place(id)
);