<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "com.tap.model.Students" %>
<%@ page import = "com.tap.model.DisplayMarks" %>
<%@ page import = "java.util.ArrayList" %>
<%
    Students st = (Students) request.getAttribute("student");
    ArrayList<DisplayMarks> list = (ArrayList<DisplayMarks>)request.getAttribute("mk");
%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .student-profile {
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            overflow: hidden;
        }
        .student-header {
            background-color: #3498db;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        .student-header h1 {
            margin: 0;
            font-size: 24px;
        }
        .student-details {
            padding: 20px;
        }
        .detail-row {
            display: flex;
            justify-content: space-between;
            margin-bottom: 10px;
        }
        .detail-label {
            font-weight: bold;
            flex-basis: 40%;
        }
        .detail-value {
            flex-basis: 60%;
        }
        .marks-section {
            margin-top: 20px;
        }
        .marks-section h2 {
            color: #3498db;
            border-bottom: 2px solid #3498db;
            padding-bottom: 10px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f8f8f8;
        }
        @media (max-width: 600px) {
            .detail-row {
                flex-direction: column;
            }
            .detail-label, .detail-value {
                flex-basis: 100%;
            }
            th, td {
                padding: 8px;
            }
        }
    </style>
</head>
<body>
    <div class="student-profile">
        <header class="student-header">
            <h1>Student Profile</h1>
        </header>
        <main class="student-details">
            <section class="personal-info">
                <div class="detail-row">
                    <span class="detail-label">Name:</span>
                    <span class="detail-value"><%= st.getStudentName() %></span>
                </div>
                <div class="detail-row">
                    <span class="detail-label">Student ID:</span>
                    <span class="detail-value"><%= st.getRollNo() %></span>
                </div>
                <div class="detail-row">
                    <span class="detail-label">Date of Birth:</span>
                    <span class="detail-value"><%= st.getDob() %></span>
                </div>
                <div class="detail-row">
                    <span class="detail-label">Department:</span>
                    <span class="detail-value"><%= request.getAttribute("dep") %></span>
                </div>
                <div class="detail-row">
                    <span class="detail-label">Phone:</span>
                    <span class="detail-value"><%= st.getContactno() %></span>
                </div>
            </section>
            <% if(list == null){ %>
            <a href="EnterMark?dep=<%=  request.getAttribute("dep") %>"> <button>Enter Marks</button></a>
            <% }else{ %>
            <section class="marks-section">            
                <h2>Academic Performance</h2>
                <table>
                    <thead>
                        <tr>
                            <th>Subject</th>
                            <th>Marks Obtained</th>
                            <th>Total Marks</th>
                            <th>Semester</th>
                        </tr>
                    </thead>
                    <tbody>
                    <% for(DisplayMarks i : list){ %>
                        <tr>
                            <td><%= i.getSubName() %></td>
                            <td><%= i.getMarks() %></td>
                            <td>100</td>
                            <td><%= i.getSem()%></td>
                        </tr>
                    <% } %>
                        
                    </tbody>
                </table>
            </section>
            <% } %>
        </main>
    </div>
</body>
</html>