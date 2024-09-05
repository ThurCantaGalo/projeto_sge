/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Professores;
import model.dao.ProfessoresDAO;

/**
 *
 * @author Senai
 */
@WebServlet(name = "ProfessoresController", urlPatterns = {"/ProfessoresController","/login","/home","/cadastrar"})
public class ProfessoresController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProfessoresController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProfessoresController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String paginaAtual = request.getServletPath();
       
       
       if(paginaAtual.equals("/login")){
     
       request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
       }
       
       if(paginaAtual.equals("/home")){
       
       request.getRequestDispatcher("WEB-INF/jsp/home.jsp").forward(request, response);
       }
       
       if(paginaAtual.equals("/cadastrar")){
       
       request.getRequestDispatcher("WEB-INF/jsp/cadastrar.jsp").forward(request, response);
       }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String paginaAtual = request.getServletPath();
        Professores profs = new Professores();
       ProfessoresDAO pdao = new ProfessoresDAO();
    
    if(paginaAtual.equals("/login")){
    
    profs.setCpf(request.getParameter("cpf"));
    profs.setSenha(request.getParameter("senha"));
    
    profs = pdao.validarLogin(profs);
    
    if(profs.getId_professor()>0){
    response.sendRedirect("./home");
    
    }else{
    response.sendRedirect("./login");
    }
        
    }
    
    if(paginaAtual.equals("/cadastrar")){
     Professores novoProf = new Professores();
            
            novoProf.setNome(request.getParameter("nome"));
            novoProf.setMatricula(request.getParameter("matricula"));
            novoProf.setAdmissao(Date.valueOf(request.getParameter("admissao")));
            novoProf.setCpf(request.getParameter("matricula"));
            novoProf.setSenha(request.getParameter("senha"));
            novoProf.setSenha(request.getParameter("senha"));           
            
            UsuariosDAO usuarios = new UsuariosDAO();
            usuarios.cadastrarUsuario(novoUser);
            
            response.sendRedirect("Login");
         
     }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
