//package com.cms.controller;
//
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//import java.sql.*;
//
//public class LoginServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String role = request.getParameter("role");
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/cms_db", "root", "password");
//
//            String sql = "SELECT * FROM " + role + " WHERE username=? AND password=?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, username);
//            ps.setString(2, password);
//
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                if (role.equals("admin"))
//                    response.sendRedirect("admin.jsp");
//                else if (role.equals("student"))
//                    response.sendRedirect("student.jsp");
//                else
//                    response.sendRedirect("faculty.jsp");
//            } else {
//                response.getWriter().println("Invalid Login");
//            }
//
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
