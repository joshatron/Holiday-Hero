Holiday Hero API
================

Below are the endpoints for the Holiday Hero server:

| Endpoint                          | Description                                                   |
|-----------------------------------|---------------------------------------------------------------|
| /v1/register                      | This is how to create a new user                              |
| /v1/lists/outgoing                | Gets all of the lists you have created                        |
| /v1/lists/incoming                | Gets all the lists you have been invited to view              |
| /v1/lists/{id}                    | Get the actual list and occasions with the given ID           |
| /v1/lists/{id}/items/add          | Add the specified item to the list                            |
| /v1/lists/{id}/items/remove       | Remove the specified item from the list                       |
| /v1/lists/{id}/items/mark         | Mark that you are getting the specified item from the list    |
| /v1/lists/{id}/occasions/add      | Adds occasion to this list                                    |
| /v1/lists/{id}/occasions/remove   | Removes an occasion from this list                            |
| /v1/lists/{id}/sharing/mode       | Changes the mode of sharing between public, friends, selected |
| /v1/lists/{id}/sharing/code       | Gets a code that anyone can use to see the list               |
| /v1/lists/{id}/sharing/reset-code | Resets the share code so that the old one is invalid          |
| /v1/lists/{id}/sharing/add        | Add a person who can view, only works in selected mode        |
| /v1/lists/{id}/sharing/remove     | Remove a person who can view, only works in selected mode     |
| /v1/occasions                     | Lists the default occasions set for new lists                 |
| /v1/occasions/add                 | Add the occasion to the default list                          |
| /v1/occasions/remove              | Remove the occasion to the default list                       |


