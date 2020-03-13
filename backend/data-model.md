Holiday Hero Data Model
=======================

The following are the data classes used by Holiday Hero:

#### User

This holds all the basic info about a user.

 * id: UUID
   * Unique ID for the user
 * username: String
   * Username used for login purposes
 * auth: String
   * Auth String used for login purposes
 * name: String
   * Visible name when others use your account, defaults to username
 * defaultRollDays: int
   * Default number of days after occasion to roll occasion or list
 * defaultPublic: boolean
   * Whether lists are public or private by default
 * created: LocalDateTime
   * The creation date for the user
 * lastLogin: LocalDateTime
   * The date the user last logged in
 * loginAttempts: int
   * The number of failed login attempts since the last successful one
 * state: UserState
   * For now, whether the account is locked or not, but could add more states
 * level: UserLevel
   * The permission level for the user, used for admin endpoints
   * The first user created will have admin permissions and all others start as user level

#### Person

This holds info about people the user gives/receives gifts from.
These are users and nonusers.

 * id: UUID
   * Unique ID of the person
 * name: String
   * The displayed name of the person
 * description: String
   * Info about the person, could be anything useful to the user
 * owner: User
   * The user who created the person
 * user: User
   * If the person has a user account, this is what links it
 * ideas: List\<Gift\>
   * A list of gift ideas for the person
 * created: LocalDateTime
   * When the person was created
 * modified: LocalDateTime
   * The last time the info for the person was modified

#### Gift

This hold info about a gift, either given or received.

 * id: UUID
   * Unique ID of the gift
 * name: String
   * A concise name of the gift
 * description: String
   * A more detailed description of the gift
 * created: LocalDateTime
   * When the gift was created
 * modified: LocalDateTime
   * The last time the gift was modified
 * person: Person
   * The person who the gift is associated with
 * given: LocalDate
   * The date the gift was given
 * status: GiftStatus
   * Indicator for whether a gift is an idea, received, or several stages toward being given

#### Occasion

This holds info about occasions, which are holidays, birthdays, etc.

 * id: UUID
   * Unique ID for the occasion
 * title: String
   * Brief title of the occasion
 * description: String
   * Longer description of the occasion
 * owner: User
   * The user who created the occasion
 * day: LocalDate
   * The day of the year when the occasion happens
 * dayThisYear: LocalDate
   * The date this occasion occurs this year
   * This defaults to day, but can be modified
 * currentYear: int
   * The current year of the occasion
   * This is used to keep track of when it rolls
 * created: LocalDateTime
   * When the occasion was created
 * modified: LocalDateTime
   * The last time the metadata was modified
 * giving: List\<Person\>
   * A list of people the user needs to get gifts for this occasion
 * given: List\<Gift\>
   * A list of the gifts you have given or are in the process of giving
 * received: List\<Gift\>
   * A list of all the gifts you received during this occasion

#### List

This holds info about lists of gift ideas for a user.

 * id: UUID
   * Unique ID for the list
 * title: String
   * A short title of the list
 * description: String
   * A longer description of the list
 * created: LocalDateTime
   * When the list was created
 * modified: LocalDateTime
   * The last time the list was editted
 * owner: User
   * The user who owns the list
 * public: boolean
   * Whether anyone with a share code can view the list, or if only specified users have access
 * shareCode: String
   * The share code to give out so others can see the list
 * shared: List\<User\>
   * If the list is private, only these users can view
 * items: List\<Gift\>
   * All the ideas on the list
   * All start off with status IDEA, and when someone selects it, it goes to CHOSEN
   * When a list rolls, all CHOSEN items go the appropriate occasion's received list
 * occasions: List\<Occasion\>
   * The occasions the list should be used for
 * next: LocalDate
   * The next occasion for the list, changes when the list is rolled

#### UserState

This is an enum for a user's current state.

 * NORMAL
 * LOCKED

#### UserLevel

This is an enum for a user's permission level.

 * GUEST
 * USER
 * MODERATOR
 * ADMIN

#### GiftStatus

This is an enum for the status of a gift.

 * RECEIVED
 * IDEA
 * CHOSEN
 * BOUGHT
 * IN\_POSSESION
 * WRAPPED
 * GIVEN
