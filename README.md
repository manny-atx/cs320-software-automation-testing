# cs320-software-automation-testing

## How can I ensure that my code, program, or software is functional and secure?

To ensure the application is functional and secure please follow the guidelines below:

    * __Never__ check in usernames, passwords or other sensitive data to the repo
    * Integrate CI/CD to the repository
        * Specify branches that `need` CI/CD
        * Ensure all CI/CD pipelines before merging code to the designated `main` branch
        * Ensure proper merging authorization to the correct individuals
    * Add unit tests for any new code functionality
        * Look for corner cases and validate user input
    * If existing code is updated then update unit tests to ensure new requirements are accounted for in testing

## How do I interpret user needs and incorporate them into a program?

User needs should come from user requests, follow up conversations should be had by the business, stake holders, SMEs and software architects and/or engineers to generate new user features into the application. Follow up discussions should be had by technical teams to identify risks, data sensitivity, environment and follow up with the business. This process should continue until all identified risks are resolved.

## How do I approach designing software?

I would appproach designing software based on user needs. First identifying the proper technologies, frameworks and current best practices. Anywhere from picking the most relevant version of OS/Development Framework/External libraries with 0 known vulnerabilities. Ensure a pipeline is in place to captures potential vulnerabilities in the future like integrating Sonar's SonarQube to identify potential bugs and libraries with known vulnerabilities at the beginning of the project.
