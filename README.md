# arkhe.alarcon
Planit Testing Questions

1. What other possible scenario’s would you suggest for testing the Jupiter Toys application?
Answer:
Creation of account and logging in are important scenarios that is not part of the test. 
Also the check out functionality and empty cart. It is also good to rerun all the scenario when the user is logged in.

2. Jupiter Toys is expected to grow and expand its offering into books, tech, and modern art. 
We are expecting the of tests will grow to a very large number. What approaches could you used to reduce overall execution time?
Answer:
To reduce execution time we can do parallel execution. Also we can create a seperate suite packages for different areas(toys,books,tech and modern art) 
of the application, this way our execution would be targeted for a specific area. Making our reporting and investigation easier.
How will your framework cater for this? 
Answer:
Since I've used testNG we cam implement parallel execution. We can also create seperate packages for different areas.

3. Describe when to use a BDD approach to automation and when NOT to use BDD 
Answer:
Behavioral Driven Development is an approach where test automation script is written in simple text or english 
this way Product Owner, Scrum Master, Project Manager and other non technical member of the team can easily understand 
what the script is aiming to execute. In a framework the best approach is to cover repetitive steps in Gherkin(C#) or Cucumber(Java) 
this way it will be reusable and easier to read.
For Jupiter a good example is. 
Given I navigate to Shop 
When I buy a 'toy' 
Then I can verify the toy amount in the cart.

However, we cannot cover every scenario in behavioral driven approach. Some technical steps will never be converted to BDD like 
the looping, case, condition and etc. So the best approach is to create a framework where it can handle BDD (Gherkin and Cucumber) 
and NonBDD (TestNG, NUnit, JUnit).




