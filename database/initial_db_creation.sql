-- Active: 1730160956391@@192.168.21.99@5432@event_reminder@public
CREATE Table SystemUser
(
    userId SERIAL PRIMARY KEY,
    username varchar(50) UNIQUE,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(50)
)

CREATE Table Event
(
    eventId SERIAL PRIMARY KEY,
    userId INTEGER REFERENCES SystemUser,
    name VARCHAR(50),
    description VARCHAR,
    startDate DATE,
    endDate DATE,
    IsRecurring BOOLEAN
)

CREATE Table Task
(
    taskId SERIAL PRIMARY KEY,
    userId INTEGER REFERENCES SystemUser,
    name VARCHAR(50),
    description VARCHAR,
    startDate DATE,
    endDate DATE,
    RecurDaily BOOLEAN,
    RecurWeekly BOOLEAN,
    RecurMonthly BOOLEAN,
    RecurYearly BOOLEAN
)

CREATE Table WishlistItem
(
    wishlistItemId SERIAL PRIMARY KEY,
    eventId INTEGER REFERENCES Event,
    name VARCHAR(50),
    description VARCHAR,
    url VARCHAR
)