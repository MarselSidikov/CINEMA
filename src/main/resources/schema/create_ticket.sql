CREATE TABLE ticket (
  id SERIAL PRIMARY KEY,
  user_id INTEGER REFERENCES cinema_user(id),
  seance_id INTEGER REFERENCES seance(id),
  place_id INTEGER REFERENCES place(id)
);