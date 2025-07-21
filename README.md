### BlackRock FinancialWellbeing at HackerRank 
### Java Spring Project
### Code Challange

This is the repo for the code challenge of Mexico 07/18/2025
@Autor: Alberto Vidana Manjarrez
Chihuahua, Chih. Mexico

** Up and running on **
AWS:
ec2-3-144-194-247.us-east-2.compute.amazonaws.com:8080/blackrock/challenge/v1
** Repos **
GitLab:
https://gitlab.com/bert4help/blackrock/-/tree/400f54abc9513114202a3bc5970be30d7401ba56/
GitHub:
https://github.com/AlbertoVidana/BlackRock/

Completed:
    * Parse
    * Validator
    * Filter
    * PPR
    * Ishares
    * Performance

The project 80/100 completed!!!

EndPoints: 
/transactions
	Get:
	http://localhost:8080/blackrock/challenge/v1/transactions/validator
	{ 
	    "wage": 50000,
	    "transactions":[
	        {"date": "2023-10-12 20:15", "amount": 250},
	        {"date": "2023-02-28 15:49", "amount": 375},
	        {"date": "2023-07-01 21:59", "amount": 620},
	        {"date": "2023-11-12 08:09", "amount": 480},
	        {"date": "2023-11-12 08:09", "amount": 480}
	    ]
	}
	
	POST: 
	http://localhost:8080/blackrock/challenge/v1/transactions/parse
	[
	{"date": "2023-10-12 20:15", "amount": 250},
	{"date": "2023-02-28 15:49", "amount": 375},
	{"date": "2023-07-01 21:59", "amount": 620},
	{"date": "2023-11-12 08:09", "amount": 480}
	]
	
	Get:
	http://localhost:8080/blackrock/challenge/v1/transactions/filter
	{ 
		"q": [
			{"fixed": 0, "start": "2023-07-01 00:00", "end": "2023-07-31 23:59" }
		],
		"p": [
			{"extra": 25, "start": "2023-10-01 08:00", "end": "2023-12-31 19:59" }
		],
		"k": [
			{"start": "2023-03-01 00:00", "end": "2023-11-31 23:59" },
			{"start": "2023-01-01 00:00", "end": "2023-12-31 23:59" }
		],
	    "wage": 50000,
	    "transactions":[
	        {"date": "2023-10-12 20:15", "amount": 250},
	        {"date": "2023-02-28 15:49", "amount": 375},
	        {"date": "2023-07-01 21:59", "amount": 620},
	        {"date": "2023-11-12 08:09", "amount": 480},
	        {"date": "2023-11-12 08:09", "amount": 480}
	    ]
	}

/Returns
    GET:ppr
        http://localhost:8080/blackrock/challenge/v1/returns/ppr
    GET:ppr
        http://localhost:8080/blackrock/challenge/v1/returns/ishares

/Performance
    GET:
        http://localhost:8080/blackrock/challenge/v1/performance

