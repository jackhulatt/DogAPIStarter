# Spring Basics

Api?

Within an application -- Front end and this is where the user experiances the service --

						--MiddleWare - API -- Responsible for our business logic 
						
						Back end -- the part where the information in the background happens -- SQL/NOSQL

# Find a fun API and see if you can play around with it (8 mins) 
# Research SOAP and REST APIs -- broad defenition (5 mins)
# REST API what are the 6 fundamental features of a REST API 
# Describe with your own examples (20 mins)


#REST Design 

#Statelessness 
Each request should have all the information it should have and nothing more/less
So the request is made client side and the information will be stored in the database - server side
What is retrieved should only be relevant to the client 

#Uniform Interface
The functions usage (over URLs) should relatively be identical 

CRUD - get - done automatically to fill table/form
../user/addUser
../user/deleteUser 

#Client-server Decoupling (divorce)
Seperated and shouldnt intermingle -- Security -- SQL injection --

#Cacheability
Ideally when you first your application -- it will be a blank slate 
The details that have been saved -- can be used

# Layered System Architecture 

That SOLID -- Single Resp. Each package should be justified and only contain the methods/model of wwhat it should have 

-- Classes should be seperated and methods should only be in their relevant package 

# Hibernate 
A piece of technology that comes insync with Spring -- Entities and these will be automatically be created for us
To define my model --- MySQl is define the database url jdbc:/localhost 3306/<db_name>

#Task 2 
Dependency Injection -- Make notes try it yourself -- (skip ahead and make repo + Service Additional)
Components -- Quick notes
Entities -- Create the Entity yourself -- person 


	// HTTP requests 
	// 5 types of HTTP status code -- define them for me 
	// And then find some special cases for me and how you would use them.
	
	// 1XX -- Parsing Information -- 100 Continue -- That the website itself if okay, and the user should then continue
	// 2XX -- Successful responses -- 200 OK -- Means that the response was accepted => GET Response 
	// 201 -- Created 202 - Accepted
	
	//300 - Redirection Messages - Changing the user to a more suitable url
	
	// 400 -- Client Error - 404 - Site or URL is no longer hosted
	// 500 -- Internal Server Error -- Your code sucks



# Many Dogs to one Trainer
# (Potential Many to Many) 





