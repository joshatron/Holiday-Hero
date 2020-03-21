Holiday Hero API
================

Below are the endpoints for the Holiday Hero server:

| Endpoint                                         | Type   | Description                                                   |
|--------------------------------------------------|--------|---------------------------------------------------------------|
| /v1/occasions                                    | GET    | Gets a list of all the user's occasions                       |
| /v1/occasions/default-roll                       | POST   | Sets the default days after an occasion to roll               |
| /v1/occasions/add                                | PUT    | Create an occasion                                            |
| /v1/occasions/{id}                               | GET    | Gets info about an occasion                                   |
| /v1/occasions/{id}/remove                        | DELETE | Deletes the occasion                                          |
| /v1/occasions/{id}/update                        | POST   | Replaces info about the occasion                              |
| /v1/occasions/{id}/roll                          | POST   | Rolls occasion to the next year                               |
| /v1/occasions/{id}/{person-id}/set               | POST   | Gets info about the person for the occasion                   |
| /v1/occasions/{id}/{person-id}/unset             | POST   | Remove the person from the occasion                           |
| /v1/occasions/{id}/giving                        | GET    | Gets giving summary info for the occasion                     |
| /v1/occasions/{id}/giving?year=20XX              | GET    | Gets all the giving info for an occasion in a previous year   |
| /v1/occasions/{id}/giving/add                    | PUT    | Adds a gift for the person, marks the gift if getting off list|
| /v1/occasions/{id}/giving/{gift}                 | GET    | Gets info about the gift                                      |
| /v1/occasions/{id}/giving/{gift}/remove          | DELETE | Removes the gift, unmarks if the gift was marked              |
| /v1/occasions/{id}/giving/{gift}/update          | POST   | Updates the info or status of the gift                        |
| /v1/occasions/{id}/receiving                     | GET    | Gets recieving summary info for the occasion                  |
| /v1/occasions/{id}/receiving?year=20XX           | GET    | Gets all the receiving info for an occasion in a previous year|
| /v1/occasions/{id}/receiving/add                 | PUT    | Adds a gift received from the person                          |
| /v1/occasions/{id}/receiving/{gift}              | GET    | Gets info about the gift                                      |
| /v1/occasions/{id}/receiving/{gift}/remove       | DELETE | Removes the gift                                              |
| /v1/occasions/{id}/receiving/{gift}/update       | POST   | Updates the info or status of the gift                        |
| /v1/people                                       | GET    | Gets list of people, both users you created and existing      |
| /v1/people/add                                   | PUT    | Creates a person/adds existing to your network                |
| /v1/people/{id}                                  | GET    | Gets info about a person                                      |
| /v1/people/{id}/remove                           | DELETE | Deletes a person, removing them from all occasions            |
| /v1/people/{id}/update                           | POST   | Updates info about the person                                 |
| /v1/people/{id}/ideas                            | GET    | Gets list of gift ideas for the person                        |
| /v1/people/{id}/ideas/{item}                     | GET    | Gets info about the item                                      |
| /v1/people/{id}/ideas/{item}/remove              | DELETE | Remove the item                                               |
| /v1/people/{id}/ideas/{item}/update              | POST   | Updates info about the item                                   |
| /v1/lists                                        | GET    | Gets all of the lists you have created                        |
| /v1/lists/default-share                          | POST   | Sets the default share mode for new lists                     |
| /v1/lists/add                                    | PUT    | Adds a new list                                               |
| /v1/lists/{id}                                   | GET    | Gets info about the list                                      |
| /v1/lists/{id}/remove                            | DELETE | Removes the list                                              |
| /v1/lists/{id}/update                            | POST   | Updates metadata about the list                               |
| /v1/lists/{id}/roll                              | POST   | Roll over a list so bought items are deleted                  |
| /v1/lists/{id}/items                             | GET    | Gets all the items in the list                                |
| /v1/lists/{id}/items/add                         | PUT    | Add the specified item to the list                            |
| /v1/lists/{id}/items/{item}                      | GET    | Get info on the specified item                                |
| /v1/lists/{id}/items/{item}/remove               | DELETE | Remove the specified item from the list                       |
| /v1/lists/{id}/items/{item}/update               | POST   | Replace info about the item with the given data               |
| /v1/lists/{id}/occasions                         | GET    | Gets all the occasions that are set for the list              |
| /v1/lists/{id}/occasions/{occasion}/set          | POST   | Sets occasion to this list                                    |
| /v1/lists/{id}/occasions/{occasion}/unset        | POST   | Unsets occasion from this list                                |
| /v1/lists/{id}/sharing/code                      | GET    | Gets a code that anyone can use to see the list               |
| /v1/lists/{id}/sharing/reset-code                | POST   | Resets the share code so that the old one is invalid          |
| /v1/lists/{id}/sharing/delete-code               | DELETE | Removes the share code, not creating a new one                |
| /v1/lists/{id}/sharing/{person}/set              | POST   | Allows person to be able to view the list                     |
| /v1/lists/{id}/sharing/{person}/unset            | POST   | Unallows person to view assuming not able to by other means   |
| /v1/lists/code/{code}                            | GET    | Gets a list from a share code, no auth needed if public       |
| /v1/admin/register                               | PUT    | This is how to create a new user                              |
| /v1/admin/{user}/update-password                 | POST   | Update password for yourself/other, if blank makes random     |
| /v1/admin/{user}/update-username                 | POST   | Update username for yourself/other, if blank makes random     |
| /v1/admin/{user}/unlock                          | POST   | Unlocks a user who got locked out                             |
| /v1/admin/{user}/remove                          | DELETE | Delete a user and all their info                              |
| /v1/admin/{user}/update-level                    | POST   | Promote or demote a user                                      |
| /v1/admin/{user}/export                          | GET    | Export all info about a user                                  |
| /v1/admin/import                                 | PUT    | Create a user based on info                                   |
| /v1/admin/register-mode                          | POST   | Whether you need an invite code or not to register            |
| /v1/admin/register-code                          | PUT    | Gives a one time use registration code                        |
