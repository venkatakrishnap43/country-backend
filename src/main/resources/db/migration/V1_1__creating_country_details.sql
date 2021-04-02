CREATE TABLE IF NOT EXISTS  country_details(
    id INTEGER AUTO_INCREMENT NOT NULL,
    capital varchar(225)  NULL,
    president varchar(225)  NULL,
    independence_day varchar(225)  NULL,
    no_of_states varchar(225)  NULL,
    official_language varchar(225)  NULL,
    independence_year varchar(225)  NULL,
    national_animal varchar(225)  NULL,
    national_bird varchar(225) NULL,
    national_sport varchar(225)  NULL,
    national_anthem varchar(225) NULL,
    national_award varchar(225) NULL,
    national_currency varchar(225) NULL,
    government_form varchar(225) NULL,
    PRIMARY KEY(id)
);

ALTER TABLE countries ADD COLUMN country_details_id INTEGER NULL;

ALTER TABLE countries ADD FOREIGN KEY (country_details_id) REFERENCES country_details(id);

insert into country_details(capital, president, independence_day, no_of_states, official_language, independence_year, national_animal, national_bird,
                             national_sport, national_anthem, national_award, national_currency, government_form)
                             values("New Delhi", "Ram nath Kovind", "15th August", "29", "Hindi", "1947", "Bengal Tiger", "Indian Peacock", "Field Hockey", "Jana Gana Mana", "Bharat Ratna","Indian Rupee", "Democratic");


update countries set country_details_id = 1 where country_code = "IN";
