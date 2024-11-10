<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Evergreen College - Home</title>
    <style>
        :root {
            --primary-color: #2c3e50;
            --secondary-color: #27ae60;
            --accent-color: #e67e22;
            --background-color: #ecf0f1;
            --text-color: #333;
            --white: #ffffff;
        }
        
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Arial', sans-serif;
            line-height: 1.6;
            color: var(--text-color);
            background-color: var(--background-color);
        }

        .container {
            width: 90%;
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 20px;
        }

        header {
            background-color: var(--primary-color);
            color: var(--white);
            padding: 1rem 0;
        }

        nav {
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
        }

        .logo {
            font-size: 1.5rem;
            font-weight: bold;
        }

        .nav-links {
            display: flex;
            gap: 1rem;
            margin-right: 1rem;
        }

        .nav-links a {
            color: var(--white);
            text-decoration: none;
            transition: color 0.3s ease;
        }

        .nav-links a:hover {
            color: var(--accent-color);
        }

        .hero {
            background-image: url('https://images.unsplash.com/photo-1541339907198-e08756dedf3f?auto=format&fit=crop&w=1200&q=80');
            background-size: cover;
            background-position: center;
            height: 60vh;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: var(--white);
        }

        .hero-content {
            background-color: rgba(0, 0, 0, 0.6);
            padding: 2rem;
            border-radius: 10px;
        }

        .hero h1 {
            font-size: 3rem;
            margin-bottom: 1rem;
        }

        .hero p {
            font-size: 1.2rem;
            margin-bottom: 2rem;
        }

        .btn {
            display: inline-block;
            background-color: var(--secondary-color);
            color: var(--white);
            padding: 0.75rem 1.5rem;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #219a52;
        }

        main {
            padding: 3rem 0;
        }

        .section {
            margin-bottom: 3rem;
        }

        .section h2 {
            color: var(--primary-color);
            margin-bottom: 1rem;
        }

        .activities {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 2rem;
        }

        .activity-card {
            background-color: var(--white);
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }

        .activity-card:hover {
            transform: translateY(-5px);
        }

        .activity-card img {
            width: 100%;
            height: 200px;
            object-fit: cover;
        }

        .activity-card-content {
            padding: 1.5rem;
        }

        .activity-card h3 {
            color: var(--primary-color);
            margin-bottom: 0.5rem;
        }

        .login-buttons {
            display: flex;
            gap: 0.5rem;
        }

        .login-btn {
            padding: 0.5rem 1rem;
            border: none;
            border-radius: 5px;
            font-size: 0.9rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .student-login {
            background-color: var(--secondary-color);
            color: var(--white);
        }

        .student-login:hover {
            background-color: #219a52;
        }

        .teacher-login {
            background-color: var(--accent-color);
            color: var(--white);
        }

        .teacher-login:hover {
            background-color: #d35400;
        }

        footer {
            background-color: var(--primary-color);
            color: var(--white);
            text-align: center;
            padding: 1rem 0;
            margin-top: 2rem;
        }

        @media (max-width: 768px) {
            .hero h1 {
                font-size: 2rem;
            }

            .hero p {
                font-size: 1rem;
            }

            .activities {
                grid-template-columns: 1fr;
            }
            nav {
                flex-direction: column;
                align-items: flex-start;
            }

            .nav-links, .login-buttons {
                margin-top: 1rem;
            }
        }
    </style>
</head>
<body>
    <header>
        <nav class="container">
            <div class="logo">Evergreen College</div>
            <div class="nav-links">
                <a href="#about">About</a>
                <a href="#activities">Activities</a>
                <a href="#contact">Contact</a>
            </div>
            <div class="login-buttons">
                <a href="studentlogin.jsp"><button class="login-btn student-login">Student Login</button></a>
                <a href="stafflogin.jsp"><button class="login-btn teacher-login">Staff Login</button></a>
            </div>
        </nav>
    </header>

    <section class="hero">
        <div class="hero-content">
            <h1>Welcome to Evergreen College</h1>
            <p>Empowering minds, shaping futures</p>
            <a href="#about" class="btn">Learn More</a>
        </div>
    </section>

    <main class="container">
        <section id="about" class="section">
            <h2>About Evergreen College</h2>
            <p>Evergreen College is a prestigious institution dedicated to providing high-quality education and fostering personal growth. With a rich history spanning over 50 years, we have consistently produced graduates who excel in their chosen fields and make significant contributions to society.</p>
            <p>Our faculty comprises experienced professionals and renowned academics who are committed to nurturing the potential of every student. We offer a wide range of programs across various disciplines, ensuring that our students receive a well-rounded education that prepares them for the challenges of the modern world.</p>
        </section>

        <section id="activities" class="section">
            <h2>College Activities</h2>
            <div class="activities">
                <div class="activity-card">
                    <img src="https://images.unsplash.com/photo-1523240795612-9a054b0db644?auto=format&fit=crop&w=500&q=80" alt="Research Projects">
                    <div class="activity-card-content">
                        <h3>Research Projects</h3>
                        <p>Engage in cutting-edge research across various fields of study.</p>
                    </div>
                </div>
                <div class="activity-card">
                    <img src="https://images.unsplash.com/photo-1511379938547-c1f69419868d?auto=format&fit=crop&w=500&q=80" alt="Music Club">
                    <div class="activity-card-content">
                        <h3>Music Club</h3>
                        <p>Express your musical talents and perform at college events.</p>
                    </div>
                </div>
                <div class="activity-card">
                    <img src="https://images.unsplash.com/photo-1526676037777-05a232554f77?auto=format&fit=crop&w=500&q=80" alt="Sports Teams">
                    <div class="activity-card-content">
                        <h3>Sports Teams</h3>
                        <p>Participate in various sports and compete at collegiate levels.</p>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <footer>
        <div class="container">
            <p>&copy; 2023 Evergreen College. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>