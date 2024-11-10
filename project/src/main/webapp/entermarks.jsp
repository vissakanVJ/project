<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "com.tap.model.*" %>
<%@ page import = "java.util.ArrayList" %>
<%
ArrayList<EnterMarks> list = (ArrayList<EnterMarks>)request.getAttribute("list");
Students st = (Students)request.getAttribute("st");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Marks Entry - Evergreen College</title>
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
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: var(--text-color);
            background-color: var(--background-color);
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }

        .container {
            width: 90%;
            max-width: 800px;
            margin: 0 auto;
            padding: 0 20px;
        }

        header {
            background-color: var(--primary-color);
            color: var(--white);
            padding: 1rem 0;
        }

        .logo {
            font-size: 1.5rem;
            font-weight: bold;
            text-align: center;
        }

        main {
            flex: 1;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 2rem 0;
        }

        .marks-form {
            background-color: var(--white);
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
        }

        .marks-form h1 {
            color: var(--primary-color);
            margin-bottom: 1.5rem;
            text-align: center;
        }

        .student-info {
            margin-bottom: 2rem;
            padding: 1rem;
            background-color: var(--background-color);
            border-radius: 4px;
        }

        .student-info p {
            margin-bottom: 0.5rem;
        }

        .form-group {
            margin-bottom: 1rem;
        }

        .form-group label {
            display: block;
            margin-bottom: 0.5rem;
            color: var(--primary-color);
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 0.75rem;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 1rem;
        }

        .form-group input:focus {
            outline: none;
            border-color: var(--secondary-color);
        }

        .submit-btn {
            width: 100%;
            padding: 0.75rem;
            background-color: var(--secondary-color);
            color: var(--white);
            border: none;
            border-radius: 4px;
            font-size: 1rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .submit-btn:hover {
            background-color: #219a52;
        }

        footer {
            background-color: var(--primary-color);
            color: var(--white);
            text-align: center;
            padding: 1rem 0;
            margin-top: auto;
        }

        @media (max-width: 768px) {
            .marks-form {
                padding: 1.5rem;
            }
        }
    </style>
</head>
<body>
    <header>
        <div class="container">
            <div class="logo">Evergreen College</div>
        </div>
    </header>

    <main>
        <div class="container">
            <form class="marks-form" method="get" action="SetMarks">
                <h1>Student Marks Entry</h1>
                <div class="student-info">
                    <p><strong>Student Name:</strong> <%= st.getStudentName() %></p>
                    <p><strong>Roll Number:</strong> <%= st.getRollNo() %></p>
                    <p><strong>Department:</strong> <%= request.getAttribute("dep") %></p>
                    
                </div>
                <% for(EnterMarks i : list){ %>
                <div class="form-group">
                    <label for="mathematics"><%= i.getSub() %></label>
                    <input type="number" id="mathematics" name="<%= i.getSub() %>" min="0" max="100" required>
                </div>
                <% } %>       
                <button type="submit" class="submit-btn">Submit Marks</button>
            </form>
        </div>
    </main>

    <footer>
        <div class="container">
            <p>&copy; 2023 Evergreen College. All rights reserved.</p>
        </div>
    </footer>
</body>
</html>