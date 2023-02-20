Create Database Geek;

Create Table userInfo (
userNameId Varchar(400) primary key, /* primary */
userPasswrd Varchar(400),
userFirstName Varchar(400),
userLastName Varchar(400),
userEmail Varchar(400),
userAddress Varchar(400),
userCardCreditNum INT 
);

Create Table author ( 
author_id INT primary key, /* primary */
authorFirst Varchar(400),
authorMidInit Varchar(400),
authorLast Varchar(400),
authorBio Varchar(400),
PublisherName Varchar(400)
);

Create Table book (
bookISBN INT primary key, /* primary */
bookPrice double,
bookName Varchar(400),
bookDesc Varchar(400),
bookAuthor Varchar(400),
bookGenre Varchar(400), 
bookRating double,
bookPublishedYear Varchar(400),
bookCopiesSold Int auto_increment,
publisherId INT /* foreign */
);

Create Table publisher (
PublisherName Varchar(400) primary key
);



