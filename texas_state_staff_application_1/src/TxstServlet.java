import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TxstServlet")
public class TxstServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String action = request.getParameter("fromPage");
        String url = "";



        if(action.equals("addEmployee")){
            String sfName = request.getParameter("firstName");
            String slName = request.getParameter("lastName");
            Integer smonthlySalary = Integer.valueOf(request.getParameter("monthlySalary"));
            Integer smonthsOfPayment = Integer.valueOf(request.getParameter("monthsOfPayment"));
            Double sYearlySalary = Employee.CalculateYearlySalary(smonthlySalary, smonthsOfPayment);

            Employee emp1 = new Employee(sfName,slName,smonthlySalary,smonthsOfPayment,sYearlySalary);
            request.setAttribute("myEmployee", emp1);
            url="/employeeOutput.jsp";
        }

        //Second form to take you to end page
        if(action.equals("end")){
            url="/welcome.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request,response);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
