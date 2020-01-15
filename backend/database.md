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

## Lists

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the list                                  |
| title                 | string        | NOT NULL                  | Title displayed for the list                      |
| owner                 | string        | NOT NULL                  | UUID of the user who created the list             |
| share-mode            | int           | NOT NULL                  | Sharing mode, number corresponds to enum          |
| share-code            | string        |                           | Share code, if empty there is no code             |

## List-Items

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the list item                             |
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| title                 | string        | NOT NULL                  | Title displayed for the item                      |
| description           | string        |                           | A more detailed description of what it is         |
| link                  | string        |                           | A link where the item could be found online       |

## List-Occasions

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
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| occasion              | string        | NOT NULL                  | UUID of the occasion                              |

## List-Shares

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the mapping                               |
| list                  | string        | NOT NULL                  | UUID of the list                                  |
| user                  | string        | NOT NULL                  | UUID of the user to share with                    |

## Giving

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the giving occasion                       |
| owner                 | string        | NOT NULL                  | UUID of the user                                  |
| title                 | string        | NOT NULL                  | Title of the occasion                             |
| description           | string        | NOT NULL                  | description of the occasion                       |

## Nonusers

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the non-user                              |
| name                  | string        | NOT NULL                  | Name of the non-user                              |
| owner                 | string        | NOT NULL                  | User who created the non-user                     |

## Gifts   

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the gift                                  |
| title                 | string        | NOT NULL                  | Name of the gift                                  |
| description           | string        |                           | Description for the gift                          |
| owner                 | string        | NOT NULL                  | User who created the gift                         |
| receiver              | string        | NOT NULL                  | User or nonuser who the gift is for               |
| status                | int           | NOT NULL                  | Status of the gift, maps to an enum               |
