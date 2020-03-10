Holiday Hero Database
=====================

The following is the structure of the database for the server:

## Users

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the user                                  |
| username              | string        | NOT NULL                  | User's username                                   |
| name                  | string        | NOT NULL                  | User's name for display purposes                  |
| auth                  | string        | NOT NULL                  | Data used to authenticate user                    |
| default-roll-days     | int           | NOT NULL                  | Number of days after occasion before rolling      |
| default-share-mode    | int           | NOT NULL                  | Default share mode for new lists                  |
| created               | string        | NOT NULL                  | Date the user was created                         |
| last-login            | string        | NOT NULL                  | Date the user last logged in                      |
| login-attempts        | int           | NOT NULL                  | Number of times a user has failed to log in       |
| state                 | int           | NOT NULL                  | NORMAL or LOCKED                                  |
| level                 | int           | NOT NULL                  | USER, MODERATOR, or ADMIN                         |

## People

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the person                                |
| name                  | string        | NOT NULL                  | Name of the person                                |
| description           | string        |                           | Description of the person                         |
| owner                 | string        | NOT NULL                  | User who created the non-user                     |
| user                  | string        |                           | UUID of the person, if another user               |

## Gifts

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| name                  | string        | NOT NULL                  | The name of the gift                              |
| description           | string        |                           | A description of the gift                         |
| person                | string        | NOT NULL                  | UUID of the person giving/receiving               |
| date                  | string        |                           | The specific date of the gift                     |
| status                | int           |                           | Indicator for received, or current giving status  |

## Occasions

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the occasion                              |
| owner                 | string        | NOT NULL                  | UUID of the occasion owner                        |
| title                 | string        | NOT NULL                  | Title displayed for the occasion                  |
| description           | string        |                           | Description of the occasion                       |
| day                   | string        | NOT NULL                  | Day of the year the occasion is on                |
| day-this-year         | string        | NOT NULL                  | Day of the year used this year for rolling        |
| current-year          | int           | NOT NULL                  | The current year for this occasion                |
| type                  | int           | NOT NULL                  | Indicator for giving/receiving/both               |
| created               | string        | NOT NULL                  | Date the occasion was created                     |
| modified              | string        | NOT NULL                  | Date the occasion was modified                    |

## Lists

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the list                                  |
| title                 | string        | NOT NULL                  | Title displayed for the list                      |
| created               | string        | NOT NULL                  | Date the list was created                         |
| modified              | string        | NOT NULL                  | Date the list was modified                        |
| owner                 | string        | NOT NULL                  | UUID of the user who created the list             |
| share-mode            | int           | NOT NULL                  | Sharing mode, number corresponds to enum          |
| share-code            | string        |                           | Share code, if empty there is no code             |

## Occasions-Giving

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |
| person                | string        | NOT NULL                  | UUID of the person                                |

## Occasions-Recieving

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |
| person                | string        | NOT NULL                  | UUID of the person                                |

## Occasions-Gifts  

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |
| gift                  | string        | NOT NULL                  | UUID of the gift                                  |

## Lists-Occasions

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |

## Lists-Shares

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the relationship                          |
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| user                  | string        | NOT NULL                  | UUID of the user to share with                    |

## People-Ideas

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the mapping                               |
| person                | string        | PRIMARY KEY               | UUID of the person                                |
| idea                  | string        | PRIMARY KEY               | UUID of the idea, which is a gift                 |
