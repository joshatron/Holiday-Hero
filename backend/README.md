Holiday Hero Backend
====================

The goal for this application is to store present receiving and giving data.
The hope is to make tracking everything easier.

For a detailed breakdown of the API, look [here](api.md).
For a detailed breakdown of the database, look [here](database.md).

## Structure

### Occasions

The central organizational unit is the occasion.
This is a date in the year that is associated with gift giving, receiving, or both.
Each occasion has a title, description, date, and type.
The type is an indicator if the occasion is for giving, receiving, or both.
It also has an optional reset day that resets every year.
This is useful if say a birthday is on one day, but the party where gifts are received is a week later one year.

### Giving

For giving occasions, you can keep track of who you are getting gifts for, which can be real or fake users.
That way not everyone has to have an account.
For each person, you can track one or more gifts, along with what stage it is in (picked, bought, received, wrapped, given).
After the occasion has passed, all info is saved and archived for you to view at a later time.

### Receiving

For receiving occasions, you can track what you got from who, including from users without an account.
If they pick your gift based on one of your gift lists, it will automatically be recorded after the occasion has passed.
After a receiving occasion has passed, all data is saved and archived for later viewing.

### Lists

Finally, you can maintain wish lists.
These can be tied to one or more occasions to keep track of when to roll over for the next year.
Others can check off items in your list, but it won't be visible to you until after the roll.
That way you can have one list for everyone without having to worry about repeats.
Others can even add what they are getting you even if it's not on your list.

You can also manage the visibility of your list.
The options are public, people you are connected with, or selected only.
You can also get a share code which anyone can use to access the list, even without an account.

For public, anyone with or without an account who you haven't blocked can access it.
For connected, anyone who you have marked for giving or receiving can view it.
For selected, only the users you select can view.
You can use the share code with any of these modes and you are able to reset the code.
