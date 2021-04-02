CREATE TABLE IF NOT EXISTS  countries(
    id INTEGER AUTO_INCREMENT,
    country_name varchar(225) NOT NULL,
    country_code varchar(225) NOT NULL,
    country_continent varchar(225) NOT NULL,
    country_population varchar(225) NOT NULL,
    PRIMARY KEY(id, country_code)
);

insert into countries(country_code, country_name, country_continent, country_population) values("IN", "India", "Asia", "1.3 B");
insert into countries(country_code, country_name, country_continent, country_population) values("PK", "Pakistan", "Asia", "216.6 M");
insert into countries(country_code, country_name, country_continent, country_population) values("AU", "Australia", "Australia", "25.36 M");
insert into countries(country_code, country_name, country_continent, country_population) values("US", "United States", "North America", "328.2 M");
insert into countries(country_code, country_name, country_continent, country_population) values("ZW", "Zimbabwe", "Africa", "14.65 M");
insert into countries(country_code, country_name, country_continent, country_population) values("ZA", "South Africa", "Africa", "58.56 M");
insert into countries(country_code, country_name, country_continent, country_population) values("DE", "Germany", "Europe", "83.02 M");
insert into countries(country_code, country_name, country_continent, country_population) values("EG", "Egypt", "Africa", "100.4 M");
insert into countries(country_code, country_name, country_continent, country_population) values("HK", "Hong Kong", "Asia", "7.507 M");
insert into countries(country_code, country_name, country_continent, country_population) values("CA", "Canada", "North America", "37.59 M");
insert into countries(country_code, country_name, country_continent, country_population) values("GB", "United Kingdom", "Europe", "66.65 M");
insert into countries(country_code, country_name, country_continent, country_population) values("BD", "Bangladesh", "Asia", "163 M");
insert into countries(country_code, country_name, country_continent, country_population) values("BE", "Belgium", "Europe", "11.46 M");
insert into countries(country_code, country_name, country_continent, country_population) values("CN", "China", "Asia", "1.398 B");
insert into countries(country_code, country_name, country_continent, country_population) values("RU", "Russia", "Asia", "144.4 M");
insert into countries(country_code, country_name, country_continent, country_population) values("LK", "Sri Lanka", "Asia", "21.8 M");
insert into countries(country_code, country_name, country_continent, country_population) values("NZ", "New Zealand", "Australia", "4.917 M");
insert into countries(country_code, country_name, country_continent, country_population) values("JM", "Jamaica", "North America", "2.948 M");
insert into countries(country_code, country_name, country_continent, country_population) values("PT", "Portugal", "Europe", "10.28 M");
insert into countries(country_code, country_name, country_continent, country_population) values("ES", "Spain", "Europe", "46.94 M");
insert into countries(country_code, country_name, country_continent, country_population) values("IT", "Italy", "Europe", "60.36 M");