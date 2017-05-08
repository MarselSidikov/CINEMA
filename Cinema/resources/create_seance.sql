CREATE TABLE seance (
  id SERIAL PRIMARY KEY,
  cinema_id INTEGER REFERENCES cinema(id),
  hall_id INTEGER REFERENCES hall(id),
  film_id INTEGER REFERENCES film(id),
  time DATE,

);