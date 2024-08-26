INSERT INTO abilities (
  ability_name, created_at, updated_at
) values (
  'all', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
);

INSERT INTO roles (
  role_name, created_at, updated_at
) values (
  'ADMIN', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
);

INSERT INTO users (
  name, kana, email, password, created_at, updated_at
) values (
  'test', 'テスト', 'test@gmail.com', 'testtest', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
);

INSERT INTO role_users (
  role_id, user_id, created_at, updated_at
) values (
  1, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
);

INSERT INTO role_abilities (
  role_id, ability_id, created_at, updated_at
) values (
  1, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
);
