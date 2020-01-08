Holiday Hero Database
=====================

The following is the structure of the database for the server:

## Users

| Field                 | Type          | Parameters                | Description                                       |
|-----------------------|---------------|---------------------------|---------------------------------------------------|
| id                    | string        | PRIMARY KEY               | UUID of the user                                  |
| username              | string        | NOT NULL                  | User's username                                   |
| auth                  | string        | NOT NULL                  | Data used to authenticate user                    |
| roll-days             | int           | NOT NULL                  | Number of days after occasion before rolling      |
