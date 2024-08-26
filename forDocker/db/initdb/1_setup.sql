CREATE TABLE if not exists abilities (
  id SERIAL NOT NULL PRIMARY KEY,
  ability_name VARCHAR(50) NOT NULL,
  created_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  is_active BOOLEAN DEFAULT true
);

CREATE TABLE if not exists roles (
  id SERIAL NOT NULL PRIMARY KEY,
  role_name VARCHAR(50) NOT NULL,
  created_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  is_active BOOLEAN DEFAULT true
);

CREATE TABLE if not exists users (
  id SERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  kana VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(15) NOT NULL,
  image VARCHAR(255),
  created_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  is_active BOOLEAN DEFAULT true
);

CREATE TABLE if not exists role_users (
  id SERIAL NOT NULL PRIMARY KEY,
  role_id INT,
  user_id INT,
  created_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  is_active BOOLEAN DEFAULT true,
  FOREIGN KEY (role_id) REFERENCES roles (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

CREATE TABLE if not exists role_abilities (
  id SERIAL NOT NULL PRIMARY KEY,
  role_id INT,
  ability_id INT,
  created_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP(0) WITH TIME ZONE NOT NULL,
  is_active BOOLEAN DEFAULT true,
  FOREIGN KEY (role_id) REFERENCES roles (id),
  FOREIGN KEY (ability_id) REFERENCES abilities (id)
);
