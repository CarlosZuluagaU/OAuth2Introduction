SpringOAuth2 - Authentication Application
This is a demo project that implements a secure authentication system using Spring Boot and Spring Security. The application allows users to log in through external identity providers such as Google and GitHub, using the OAuth 2.0 protocol.

<img width="792" height="433" alt="image" src="https://github.com/user-attachments/assets/68bb380b-bc34-4fc6-b9e2-fe679819c3f0" />


✨ Features
OAuth 2.0 Authentication: Full integration with the “Authorization Code Grant” flow.

Multiple Providers: Out-of-the-box support for:

[x] Google Login

[x] GitHub Login

Robust Security: Built on Spring Security to manage sessions, CSRF protection, and secure redirects.

Simplified Configuration: All provider configuration is managed through the application.properties file.

🛠️ Technologies Used
Backend:

Spring Boot - Main application framework.

Spring Security - For authentication and authorization management.

Spring Boot Starter OAuth2 Client - For integration with OAuth 2.0 clients.

Language:

Java

Dependency Management:

Maven

📋 Prerequisites
Before you begin, make sure you have the following installed:

JDK 17 or higher.

Apache Maven 3.6 or higher.

A GitHub account to generate credentials.

A Google Cloud account to generate credentials.

⚙️ Configuration
To run the project, you need to configure the credentials for the OAuth 2.0 providers.


GitHub: Follow the steps to create an OAuth App on GitHub and obtain your Client ID and Client Secret.

Google: Follow the steps to create an OAuth 2.0 client ID in Google Cloud and obtain your Client ID and Client Secret.

Configure the application.properties file:
Open the file located in src/main/resources/application.properties and replace the placeholders with your actual credentials.

Properties

# Application name
spring.application.name=SpringOAuth2

# --- Configuration for Login with GitHub ---
spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET

# --- Configuration for Google Login ---
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET
Important: The authorized redirect URI for local development is http://localhost:8080/login/oauth2/code/google for Google and http://localhost:8080/login/oauth2/code/github for GitHub. Make sure you have configured them correctly in the provider consoles.

▶️ Execution
Once the project is configured, you can run it using the following Maven command:

Bash

mvn spring-boot:run
The application will start at http://localhost:8080.

When you try to access any protected route, you will be redirected to the Spring Security login page, where you can choose to log in with Google or GitHub.
