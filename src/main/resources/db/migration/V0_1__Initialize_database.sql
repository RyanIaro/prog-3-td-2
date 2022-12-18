create table team(
	id serial primary key,
	name varchar
)

create table player(
	id serial primary key,
	name varchar,
	number int,
	add constraint team_player_fk foreign key
	references team(id)
)

create table sponsor(
	id serial primary key,
	name varchar
)

create table have(
	id_team int,
	add constraint team_have_fk foreign key
	references team(id),
	id_sponsor int
	add constraint sponsor_have_fk foreign key
	references sponsor(id)
)

create table play_against(
	datetime date,
	stadium varchar,
	team_a int,
	add constraint team_a_fk foreign key
	references team(id),
	team_b int,
	add constraint team_b_fk foreign key
	references team(id)
)