CREATE TABLE cinema (
  id SERIAL PRIMARY KEY,
  name VARCHAR (20),
  location VARCHAR (20),
  countSits INTEGER,
  seance_id INTEGER REFERENCES seance(id),

);