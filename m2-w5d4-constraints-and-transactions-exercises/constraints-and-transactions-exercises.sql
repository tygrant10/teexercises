-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.** DVD STORE

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

        INSERT into actor (first_name, last_name) VALUES ('Hampton', 'Avenue');
        INSERT into actor (first_name, last_name) VALUES ('Lisa', 'Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

        BEGIN TRANSACTION

        INSERT into film (title, description, release_year, language_id, length) values ('Euclidean PI', 'The pic story of Euclid as a pizza delivery boy in acient Greece',
        2008, (SELECT language_id FROM language WHERE name = 'English'), 198);

        SELECT * FROM film WHERE title = 'Euclidean PI';

--DELETE FROM film WHERE film_id = 1002;

        ROLLBACK

        COMMIT


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.


BEGIN TRANSACTION

SELECT * FROM actor WHERE actor_id = 202;


INSERT INTO film_actor (actor_id, film_id) VALUES (201, 1001);
INSERT INTO film_actor (actor_id, film_id) VALUES (202, 1001);

select * from film_actor WHERE film_id = 1001;

ROLLBACK;

COMMIT;


-- 4. Add Mathmagical to the category table.

BEGIN TRANSACTION 

INSERT INTO category (category_id, name) VALUES (17, 'Mathmagical')

ROLLBACK;

COMMIT;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN TRANSACTION
UPDATE film_category 
SET category_id = 17 
WHERE film_id = 1001 OR film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996;

ROLLBACK
COMMIT


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION

UPDATE film
SET rating = 'G'
WHERE film_id = 1001 OR film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996;

ROLLBACK

COMMIT

-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION
INSERT INTO inventory (film_id, store_id) VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2);

ROLLBACK;

COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION

DELETE FROM film WHERE film_id = 1001;

ROLLBACK;

COMMIT;

--It does not work, because the Euclidean PI is being associated in other tables.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION

DELETE FROM category
WHERE category_id = 17;

ROLLBACK

--It does not work for the same reason as previous.  The Mathmagical is being used in other tables so we may not delete it.

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION

DELETE FROM film_category
WHERE category_id = 17;

ROLLBACK;

COMMIT;

--yes, here we are deleting primary, so it will allow us.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

BEGIN TRANSACTION

DELETE FROM category
WHERE category_id = 17;

ROLLBACK;

COMMIT;

--yes, because the primary key has been deleted, it will now allow us to delete its foreign keys.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

 --we would first have to delete the film reference from tables film_category and film_actor before deleting the film itself.  
 --This is because film_id is a primary key in these two tables.  Once these are deleted, we may rid ourselves of this terrible movie for good!