Holiday Hero Backend
====================

The goal for this application is to store present receiving and giving data.

For a detailed breakdown of the API, look [here](api.md).
For a detailed breakdown of the database, look [here](database.md).

## Structure

The central organizational unit is the occasion.
This is a date in the year that is associated with gift giving, receiving, or both.
Each occasion has a title, description, date, and type.
The type is an indicator if the occasion is for giving, receiving, or both.
It also has an optional reset day that resets every year.
This is useful if say a birthday is on one day, but the party where gifts are received is a week later one year.

For giving data about an occasion, you can keep track of who you are getting gifts for, which can be real or fake users.
That way not everyone has to have an account.
For each person, you can track one or more gifts, along with what stage it is in (picked, bought, received, wrapped, given).
After the occasion has passed, all info is saved and archived for you to view at a later time.

For receiving occasions, you can track what you got from who, including from users without an account.
If they pick your gift based on one of your gift lists, it will automatically be recorded after the occasion has passed.
After a receiving occasion has passed, all data is saved and archived for later viewing.
