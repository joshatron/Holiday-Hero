Holiday Hero Data Model
=======================

The following are the data classes used by Holiday Hero:

#### User

This holds all the basic info about a user.

 * id: UUID
 * username: String
 * auth: String
 * name: String
 * defaultRollDays: int
 * defaultPublic: boolean
 * created: LocalDateTime
 * lastLogin: LocalDateTime
 * loginAttempts: int
 * state: UserState
 * level: UserLevel

#### Person

This holds info about people the user gives/receives gifts from.
These are users and nonusers.

 * id: UUID
 * name: String
 * description: String
 * owner: User
 * user: User
 * ideas: List\<Gift\>

#### Gift

This hold info about a gift, either given or received.

 * id: UUID
 * name: String
 * description: String
 * created: LocalDateTime
 * modified: LocalDateTime
 * person: Person
 * given: LocalDateTime
 * status: GiftStatus

#### Occasion

This holds info about occasions, which are holidays, birthdays, etc.

 * id: UUID
 * title: String
 * description: String
 * owner: User
 * day: LocalDate
 * dayThisYear: LocalDate
 * currentYear: int
 * created: LocalDateTime
 * modified: LocalDateTime
 * giving: List\<Person\>
 * given: List\<Gift\>
 * received: List\<Gift\>

#### List

This holds info about lists of gift ideas for a user.

 * id: UUID
 * title: String
 * description: String
 * create: LocalDateTime
 * modified: LocalDateTime
 * owner: User
 * public: boolean
 * shareCode: String
 * sharing: List\<User\>
 * items: List\<Gift\>
 * occasions: List\<Occasion\>

#### UserState

This is an enum for a user's current state.

 * NORMAL
 * LOCKED

#### UserLevel

This is an enum for a user's permission level.

 * USER
 * MODERATOR
 * ADMIN

#### GiftStatus

This is an enum for the status of a gift.

 * RECEIVED
 * IDEA
 * BOUGHT
 * IN\_POSSESION
 * WRAPPED
 * GIVEN
