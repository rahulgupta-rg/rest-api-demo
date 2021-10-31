# Low level design of payment system


1. Identify functional requirement/features

    1. Create a financial transaction
    2. Create a user
    3. User should be able to see his transactions


2. Identify entities and there relationship

    1. User - json
       a. user_id (Primary key), string
       b. user_name (full + last),   string/varchar, maxLength=20
       c. Email varchar/string. 30
       d. Phone number -> String
       e. List<Transaction>
       f. Date of Birth -> date
       g. Password -> string minLength 8 maxLength 20

    2. Transaction  
       a. transaction_id (primary key)
       b. Transaction_time
       c. Currency
       d. Amount
       e. User
       f. Destination_user_id
       g. TransactionStatus
       h. PaymentMode

    3. TransactionStatus
       CREATED(1)
       AUTHENTICATED(2)
       DECLINED(3)
       FAILED(4)

    4. PaymentMode
       CASH
       CREDIT_CARD
       DEBIT_CARD
       UPI


3. API specify

   User -> UserController
   1. Create User : Post api with user details
   2. Get User : Get api with user id
   3. Authentication: post api with user id and password

   Transaction -> TransactionController
   1. Create Transactions -> Post api with Transaction request
   2. View single transactions -> Get api with Pass transaction id
   3. View all transaction by user id -> Get api with user id as param and return all transactions

    4. API Signature
       Return_type api_name(api_parameter)

    1. User
       create user

       a. User create_user(User)

       b. User getUser(user_id)

       c. Boolean isAuthenticated(String userId, String password)

    2.  Transaction
        Transaction createTransaction(Transaction)
        Transaction getTransaction(String transactionId)
        List<Transaction> getAllTransactions(String userId)


	5. Code the api 

		Lets go to the side





	System -> SystemController

Bottom up approach

Model - Done
Repository - Done
Business class - Done
Controllers - Lets do it ? But what ? Create api


Controller -> Service -> Repository -> Models


User -> Empty transaction list

Transaction -> user not empty

Flow for deleting a non active user

User id -> controller -> service -> repository -> payment util -> {

	get the user object in users list
	remove that user from user list by using users.remove(user)
}
