# JPS App Club: Intents Demo
This is an example app that demonstrates how to move and pass data between multiple Activities using Intents.

It imitates a list of contacts, with a button to add a new contact, that pulls up a second screen to fill in info.
Once you're done filling in the contact's info and click done, the screen disappears, and the list of contacts on the first screen is updated.

The important files are:
- **ContactsActivity.java**
- **NewContactActivity.java**

Both can be found at **IntentsDemo/src/main/java/com/jpsappclub/intentsdemo**

You'll notice in the code references to a `ListView` and an `ArrayAdapter`. These are more advanced UI elements that you don't need to worry about for right now, as they're not the main focus of this demo app, and we'll go over them in a later meeting.
