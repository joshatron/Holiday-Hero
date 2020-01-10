Holiday Hero Database
=====================

The following is the structure of the database for the server:

## Users

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the user                                  |
| username              | string        | NOT NULL                  | User's username                                   |
| auth                  | string        | NOT NULL                  | Data used to authenticate user                    |
| default-roll-days     | int           | NOT NULL                  | Number of days after occasion before rolling      |

## Lists

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the list                                  |
| title                 | string        | NOT NULL                  | Title displayed for the list                      |
| owner                 | string        | NOT NULL                  | UUID of the user who created the list             |
| share-mode            | int           | NOT NULL                  | Sharing mode, number corresponds to enum          |

## List-Items

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the list item                             |
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| title                 | string        | NOT NULL                  | Title displayed for the item                      |
| description           | string        |                           | A more detailed description of what it is         |
| link                  | string        |                           | A link where the item could be found online       |

## Occasions

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the occasion                              |
| owner                 | string        | NOT NULL                  | UUID of the occasion owner                        |
| title                 | string        | NOT NULL                  | Title displayed for the occasion                  |
| description           | string        |                           | Description of the occasion                       |
| day                   | string        | NOT NULL                  | Day of the year the occasion is on                |

## Occasion-List-Mappings

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the mapping                               |
| user                  | string        | NOT NULL                  | UUID of the user                                  |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |
