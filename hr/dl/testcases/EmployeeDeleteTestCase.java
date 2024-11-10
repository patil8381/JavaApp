import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class EmployeeDeleteTestCase 
{
public static void main(String gg[])
{
try
{
String employeeId=gg[0];
EmployeeDTOInterface employeeDTO=new EmployeeDTO();
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
employeeDAO.delete(employeeId);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}