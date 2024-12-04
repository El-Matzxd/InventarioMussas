
package mus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrarProducto")
public class RegistrarProductoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        String descripcion = request.getParameter("descripcion");

        Producto producto = new Producto(id, nombre, cantidad, descripcion);

        // Simulacion: Registrar Producto En La Bd
        System.out.println("Producto Registrado: " + producto.getNombre());
        response.getWriter().println("Producto Registrado Exitosamente");
    }
}
