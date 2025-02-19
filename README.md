# 📌 Linklytics - URL Shortening Web Application  

🚀 **Linklytics** is a full-stack URL shortening application that simplifies link sharing, enhances analytics, and ensures security. The platform allows users to shorten URLs, track usage analytics, and manage their links effectively.

---

## 🛠 Tech Stack  

### Frontend  
- ⚡ **React.js** + Vite  
- 🎨 **Tailwind CSS**  

### Backend  
- ☕ **Java** + Spring Boot  
- 🔒 **Spring Security**  
- 📦 **JPA (Java Persistence API)**  
- 🛢 **PostgreSQL**  

### Authentication  
- 🔑 **JWT Token Authentication**  

---

## 📌 Features  

✅ **User Authentication**: Secure signup & login using JWT authentication.  
✅ **URL Shortening**: Upload an original URL and get a shortened version instantly.  
✅ **Analytics Dashboard**: Track how many times a shortened URL was accessed.  
✅ **Date-wise Click Tracking**: View detailed analytics of user interactions with links.  
✅ **Database Management**: Store user details, original and shortened URLs, and track user clicks in PostgreSQL.  

---

## 📷 Screenshots  

📸 Below are some screenshots showcasing how the website works and visualizes analytics.

![image](https://github.com/user-attachments/assets/142bc0ff-22ea-4b00-b86b-f19f0ca49496)
![image](https://github.com/user-attachments/assets/b42d83fd-3985-48fa-9a51-706baaa94c05)
![image](https://github.com/user-attachments/assets/680d6727-c114-48c7-bbc7-e80ed7e824b2)

---

## 🛠 Installation & Setup  

### Backend Prerequisites  
- Java 17+  
- Maven  
- PostgreSQL  

### Frontend Prerequisites  
- Node.js 18+  
- npm / yarn  

---

## 🌍 API Endpoints  

| Method | Endpoint | Description |
|--------|---------|-------------|
| **POST** | `/api/auth/public/register` | Register a new user |
| **POST** | `/api/auth/public/login` | Login & get JWT token |
| **POST** | `/api/urls/shorten` | Shorten a URL |
| **GET** | `/api/urls/myurls` | Fetch user's shortened URLs |
| **GET** | `/api/urls/analytics/{shortUrl}` | Get analytics for a specific short URL |
| **GET** | `/api/urls/totalClicks` | Get total clicks on user’s URLs |

---

## 🚀 Deployment  

### Frontend Deployment  
- 🌐 Hosted on **Netlify**  
- 🔗 [Live Demo](https://resplendent-bavarois-38b764.netlify.app/)  

### Backend Deployment  
- 🚀 Hosted on **Render**  
- 🔗 [API Server](https://url-shortener-sb-sfua.onrender.com)  

### Database (PostgreSQL)  
- 💾 Created on **Neon.tech**  

---

## 📌 Future Enhancements  

🔹 **Custom aliases** for shortened URLs  
🔹 **Admin dashboard** for managing all links  
🔹 **Expiry date** for shortened URLs  

---

## 📜 License  

This project is open-source and available under the **MIT License**.  

---

## 🤝 Contributing  

1. 🔄 **Fork** the repository  
2. 🌿 **Create a new branch**  
3. 🛠 **Make your changes & push**  
4. 📩 **Submit a Pull Request**  

---

## 📞 Contact  

For any queries, feel free to reach out!  

📧 **Email**: [mugdhakarodkar0819@gmail.com](mailto:mugdhakarodkar0819@gmail.com)  
🔗 **GitHub**: [mkarodka](https://github.com/mkarodka)  
