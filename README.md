📌 Linklytics - URL Shortening Web Application
🚀 Linklytics is a full-stack URL shortening application that simplifies link sharing, enhances analytics, and ensures security. The platform allows users to shorten URLs, track usage analytics, and manage their links effectively.
 
🛠 Tech Stack
Frontend
•	React.js  + Vite 
•	Tailwind CSS 
Backend
•	Java + Spring Boot 
•	Spring Security 
•	JPA (Java Persistence API) 
•	PostgreSQL 
Authentication
•	JWT Token Authentication 
 
📌 Features
✅ User Authentication: Secure signup & login using JWT authentication.
✅ URL Shortening: Upload an original URL and get a shortened version instantly.
✅ Analytics Dashboard: Track how many times a shortened URL was accessed.
✅ Date-wise Click Tracking: View detailed analytics of user interactions with links.
✅ Database Management: Store user details, original and shortened URLs, and track user clicks in PostgreSQL.
 
📷 Screenshots
📸 Below are some screenshots showcasing how the website works and visualizes analytics.

 
🛠 Installation & Setup
Backend Prerequisites
•	Java 17+
•	Maven
•	PostgreSQL
Front End Prerequisites
•	Node.js 18+
•	npm / yarn
 
🌍 API Endpoints
Method	Endpoint	Description
POST	/api/auth/public/register	Register a new user
POST	/api/auth/public/login	Login & get JWT token
POST	/api/urls/shorten	Shorten a URL
GET	/api/urls/myurls	Fetch user's shortened URLs
GET	/api/urls/analytics/{shortUrl}	Get analytics for a specific short URL
GET	/api/urls/totalClicks	Get total clicks on user’s URLs
 
🚀 Deployment
Frontend Deployment
•	Hosted on Netlify
•	Example: https://resplendent-bavarois-38b764.netlify.app/
Backend Deployment
•	Hosted on Render
•	Example: https://url-shortener-sb-sfua.onrender.com
Database(PostgreSQL)
•	Created on Neon.tech
 
📌 Future Enhancements
🔹 Custom aliases for shortened URLs
🔹 Admin dashboard for managing all links
🔹 Expiry date for shortened URLs
 
📜 License
This project is open-source and available under the MIT License.
 
🤝 Contributing
🔹 Fork the repository
🔹 Create a new branch
🔹 Make your changes & push
🔹 Submit a Pull Request
 
📞 Contact
For any queries, feel free to reach out!
📧 Email: mugdhakarodkar0819@gmail.com
🔗 GitHub: https://github.com/mkarodka

![image](https://github.com/user-attachments/assets/c58c453d-b86a-4b0d-b9d5-b36831136fa9)
