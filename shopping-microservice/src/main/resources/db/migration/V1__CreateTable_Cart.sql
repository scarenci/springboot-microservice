create sequence hibernate_sequence start with 1 increment by 1;

create table tb_cart (
	id bigint not null, 
	user_name varchar(255), 
	primary key (id)
);

create table tb_cart_item (
	id bigint not null, 
	quantity bigint, 
	cart_id bigint, 
	primary key (id)
);

alter table tb_cart_item add constraint fk_cart_to_cart_item foreign key (cart_id) references tb_cart