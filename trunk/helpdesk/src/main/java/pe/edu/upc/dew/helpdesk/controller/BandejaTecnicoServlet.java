package pe.edu.upc.dew.helpdesk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pe.edu.upc.dew.helpdesk.model.Ticket;
import pe.edu.upc.dew.helpdesk.service.BandejaTecnicoService;

public class BandejaTecnicoServlet extends HttpServlet {

    private BandejaTecnicoService pBandejaTecnicoService;

    @Override
    public void init(ServletConfig config) throws ServletException {

        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());

        this.pBandejaTecnicoService = (BandejaTecnicoService) context.getBean("bandejaTecnicoService");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        // aqui deberia obtener el numero de ticket
        String vIdTicket = request.getParameter("idticket");

        // Llamar al model
        Ticket vTicket = pBandejaTecnicoService.ObtenerTicket(vIdTicket);

        // Setear el model para el view
        session.setAttribute("ticket", vTicket);

        request.getRequestDispatcher("DetalleTicket_Tecnico.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        } finally {
            out.close();
        }
    }
}
