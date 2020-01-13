Holiday Hero API
================

Below are the endpoints for the Holiday Hero server:

| Endpoint                                      | Description                                                   |
|-----------------------------------------------|---------------------------------------------------------------|
| /v1/register                                  | This is how to create a new user                              |
| /v1/lists                                     | Gets all of the lists you have created                        |
| /v1/lists/occasions                           | Gets a list of all the user's occasions                       |
| /v1/lists/occasions/add                       | Create an occasion                                            |
| /v1/lists/occasions/{id}                      | Gets info about an occasion                                   |
| /v1/lists/occasions/{id}/remove               | Deletes the occasion                                          |
| /v1/lists/occasions/{id}/update               | Replaces info about the occasion                              |
| /v1/lists/default-share                       | Sets the default share mode for new lists                     |
| /v1/lists/add                                 | Adds a new list                                               |
| /v1/lists/{id}                                | Gets info about the list                                      |
| /v1/lists/{id}/remove                         | Removes the list                                              |
| /v1/lists/{id}/update                         | Updates metadata about the list                               |
| /v1/lists/{id}/roll                           | Roll over a list so bought items are deleted                  |
| /v1/lists/{id}/items                          | Gets all the items in the list                                |
| /v1/lists/{id}/items/add                      | Add the specified item to the list                            |
| /v1/lists/{id}/items/{item-id}                | Get info on the specified item                                |
| /v1/lists/{id}/items/{item-id}/remove         | Remove the specified item from the list                       |
| /v1/lists/{id}/items/{item-id}/update         | Replace info about the item with the given data               |
| /v1/lists/{id}/occasions                      | Gets all the occasions that are set for the list              |
| /v1/lists/{id}/occasions/{occasion-id}/set    | Sets occasion to this list                                    |
| /v1/lists/{id}/occasions/{occasion-id}/unset  | Unsets occasion from this list                                |
| /v1/lists/{id}/sharing/mode                   | Changes the mode of sharing between public, friends, selected |
| /v1/lists/{id}/sharing/code                   | Gets a code that anyone can use to see the list               |
| /v1/lists/{id}/sharing/reset-code             | Resets the share code so that the old one is invalid          |
| /v1/lists/{id}/sharing/delete-code            | Removes the share code, not creating a new one                |
| /v1/lists/{id}/sharing/{user-id}/set          | Allows person to be able to view the list                     |
| /v1/lists/{id}/sharing/{user-id}/unset        | Unallows person to view assuming not able to by other means   |
| /v1/giving                                    | Gets all of the occasions the user is getting gifts for       |
| /v1/giving/default-roll                       | Set the default days after an occasion for it to roll         |
| /v1/giving/add                                | Adds a new gift giving occasion                               |
| /v1/giving/{id}                               | Gets summary info relevant to the occasion                    |
| /v1/giving/{id}?year=20XX                     | Gets all the info for an occasion from a previous year        |
| /v1/giving/{id}/roll                          | Rolls occasion to the next year                               |
| /v1/giving/{id}/remove                        | Removes the giving occasion                                   |
| /v1/giving/{id}/add                           | Adds a person to the occasion                                 |
| /v1/giving/{id}/{person}                      | Gets info about the person for the occasion                   |
| /v1/giving/{id}/{person}/remove               | Remove the person from the occasion                           |
| /v1/giving/{id}/{person}/update               | Update info about the person                                  |
| /v1/giving/{id}/{person}/add                  | Adds a gift for the person, marks the gift if getting off list|
| /v1/giving/{id}/{person}/{gift}               | Gets info about the gift                                      |
| /v1/giving/{id}/{person}/{gift}/remove        | Removes the gift, unmarks if the gift was marked              |
| /v1/giving/{id}/{person}/{gift}/update        | Updates the info or status of the gift                        |
