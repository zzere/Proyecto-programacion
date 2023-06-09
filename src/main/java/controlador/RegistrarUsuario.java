/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.DAOInformanteImplementacion;
import modelo.Informante;


@WebServlet(name = "registrarusuario", urlPatterns = {"/registrarusuario"})
public class RegistrarUsuario extends HttpServlet {

    DAOInformanteImplementacion dao = new DAOInformanteImplementacion();
    Informante informante;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            int id = Integer.parseInt(request.getParameter("txtId"));
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            String correo = request.getParameter("txtCorreo");
            String contraseña = request.getParameter("txtContraseña");
            String telefono = request.getParameter("txtTelefono");
            String genero = request.getParameter("txtGenero");
            int edad = Integer.parseInt(request.getParameter("txtedad"));
            informante = new Informante(apellido, correo, edad, id, nombre, apellido, correo, contraseña);
            informante.setTelefono(telefono);
            informante.setGenero(genero);
            informante.setEdad(edad);
            dao.registrar(informante);
            
            
            //Se redirecciona a usuario
            request.getRequestDispatcher("homeForm.html").forward(request, response);

            
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
        processRequest(request, response);
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
        processRequest(request, response);
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
