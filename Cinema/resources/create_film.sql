CREATE TABLE film (
  id SERIAL PRIMARY KEY,
  name VARCHAR (20),
  duration INTEGER,
  rating DOUBLE,
  actors INTEGER REFERENCES actor_film(actor_id),
  poster VARCHAR (20),
  is3D BIT
);