Holiday Hero API
================

Below are the endpoints for the Holiday Hero server:

| Endpoint                                                  | Description                                                   |
|-----------------------------------------------------------|---------------------------------------------------------------|
| /v1/register                                              | This is how to create a new user                              |
| /v1/occasions                                             | Gets a list of all the user's occasions                       |
| /v1/occasions/default-roll                                | Sets the default days after an occasion to roll               |
| /v1/occasions/add                                         | Create an occasion                                            |
| /v1/occasions/{id}                                        | Gets info about an occasion                                   |
| /v1/occasions/{id}/remove                                 | Deletes the occasion                                          |
| /v1/occasions/{id}/update                                 | Replaces info about the occasion                              |
| /v1/occasions/{id}/roll                                   | Rolls occasion to the next year                               |
| /v1/occasions/{id}/{person-id}/set                        | Gets info about the person for the occasion                   |
| /v1/occasions/{id}/{person-id}/unset                      | Remove the person from the occasion                           |
| /v1/occasions/{id}/giving                                 | Gets giving summary info for the occasion                     |
| /v1/occasions/{id}/giving?year=20XX                       | Gets all the giving info for an occasion in a previous year   |
| /v1/occasions/{id}/giving/{person-id}/exclude             | Exclude person from giving gifts for this occasion            |
| /v1/occasions/{id}/giving/{person-id}/include             | Include person from giving gifts for this occasion            |
| /v1/occasions/{id}/giving/{person-id}/add                 | Adds a gift for the person, marks the gift if getting off list|
| /v1/occasions/{id}/giving/{person-id}/{gift}              | Gets info about the gift                                      |
| /v1/occasions/{id}/giving/{person-id}/{gift}/remove       | Removes the gift, unmarks if the gift was marked              |
| /v1/occasions/{id}/giving/{person-id}/{gift}/update       | Updates the info or status of the gift                        |
| /v1/occasions/{id}/receiving                              | Gets recieving summary info for the occasion                  |
| /v1/occasions/{id}/receiving?year=20XX                    | Gets all the receiving info for an occasion in a previous year|
| /v1/occasions/{id}/receiving/{person-id}/exclude          | Exclude person from receiving gifts for this occasion         |
| /v1/occasions/{id}/receiving/{person-id}/include          | Include person from receiving gifts for this occasion         |
| /v1/occasions/{id}/receiving/{person-id}/add              | Adds a gift received from the person                          |
| /v1/occasions/{id}/receiving/{person-id}/{gift}           | Gets info about the gift                                      |
| /v1/occasions/{id}/receiving/{person-id}/{gift}/remove    | Removes the gift                                              |
| /v1/occasions/{id}/receiving/{person-id}/{gift}/update    | Updates the info or status of the gift                        |
| /v1/people                                                | Gets list of people, both users you created and existing      |
| /v1/people/add                                            | Creates a person/adds existing to your network                |
| /v1/people/{id}                                           | Gets info about a person                                      |
| /v1/people/{id}/remove                                    | Deletes a person, removing them from all occasions            |
| /v1/people/{id}/update                                    | Updates info about the person                                 |
| /v1/people/{id}/ideas                                     | Gets list of gift ideas for the person                        |
| /v1/people/{id}/ideas/{item-id}                           | Gets info about the item                                      |
| /v1/people/{id}/ideas/{item-id}/remove                    | Remove the item                                               |
| /v1/people/{id}/ideas/{item-id}/update                    | Updates info about the item                                   |
| /v1/lists                                                 | Gets all of the lists you have created                        |
| /v1/lists/default-share                                   | Sets the default share mode for new lists                     |
| /v1/lists/add                                             | Adds a new list                                               |
| /v1/lists/{id}                                            | Gets info about the list                                      |
| /v1/lists/{id}/remove                                     | Removes the list                                              |
| /v1/lists/{id}/update                                     | Updates metadata about the list                               |
| /v1/lists/{id}/roll                                       | Roll over a list so bought items are deleted                  |
| /v1/lists/{id}/items                                      | Gets all the items in the list                                |
| /v1/lists/{id}/items/add                                  | Add the specified item to the list                            |
| /v1/lists/{id}/items/{item-id}                            | Get info on the specified item                                |
| /v1/lists/{id}/items/{item-id}/remove                     | Remove the specified item from the list                       |
| /v1/lists/{id}/items/{item-id}/update                     | Replace info about the item with the given data               |
| /v1/lists/{id}/occasions                                  | Gets all the occasions that are set for the list              |
| /v1/lists/{id}/occasions/{occasion-id}/set                | Sets occasion to this list                                    |
| /v1/lists/{id}/occasions/{occasion-id}/unset              | Unsets occasion from this list                                |
| /v1/lists/{id}/sharing/mode                               | Changes the mode of sharing between public and private        |
| /v1/lists/{id}/sharing/code                               | Gets a code that anyone can use to see the list               |
| /v1/lists/{id}/sharing/reset-code                         | Resets the share code so that the old one is invalid          |
| /v1/lists/{id}/sharing/delete-code                        | Removes the share code, not creating a new one                |
| /v1/lists/{id}/sharing/{person-id}/set                    | Allows person to be able to view the list                     |
| /v1/lists/{id}/sharing/{person-id}/unset                  | Unallows person to view assuming not able to by other means   |
| /v1/lists/code/{code}                                     | Gets a list from a share code                                 |
| /v1/admin/{user-id}/update-password                       | Update password for yourself/other, if blank makes random     |
| /v1/admin/{user-id}/update-username                       | Update username for yourself/other, if blank makes random     |
| /v1/admin/{user-id}/unlock                                | Unlocks a user who got locked out                             |
| /v1/admin/{user-id}/delete                                | Delete a user and all their info                              |
| /v1/admin/{user-id}/update-level                          | Promote or demote a user                                      |
| /v1/admin/{user-id}/export                                | Export all info about a user                                  |
| /v1/admin/import                                          | Create a user based on info                                   |
