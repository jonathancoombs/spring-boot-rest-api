drop table if exists user;

CREATE TABLE user
(
  id INT(11) PRIMARY KEY NOT NULL,
  create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  state TINYINT(4) unsigned NOT NULL,
  username VARCHAR(65) NOT NULL,
  first_name VARCHAR(35) NOT NULL,
  last_name VARCHAR(35) NOT NULL,
  title VARCHAR(100) NOT NULL,
  email VARCHAR(255) NOT NULL,
  phone VARCHAR(45) NOT NULL,
  active_to DATE,
  active_from DATE DEFAULT '0000-00-00' NOT NULL
);
CREATE UNIQUE INDEX DUK_user_username ON user (username);
CREATE INDEX IDX_user_email ON user (email);

insert into user (
  id,
  state,
  username,
  first_name,
  last_name,
  title,
  email,
  phone,
  active_to,
  active_from
) values (
  51300,
  2,
  'jonathan.coombs@discoverorg.com',
  'Jonathan',
  'Coombs',
  'Director of Sofware Development',
  'jonathan.coombs@discoverorg.com',
  '360-524-2501',
  '2018-06-01',
  '2014-06-01'
);