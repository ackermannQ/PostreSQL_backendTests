CREATE TABLE user (
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    userType VARCHAR(100) NOT NULL
);