
package mus;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConsultarInventario")
public class ConsultarInventarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new Producto(1, "Esmalte Azul", 5, "Esmalte De Uñas Azul"));
        inventario.agregarProducto(new Producto(2, "Esmalte Rojo", 10, "Esmalte De Uñas Rojo"));

        List<Producto> productos = inventario.obtenerProductos();

        response.setContentType("text/plain");
        for (Producto producto : productos) {
            response.getWriter().println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
        }
    }
}

