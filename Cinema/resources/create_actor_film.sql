CREATE TABLE actor_film (
  actor_id INTEGER REFERENCES actor(id),
  film_id INTEGER REFERENCES film(id)
)